package javaexercises.exercise4_pagamentofuncionarios.test;

import javaexercises.exercise4_pagamentofuncionarios.domain.Contratado;
import javaexercises.exercise4_pagamentofuncionarios.domain.Funcionario;
import javaexercises.exercise4_pagamentofuncionarios.domain.Temporario;
import javaexercises.exercise4_pagamentofuncionarios.servico.RelatorioFuncionarios;

public class MainPagamento {
    public static void main(String[] args) {
        Funcionario contratado = new Contratado("Daniel", 0, 160, 25.00);
        Funcionario temporario = new Temporario("Joao", 0, 20, 100);

        RelatorioFuncionarios.relatorio(contratado);
        System.out.println();
        RelatorioFuncionarios.relatorio(temporario);
    }
}
