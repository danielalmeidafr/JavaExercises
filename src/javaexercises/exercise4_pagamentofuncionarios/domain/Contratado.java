package javaexercises.exercise4_pagamentofuncionarios.domain;

public class Contratado extends Funcionario{
    private int horasTrabalhadas;
    private double taxaPorHora;

    public Contratado(String nome, double salario, int horasTrabalhadas, double taxaPorHora) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularPagamento() {
        return this.horasTrabalhadas * this.taxaPorHora;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getTaxaPorHora() {
        return taxaPorHora;
    }
}
