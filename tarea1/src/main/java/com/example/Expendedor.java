package com.example;

import com.example.Exeptions.NoHayProductoException;
import com.example.Exeptions.PagoIncorrectoException;
import com.example.Exeptions.PagoInsuficienteException;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> vueltoM;
    private int cuantocuesta; //Corregir Precios y número de producto cuando la numeración este terminada

    public Expendedor(int cuantas) {
        this.coca = new Deposito<Bebida>();
        this.sprite = new Deposito<Bebida>();
        this.fanta = new Deposito<Bebida>();
        this.snickers = new Deposito<Dulce>();
        this.super8 = new Deposito<Dulce>();

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

    public Producto comprarProducto(Moneda m, int cual) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        if(m == null) {
            throw new PagoIncorrectoException("Moneda no valida");
        }
        Producto p = null;

        switch (cual) {
            case 1:
                cuantocuesta = LosProductos.SNICKERS.getPrecio();
                if(m.getValor() >= cuantocuesta){
                    p=(Dulce)snickers.get();
                }
                break;
            case 2:
                cuantocuesta = LosProductos.SUPER8.getPrecio();
                if(m.getValor() >= cuantocuesta){
                    p=(Dulce)super8.get();
                }
                break;
            case 3:
                cuantocuesta = LosProductos.COCACOLA.getPrecio();
                if(m.getValor() >= cuantocuesta){
                    p=(Bebida)coca.get();
                }
                break;
            case 4:
                cuantocuesta = LosProductos.SPRITE.getPrecio();
                if(m.getValor() >= cuantocuesta){
                    p=(Bebida)sprite.get();
                }
                break;
            case 5:
                cuantocuesta = LosProductos.FANTA.getPrecio();
                if(m.getValor() >= cuantocuesta){
                    p=(Bebida)fanta.get();
                }
                break;
            default:
                break;
        }

        if(p == null){
            vueltoM.add(m);
            throw new NoHayProductoException("El deposito esta vacio");
        }else if(m.getValor() < cuantocuesta){
            vueltoM.add(m);
            p = null;
            throw new PagoInsuficienteException("Dinero insuficiente");
        } else if (m.getValor() >= cuantocuesta){

            int cantMonedas100 = (m.getValor() - cuantocuesta) / 100;


            for (int i = 0; i < cantMonedas100; i++) {
                Moneda sobrante = new Moneda100();
                vueltoM.add(sobrante);

            }
        }
        return p;
    }
}