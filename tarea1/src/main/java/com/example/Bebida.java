package com.example;

abstract class Bebida extends Producto{
    public Bebida(int serie) {
        super(serie);
    }
}
class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }
    public String consumir() {
        return "sprite";
    }
}
class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }
    public String consumir() {
        return "cocacola";
    }
}
class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie);
    }
    public String consumir() {
        return "fanta";
    }
}