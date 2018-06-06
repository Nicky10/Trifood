package Restaurants;

import java.io.Serializable;

public class Restaurant_Node implements Serializable {

    public int Id, Calificacion;
    public String Detalles, Nombre;
    public String foto;

    Restaurant_Node next;

    public Restaurant_Node(int Id, int Calificacion, String Detalles, String Nombre, String foto) {
        this.Id = Id;
        this.Calificacion = Calificacion;
        this.Detalles = Detalles;
        this.Nombre = Nombre;
        this.foto = foto;
    }

    public Restaurant_Node() {
    }

    public Restaurant_Node clone() {
        return new Restaurant_Node(this.Id, this.Calificacion, this.Detalles, this.Nombre, this.foto);

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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return Id + "," + Calificacion + "," + Detalles + "," + Nombre + "," + foto + "\n";
    }

}
