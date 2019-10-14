package com.ifpb.banco.visao;

import com.ifpb.banco.modelo.ContaCorrente;

public class App {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("João", 1);
        ContaCorrente c2 = new ContaCorrente("Maria", 1);

        if(c1.depositar(200)){
            System.out.println("Depositado");
        }else{
            System.out.println("Não depositado");
        }

        c2.depositar(500);

        if(c2.sacar(3000)){
            System.out.println("Sacado");
        }else{
            System.out.println("Saldo insuficiente");
        }

        c2.transferir(c1, 100);

        System.out.println("Saldo de C1: "+c1.getSaldo());
        System.out.println("Saldo de C2: "+c2.getSaldo());


    }

}
