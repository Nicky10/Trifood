package Restaurants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

/**
 * 
 * @author Estudiante
 */
public class Node implements Serializable
{
    public int Id, Calificacion;
    public String Detalles, Nombre;
    public byte[] foto;
    
    Node next;

    public Node(int Id, int Calificacion, String Detalles, String Nombre, byte[] foto) {
        this.Id = Id;
        this.Calificacion = Calificacion;
        this.Detalles = Detalles;
        this.Nombre = Nombre;
        this.foto = foto;
    }

    
    public Node() {
    }
    
    public Node clone()
    {
         return  new Node(this.Id, this.Calificacion,this.Detalles,this.Nombre, this.foto);
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCalificación() {
        return Calificacion;
    }

    public void setCalificación(int calificación) {
        this.Calificacion = calificación;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
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
    
    
}
