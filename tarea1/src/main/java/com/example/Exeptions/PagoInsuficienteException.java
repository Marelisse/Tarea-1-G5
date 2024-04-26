package com.example.Exeptions;

public class PagoInsuficienteException extends Exception {
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
