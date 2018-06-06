/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurants;

import Foods.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class RestaurantProcess {

    private List a = new List();

    public RestaurantProcess() {
    }

    public RestaurantProcess(List a) {
        this.a = a;
    }

    public void agregarRegistro(Restaurant_Node p) {
        this.a.insertAtEnd(p);
    }

    public void modificarRegistro(int i, Restaurant_Node p) {
        this.a.updateRestaurant(i, p);
    }

    public void eliminarRegistro(int i) {
        this.a.deleteAtPosition(i);
    }

    public Restaurant_Node obtenerRegistro(int i) {
        return a.searchByPosition(i);
    }

    public int cantidadRegistro() {
        return this.a.Length();
    }

    public int buscaId(int Id) {
        int respuesta = -1;
        for (int i = 0; i < this.cantidadRegistro(); i++) {
            if (this.obtenerRegistro(i).getId() == Id) {
                respuesta = i;
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {
        RestaurantProcess pr = new RestaurantProcess();
        Restaurant_Node p = new Restaurant_Node(1, 4, "", "", null);
        Restaurant_Node s = new Restaurant_Node(2, 5, "", "", null);
        pr.agregarRegistro(p);
        pr.agregarRegistro(s);
        System.out.println(pr.cantidadRegistro());
//        System.out.println(pr.obtenerRegistro(0).toString());
        for (int i = 0; i < pr.cantidadRegistro(); i++) {
            System.out.println(pr.obtenerRegistro(i).toString());
        }
        System.out.println(pr.buscaId(2));
    }

}
