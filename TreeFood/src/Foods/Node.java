package Foods;

import Restaurants.*;
import java.io.Serializable;

/**
 * 
 * @author Estudiante
 */
public class Node implements Serializable
{
    public int Id, Calificacion;
    public String Detalles, Nombre;
    public double Precio;
    public byte[] foto;
    
    Node next;

    public Node(int Id, String Detalles, String Nombre, double Precio, byte[] foto, int Calificacion) {
        this.Id = Id;
        this.Detalles = Detalles;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.foto = foto;
        this.Calificacion = Calificacion;
    }

    
    
    public Node() {}
    
    public Node clone()
    {
         return  new Node(this.Id,this.Detalles,this.Nombre,this.Precio, this.foto, this.Calificacion);
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
    
    
}
