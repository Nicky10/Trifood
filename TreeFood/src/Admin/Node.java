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
    public String Usuario, Contraseña;
    
    Node next;

    public Node(int Id, String Usuario, String Contraseña) {
        this.Id = Id;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public Node() {}
    
    public Node clone()
    {
         return  new Node(this.Id,this.Usuario,this.Contraseña);
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
