package javaexercises.exercise3_gestaofuncionarios.servico;

import javaexercises.exercise3_gestaofuncionarios.domain.Assistente;
import javaexercises.exercise3_gestaofuncionarios.domain.Funcionario;
import javaexercises.exercise3_gestaofuncionarios.domain.Gerente;

public class RelatorioFuncionarios {

    public static void relatorio(Funcionario funcionario){
        System.out.println("Relatório do funcionário:");
        double bonus = funcionario.calcularBonus();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());
        System.out.println("Bonus de: R$" + bonus + " no salário.");
        if (funcionario instanceof Assistente){
            Assistente assistente = (Assistente) funcionario;
            System.out.println("Turno: " + assistente.getTurno());
        }

        if (funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Departamento: " + gerente.getDepartamento());
            System.out.println("Senha: " + gerente.getSenha());
            System.out.println("Autenticado: " + gerente.autenticar("dAlvessfr16!"));
        }

    }
}
