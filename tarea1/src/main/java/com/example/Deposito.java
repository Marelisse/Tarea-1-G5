package tarea1.src.main.java.com.example;
class Deposito<T> {
    private ArrayList<T> almacen;

    public Deposito() {
        almacen = new ArrayList<T>();
    }

    public void add(T t) {
        almacen.add(t);
    }
    public T get() {
        if(almacen.size() != 0) {
            return almacen.remove(0);
        }
        return null;
    }
}
