package Users;


import Restaurants.*;
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
        return temp.next;
    }
    
    public Node searchByUser(String name)
    {
        Node temp = head;
        while(temp.Usuario != name) {
            temp = temp.next;
        }
        return temp.next;
    }
    

}
