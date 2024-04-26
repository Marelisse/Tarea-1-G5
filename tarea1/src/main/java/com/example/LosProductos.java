package com.example;

enum LosProductos{
    SNICKERS(1),
    SUPER8(2),
    COCACOLA(3),
    SPRITE(4),
    FANTA(5);

    private int precio;
    private final int num;

    LosProductos(int num){
        this.num = num;
    }

    public int getPrecio(){
        switch (num) {
            case 1:
                precio = 1100;
                break;
            case 2:
                precio = 900;
                break;
            case 3:
                precio = 1100;
                break;
            case 4:
                precio = 900;
                break;
            case 5:
                precio = 800;
                break;
            default:
                break;
        }
        return precio;
    }
    public int getNumero(){
        return num;
    }
}
