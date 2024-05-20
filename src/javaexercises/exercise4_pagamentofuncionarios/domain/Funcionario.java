package javaexercises.exercise4_pagamentofuncionarios.domain;

public class Funcionario implements Pagavel{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
