package com.example;

import com.example.Exeptions.NoHayProductoException;
import com.example.Exeptions.PagoIncorrectoException;
import com.example.Exeptions.PagoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c = null;

        m = new Moneda1500();
        try {
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        System.out.println(c.queConsumiste() + ", "+ c.cuantoVuelto());

        m = new Moneda1500();
        try {
            c = new Comprador(m, 2, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        System.out.println(c.queConsumiste() + ", "+ c.cuantoVuelto());

        m = new Moneda1500();
        try {
            c = new Comprador(m, 3, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        System.out.println(c.queConsumiste() + ", "+ c.cuantoVuelto());
    }
}