package com.ifpb.banco.excecoes;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

}