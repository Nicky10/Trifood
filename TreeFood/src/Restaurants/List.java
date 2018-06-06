package Restaurants;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Estudiante
 */
public class List 
{

    Node head = null;

    public boolean isEmpty() 
    {
        return head == null ? true : false;
    }

    public void printList() throws IOException 
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Node temp = head;

        try {
            bw.write("Grades: \n");
            while (temp != null) 
            {
                bw.write(temp.toString());
                temp = temp.next;

            }
            bw.flush();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

    }

    public void insertAtBegin(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) 
        {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAtPosition(Node newNode, int position) 
    {
        Node prev = head;
        for (int i = 0; i < position - 1; i++) 
        {
            prev = prev.next;
        }
        
        newNode.next = prev.next;
        prev.next = newNode;        
    }

    public void deleteAtPosition(int position) 
    {
        Node prev = head;
        for (int i = 0; i < position - 1; i++) 
        {
            prev = prev.next;
        }
        Node temp = prev.next;
        Node aft = temp.next;
        prev.next = aft;
        temp = null;
        System.gc();

    }

    public void deleteAtBegin() 
    {
        Node temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    public void deleteAtEnd() 
    {
        Node temp = head;

        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        System.gc();
    }
    
    public Node searchByPosition(int position)
    {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public Node searchByRestaurant(String name)
    {
        Node temp = head;
        while(temp.Nombre != name) {
            temp = temp.next;
        }
        return temp;
    }
    
    public int searchById(int Id)
    {
        int respuesta = -1;
        for (int i = 0; i < this.Length() - 1; i++) {
            if (this.searchByPosition(i).getId() == Id){
                respuesta=i;
            }
        }
        return respuesta;
    }
    
    public Node searchById_(int Id)
    {
        Node temp = null;
        for (int i = 0; i < this.Length() - 1; i++) {
            if (this.searchByPosition(i).getId() == Id){
                temp = this.searchByPosition(i);
            }
        }
        return temp;
    }
    
    public void updateRestaurant(int Id, Node newNode)
    {
        Node temp = this.searchById_(Id);
        temp.Detalles = newNode.Detalles;
        temp.Id = newNode.Id;
        temp.Nombre = newNode.Nombre;
        temp.Calificacion = newNode.Calificacion;
        temp.foto = newNode.foto;
    }
    
    public int Length()
    {
        Node temp = this.head;
        int counter = 1;
        while(temp.next != null)
        {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

}
