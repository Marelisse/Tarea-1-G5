package com.example.Exeptions;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}