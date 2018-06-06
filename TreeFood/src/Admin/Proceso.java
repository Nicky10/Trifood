/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Foods.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Proceso {

    private List a = new List();

    public Proceso() {
    }

    public Proceso(List a) {
        this.a = a;
    }

    public void agregarRegistro(Node p) {
        this.a.insertAtBegin(p);
    }

    public void modificarRegistro(int i, Node p) {
        this.a.updateAdmin(i, p);
    }

    public void eliminarRegistro(int i) {
        this.a.deleteAtPosition(i);
    }

    public Node obtenerRegistro(int i) {
        return a.searchByPosition(i);
    }

    public int cantidadRegistro() {
        return this.a.Length();
    }

    public int buscaId(int codigo) {
        for (int i = 0; i < cantidadRegistro(); i++) {
            if (codigo == obtenerRegistro(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public String buscaUsuario(String usuario) {
        for (int i = 0; i < cantidadRegistro(); i++) {
            if (usuario == obtenerRegistro(i).getUsuario()) {
                return "encontrado";
            }
        }
        return null;
    }

    public String buscaContraseña(String usuario) {
        for (int i = 0; i < cantidadRegistro(); i++) {
            if (usuario == obtenerRegistro(i).getContraseña()) {
                return "encontrado";
            }
        }
        return null;
    }

}
