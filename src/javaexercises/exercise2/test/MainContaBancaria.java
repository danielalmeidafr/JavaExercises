package javaexercises.exercise2.test;

import javaexercises.exercise2.domain.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Daniel", 123, 2000);

        System.out.println(conta1);

        conta1.consultarSaldo();
        System.out.println();
        conta1.depositar(2000.20);
        System.out.println();
        conta1.sacar(1000);
    }
}
