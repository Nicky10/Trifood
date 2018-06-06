package Foods;

public class FoodsProcess {

    private List a = new List();

    public FoodsProcess() {
    }

    public FoodsProcess(List a) {
        this.a = a;
    }

    public void agregarRegistro(FoodsNode p) {
        this.a.insertAtBegin(p);
    }

    public void modificarRegistro(int i, FoodsNode p) {
        this.a.updateFoods(i, p);
    }

    public void eliminarRegistro(int i) {
        this.a.deleteAtPosition(i);
    }

    public FoodsNode obtenerRegistro(int i) {
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

}
