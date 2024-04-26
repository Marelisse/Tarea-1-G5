package tarea1.src.main.java.com.example;

abstract class Dulce extends Producto{
    public Dulce(int serie){
        super(serie);
    }
    public enum Dulces{
        SNICKERS,
        SUPER8;
    }
}
class Snickers extends Dulce{
    public Snickers(int serie){
        super(serie);
    }
    public String consumir(){
        return "snickers";
    }
}
class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String consumir(){
        return "super8";
    }
}
