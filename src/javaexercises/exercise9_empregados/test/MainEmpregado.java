package javaexercises.exercise9_empregados.test;

import javaexercises.exercise9_empregados.domain.Empregado;

public class MainEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Daniel", "Almeida", 2000.00);
        Empregado empregado2 = new Empregado("Vitor", "Ivaldi", 5000.00);

        empregado1.imprime();
        empregado2.imprime();
    }
}
