package javaexercises.exercise4.domain;

public class Temporario extends Funcionario{
    private int diasTrabalhados;
    private double salarioPorDia;

    public Temporario(String nome, double salario, int diasTrabalhados, double salarioPorDia) {
        super(nome, salario);
        this.diasTrabalhados = diasTrabalhados;
        this.salarioPorDia = salarioPorDia;
    }

    @Override
    public double calcularPagamento() {
        return this.diasTrabalhados * this.salarioPorDia;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public double getSalarioPorDia() {
        return salarioPorDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
}
