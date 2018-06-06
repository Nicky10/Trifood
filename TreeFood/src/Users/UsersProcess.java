/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Restaurants.*;
import Foods.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class UsersProcess {

    private List a = new List();

    public UsersProcess() {
    }

    public UsersProcess(List a) {
        this.a = a;
    }

    public void agregarRegistro(UsersNode p) {
        this.a.insertAtBegin(p);
    }

    public void modificarRegistro(int i, UsersNode p) {
        this.a.updateUsers(i, p);
    }

    public void eliminarRegistro(int i) {
        this.a.deleteAtPosition(i);
    }

    public UsersNode obtenerRegistro(int i) {
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

}
