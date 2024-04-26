package com.example;

class Comprador{
    private int vuelto;
    private String sonido;
    public Comprador(Moneda m, int queproducto, Expendedor exp){
        Moneda n = exp.getVuelto();
        Producto p = exp.comprar(m, queproducto);
        this.vuelto = 0;

        while(n!=null){
            this.vuelto += n.getValor();
            n = exp.getVuelto();
        }
        //aquí deberían ir la excepción cuando no hay producto
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}