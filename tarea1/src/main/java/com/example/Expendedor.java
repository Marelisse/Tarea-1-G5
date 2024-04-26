package com.example;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> vueltoM;
    private int precio; //Corregir Precios y número de producto cuando la numeración este terminada
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    public static final int  FANTA=3;
    public static final int  SNICKERS=4;
    public static final int  SUPER8=5;

    public Expendedor(int cuantas, int precio) {
        this.coca = new Deposito<Bebida>();
        this.sprite = new Deposito<Bebida>();
        this.fanta = new Deposito<Bebida>();
        this.snickers = new Deposito<Dulce>();
        this.super8 = new Deposito<Dulce>();
        this.precio = precio;

        for (int i = 0; i < cuantas; i++) {
            coca.add(new CocaCola(i));
            sprite.add(new Sprite(cuantas + i));
            fanta.add(new Fanta(2*cuantas + i));
            snickers.add(new Snickers(3*cuantas + i));
            super8.add(new Super8(4*cuantas + i));
        }
        this.vueltoM = new Deposito<Moneda>();
    }
    public Moneda getVuelto(){
        return (Moneda)vueltoM.get();
    }

    public Producto comprar(Moneda m, int cual) {
        if(m == null) {
            return null;
        }
        Producto p = null;
        if(cual == 1 && m.getValor() >= precio) {
            p = (Bebida)coca.get();
        } else if (cual == 2 && m.getValor() >= precio) {
            p = (Bebida)sprite.get();
        }
        else if (cual == 3 && m.getValor() >= precio) {
            p = (Bebida)fanta.get();
        }
        else if (cual == 4 && m.getValor() >= precio) {
            p = (Dulce)snickers.get();
        }
        else if (cual == 5 && m.getValor() >= precio) {
            p = (Dulce)super8.get();
        }

        if(p == null){
            vueltoM.add(m);
        }else if(m.getValor() < precio){
            vueltoM.add(m);
            p = null;
        } else if (m.getValor() >= precio){

            int cantMonedas100 = (m.getValor() - precio) / 100;


            for (int i = 0; i < cantMonedas100; i++) {
                Moneda sobrante = new Moneda100();
                vueltoM.add(sobrante);

            }
        }
        return p;
    }
}