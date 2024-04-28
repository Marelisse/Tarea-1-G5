package com.example;

import com.example.Exeptions.NoHayProductoException;
import com.example.Exeptions.PagoIncorrectoException;
import com.example.Exeptions.PagoInsuficienteException;

class Comprador{
    private int vuelto;
    private String sonido;
    public Comprador(Moneda m, int queproducto, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{
        Producto p = exp.comprarProducto(m, queproducto);

        if(p==null){
            sonido = null;
        }else{
            sonido = p.consumir();
        }

        vuelto = 0;

        for(int i = 0; i <exp.getVuelto(); i++){
            vuelto += 100;
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}