package javaexercises.exercise3_gestaofuncionarios.test;

import javaexercises.exercise3_gestaofuncionarios.domain.Assistente;
import javaexercises.exercise3_gestaofuncionarios.domain.Funcionario;
import javaexercises.exercise3_gestaofuncionarios.domain.Gerente;
import javaexercises.exercise3_gestaofuncionarios.servico.RelatorioFuncionarios;

public class MainGestao {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Daniel", 2000, "SEGA", "dAlvessfr16!");
        Funcionario assistente = new Assistente("Paulinho", 1000, "noite");

        RelatorioFuncionarios.relatorio(gerente);
        System.out.println();
        RelatorioFuncionarios.relatorio(assistente);
    }
}
