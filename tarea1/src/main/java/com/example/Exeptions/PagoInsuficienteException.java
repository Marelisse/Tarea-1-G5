package com.example.Exeptions;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
