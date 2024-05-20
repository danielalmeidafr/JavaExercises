package javaexercises.exercise5_anobissexto.test;

import javaexercises.exercise5_anobissexto.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Daniel", "Desenvolvedor", 16);

        System.out.println(pessoa);

        pessoa.calcularIdadeAnoBissexto();
    }
}
