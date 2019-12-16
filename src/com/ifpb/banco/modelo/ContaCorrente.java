package com.ifpb.banco.modelo;

/**
Essa classe modela uma conta corrente de um <b>banco</b>, simulando os
 serviços comuns dessa entidade.
 @since 1.0
 @version 1.0
 @author paulo
 */

public class ContaCorrente {

    private final String titular;
    private final int agencia;
    private final int conta;
    private static int contadorContas;
    private float saldo;

    /**
     * Cria uma conta corrente especificando o titular e a agência
     * @param titular o nome do titular da conta corrente
     * @param agencia o número da agência da conta corrente
     */
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

    /**
     * Deposita um valor na conta corrente
     * @param valor o valor a ser depositado
     * @return a confirmação do depósito
     */
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
