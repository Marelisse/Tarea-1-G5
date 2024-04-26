package com.example;

import com.example.Exeptions.NoHayProductoException;
import com.example.Exeptions.PagoIncorrectoException;
import com.example.Exeptions.PagoInsuficienteException;

class Comprador{
    private int vuelto;
    private String sonido;
    public Comprador(Moneda m, int queproducto, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{
        Moneda n = exp.getVuelto();
        Producto p = exp.comprarProducto(m, queproducto);
        this.vuelto = 0;

        while(n!=null){
            this.vuelto += n.getValor();
            n = exp.getVuelto();
        }
        if(p==null){
            sonido = null;
        }else{
            sonido = p.consumir();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}