package Restaurants;

/**
 * 
 * @author Estudiante
 */
public class Node
{
    public int Id;
    public String Detalles, Nombre;
    public double Precio;
    
    Node next;

    public Node(String Detalles, String Nombre, double Precio) {
        this.Detalles = Detalles;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    
    
    public Node() {
    }
    
    public Node clone()
    {
         return  new Node(this.Detalles,this.Nombre, this.Precio);
        
    }
    
}
