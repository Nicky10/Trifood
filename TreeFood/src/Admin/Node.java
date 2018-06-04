package Admin;

import Admin.*;
import Restaurants.*;

/**
 * 
 * @author Estudiante
 */
public class Node
{
    public int Id;
    public String Nombre, Apellido, Usuario, Contraseña;
    
    Node next;

    public Node(String Nombre, String Apellido, String Usuario, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public Node() {}
    
    public Node clone()
    {
         return  new Node(this.Nombre,this.Apellido,this.Usuario,this.Contraseña);
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
}
