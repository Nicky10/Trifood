package Users;

import Restaurants.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Estudiante
 */
public class List {

    UsersNode head = null;

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        UsersNode temp = head;

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

    public void insertAtBegin(UsersNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(UsersNode newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            UsersNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAtPosition(UsersNode newNode, int position) {
        UsersNode prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void deleteAtPosition(int position) {
        UsersNode prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }
        UsersNode temp = prev.next;
        UsersNode aft = temp.next;
        prev.next = aft;
        temp = null;
        System.gc();

    }

    public void deleteAtBegin() {
        UsersNode temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    public void deleteAtEnd() {
        UsersNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.gc();
    }

    public UsersNode searchByPosition(int position) {
        UsersNode temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public UsersNode searchByUser(String name) {
        UsersNode temp = head;
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

    public UsersNode searchById_(int Id) {
        UsersNode temp = null;
        for (int i = 0; i < this.Length(); i++) {
            if (this.searchByPosition(i).getId() == Id) {
                temp = this.searchByPosition(i);
            }
        }
        return temp;
    }

    public void updateUsers(int Id, UsersNode newNode) {
        UsersNode temp = this.searchById_(Id);
        temp.Apellido = newNode.Apellido;
        temp.Id = newNode.Id;
        temp.Nombre = newNode.Nombre;
        temp.Contraseña = newNode.Contraseña;
    }

    public int Length() {
        if (isEmpty()) {
            return 0;
        } else {
            UsersNode temp = this.head;
            int counter = 1;
            while (temp.next != null) {
                temp = temp.next;
                counter++;
            }
            return counter;
        }
    }

}
