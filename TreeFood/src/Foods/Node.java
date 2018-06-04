package Foods;

import Restaurants.*;

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
        this.Nombre = Nombre;
        this.Detalles = Detalles;
        this.Precio = Precio;
    }
    
    public Node() {}
    
    public Node clone()
    {
         return  new Node(this.Detalles,this.Nombre,this.Precio);
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
