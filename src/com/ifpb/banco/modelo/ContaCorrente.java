package com.ifpb.banco.modelo;

public class ContaCorrente {

    private final String titular;
    private final int agencia;
    private final int conta;
    private static int contadorContas;
    private float saldo;

    public ContaCorrente(String titular, int agencia){
        this.titular = titular;
        this.agencia = agencia;
        //inicaliza o número da conta conforme a quantidade de contas existentes
        conta = ++contadorContas;
        saldo = 0;
    }

    public String getTitular(){
        return titular;
    }

    public int getAgencia(){
        return agencia;
    }

    public int getConta(){
        return conta;
    }

    public float getSaldo(){
        return saldo;
    }

    public boolean depositar(float valor){
        if(valor < 0){
            return false;
        }else{
            saldo += valor;
            return true;
        }
    }

    public boolean sacar(float valor){
        if(valor > saldo){
            return false;
        }else{
            saldo -= valor;
            return true;
        }
    }

    public boolean transferir(ContaCorrente destino, float valor){
        if(valor > saldo){
            return false;
        }else{
            return sacar(valor) && destino.depositar(valor);
        }
    }

}
