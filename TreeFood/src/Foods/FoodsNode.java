package Foods;

public class FoodsNode {

    public int Id, Calificacion;
    public String Detalles, Nombre;
    public double Precio;
    public String foto;

    FoodsNode next;

    public FoodsNode(int Id, String Detalles, String Nombre, double Precio, String foto, int Calificacion) {
        this.Id = Id;
        this.Detalles = Detalles;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.foto = foto;
        this.Calificacion = Calificacion;
    }

    @Override
    public String toString() {
        return Id + "," + Detalles + "," + Nombre + "," + Precio + "," + foto + "," + Calificacion + "\n";
    }

    public FoodsNode() {
    }

    public FoodsNode clone() {
        return new FoodsNode(this.Id, this.Detalles, this.Nombre, this.Precio, this.foto, this.Calificacion);
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

}
