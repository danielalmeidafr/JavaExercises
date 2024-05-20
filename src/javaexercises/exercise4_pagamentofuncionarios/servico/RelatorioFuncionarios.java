package javaexercises.exercise4_pagamentofuncionarios.servico;

import javaexercises.exercise4_pagamentofuncionarios.domain.Contratado;
import javaexercises.exercise4_pagamentofuncionarios.domain.Funcionario;
import javaexercises.exercise4_pagamentofuncionarios.domain.Temporario;

public class RelatorioFuncionarios {

    public static void relatorio(Funcionario funcionario){
        if (funcionario instanceof Contratado){
            System.out.println("Relatório do funcionário contratado: ");
        } else if (funcionario instanceof Temporario) {
            System.out.println("Relatório do funcionário temporario: ");
        }
        System.out.println("Nome: " + funcionario.getNome());
        if (funcionario instanceof Contratado){
            System.out.println("Horas trabalhadas: " + ((Contratado) funcionario).getHorasTrabalhadas());
            System.out.println("Taxa por hora: " + ((Contratado) funcionario).getTaxaPorHora());
            System.out.println("Pagamento: " + funcionario.calcularPagamento());
        } else if (funcionario instanceof Temporario) {
            System.out.println("Dias trabalhados: " + ((Temporario) funcionario).getDiasTrabalhados());
            System.out.println("Salário por dia: " + ((Temporario) funcionario).getSalarioPorDia());
            System.out.println("Pagamento: " + funcionario.calcularPagamento());
        }
    }
}
