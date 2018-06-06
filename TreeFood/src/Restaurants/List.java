package Restaurants;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Estudiante
 */
public class List {

    Restaurant_Node head = null;

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Restaurant_Node temp = head;

        try {
            bw.write("Grades: \n");
            while (temp != null) {
                bw.write(temp.toString());
                temp = temp.next;

            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void insertAtBegin(Restaurant_Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Restaurant_Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Restaurant_Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtPosition(Restaurant_Node newNode, int position) {
        Restaurant_Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (this.Length() == 1 && position == 0) {
            head = null;
        } else {
            Restaurant_Node prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            Restaurant_Node temp = prev.next;
            Restaurant_Node aft = temp.next;
            prev.next = aft;
            temp = null;
            System.gc();
        }
    }

    public void deleteAtBegin() {
        Restaurant_Node temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    public void deleteAtEnd() {
        Restaurant_Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.gc();
    }

    public Restaurant_Node searchByPosition(int position) {
        Restaurant_Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Restaurant_Node searchByRestaurant(String name) {
        Restaurant_Node temp = head;
        while (temp.Nombre != name) {
            temp = temp.next;
        }
        return temp;
    }

    public int searchById(int Id) {
        int respuesta = -1;
        for (int i = 0; i < this.Length(); i++) {
            if (this.searchByPosition(i).getId() == Id) {
                respuesta = i;
            }
        }
        return respuesta;
    }

    public Restaurant_Node searchById_(int Id) {
        Restaurant_Node temp = null;
        for (int i = 0; i < this.Length(); i++) {
            if (this.searchByPosition(i).getId() == Id) {
                temp = this.searchByPosition(i);
            }
        }
        return temp;
    }

    public void updateRestaurant(int Id, Restaurant_Node newNode) {
        Restaurant_Node temp = this.searchById_(Id);
        temp.Detalles = newNode.Detalles;
        temp.Id = newNode.Id;
        temp.Nombre = newNode.Nombre;
        temp.Calificacion = newNode.Calificacion;
        temp.foto = newNode.foto;
    }

    public int Length() {
        if (isEmpty()) {
            return 0;
        } else {
            Restaurant_Node temp = this.head;
            int counter = 1;
            while (temp.next != null) {
                temp = temp.next;
                counter++;
            }
            return counter;
        }
    }

}
