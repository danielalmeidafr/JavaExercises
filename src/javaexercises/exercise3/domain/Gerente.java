package javaexercises.exercise3.domain;

public class Gerente extends Funcionario implements Autenticavel{
    private String departamento;
    private String senha;

    public Gerente(String nome, double salario, String departamento, String senha) {
        super(nome, salario);
        this.departamento = departamento;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        if (!this.senha.equals(senha)){
            return false;
        }
        return true;
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.1;
    }

    public String getSenha() {
        return senha;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
