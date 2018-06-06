package Foods;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class List {

    FoodsNode head = null;

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void printList() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        FoodsNode temp = head;

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

    public void insertAtBegin(FoodsNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(FoodsNode newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            FoodsNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAtPosition(FoodsNode newNode, int position) {
        FoodsNode prev = head;
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
            FoodsNode prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            FoodsNode temp = prev.next;
            FoodsNode aft = temp.next;
            prev.next = aft;
            temp = null;
            System.gc();
        }
    }

    public void deleteAtBegin() {
        FoodsNode temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }

    public void deleteAtEnd() {
        FoodsNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.gc();
    }

    public FoodsNode searchByPosition(int position) {
        FoodsNode temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public FoodsNode searchByFood(String name) {
        FoodsNode temp = head;
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

    public FoodsNode searchById_(int Id) {
        FoodsNode temp = null;
        for (int i = 0; i < this.Length(); i++) {
            if (this.searchByPosition(i).getId() == Id) {
                temp = this.searchByPosition(i);
            }
        }
        return temp;
    }

    public void updateFoods(int Id, FoodsNode newNode) {
        FoodsNode temp = this.searchById_(Id);
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
            FoodsNode temp = this.head;
            int counter = 1;
            while (temp.next != null) {
                temp = temp.next;
                counter++;
            }
            return counter;
        }
    }

}
