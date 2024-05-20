package javaexercises.exercise3_gestaofuncionarios.domain;

public class Assistente extends Funcionario{
    private String turno;

    public Assistente(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.05;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
}
