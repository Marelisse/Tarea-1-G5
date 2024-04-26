package com.example;

enum LosProductos{
    SNICKERS(1100),
    SUPER8(900),
    COCACOLA(1100),
    SPRITE(900),
    FANTA(800);

    private final int precio;

    LosProductos(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}
