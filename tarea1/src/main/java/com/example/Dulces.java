package tarea1.src.main.java.com.example;

abstract class Dulce implements Producto{

    private int serie;
    public Dulce(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
}
public enum Dulces{
    SNICKERS,
    SUPER8;
}

class Snickers extends Dulce{
    public Snickers(int serie){
        super(serie);
    }
    public String consumir(){
        return "Snickers";
    }
}
class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String consumir(){
        return "Super8";
    }
}
