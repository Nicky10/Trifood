package Food_Restaurant;

import Admin.*;
import Restaurants.*;
import Foods.*;


/**
 * 
 * @author Estudiante
 */
public class Node
{
    public int Id_Food, Id_Restaurant;
    Node next;
    
    public Node() {}

    public Node(int Id_Food, int Id_Restaurant) {
        this.Id_Food = Id_Food;
        this.Id_Restaurant = Id_Restaurant;
    }
    
    public Node clone()
    {
         return  new Node(this.Id_Food,this.Id_Restaurant);
        
    }

    public int getId_Food() {
        return Id_Food;
    }

    public void setId_Food(int Id_Food) {
        this.Id_Food = Id_Food;
    }

    public int getId_Restaurant() {
        return Id_Restaurant;
    }

    public void setId_Restaurant(int Id_Restaurant) {
        this.Id_Restaurant = Id_Restaurant;
    }
    
}
