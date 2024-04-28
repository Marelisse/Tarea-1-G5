package com.example;

import com.example.Exeptions.NoHayProductoException;
import com.example.Exeptions.PagoIncorrectoException;
import com.example.Exeptions.PagoInsuficienteException;

public class Main {
    public static void main(String[] args) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(2);
        Comprador c = null; 
        Moneda m = null;

        try {
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        try {
            m = new Moneda100();
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        try {
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        try {
            m = null;
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        try {
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }


    }
}