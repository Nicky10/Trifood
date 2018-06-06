/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Foods;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Proceso {
    
    private List a = new List();
    
    public Proceso(){}
    
    public Proceso(List a){
        this.a = a;
    }
    
    public void agregarRegistro(Node p){
        this.a.insertAtBegin(p);
    }

    public void modificarRegistro(int i, Node p){
        this.a.updateFood(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.deleteAtPosition(i);
    }
    
    public Node obtenerRegistro(int i){
        return a.searchByPosition(i);
    }
    
    public int cantidadRegistro(){
        return this.a.Length();
    }
    
    public int buscaId(int codigo){
        
        int respuesta = -1;
        int i = 0;
        while(i < this.cantidadRegistro()){
            if(obtenerRegistro(i).Id == codigo)
                respuesta = i;
            i++;
        }
        return respuesta;
    }
        
    
    
    public static void main(String[] args)
    {
        Proceso pr = new Proceso();
        Node p = new Node(1, "Hamburguesa","Bonito",2500, null,4 );
        Node s = new Node(2, "Hamburguesa","Bonito",2500, null,4 );
        pr.agregarRegistro(p);
        pr.agregarRegistro(s);
        System.out.println(pr.cantidadRegistro());
        System.out.println(pr.buscaId(1));
    }
    
}
