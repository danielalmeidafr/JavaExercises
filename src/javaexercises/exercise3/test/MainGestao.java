package javaexercises.exercise3.test;

import javaexercises.exercise3.domain.Assistente;
import javaexercises.exercise3.domain.Funcionario;
import javaexercises.exercise3.domain.Gerente;
import javaexercises.exercise3.servico.RelatorioFuncionarios;

public class MainGestao {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Daniel", 2000, "SEGA", "dAlvessfr16!");
        Funcionario assistente = new Assistente("Paulinho", 1000, "noite");

        RelatorioFuncionarios.relatorio(gerente);
        System.out.println();
        RelatorioFuncionarios.relatorio(assistente);
    }
}
