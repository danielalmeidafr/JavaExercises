package javaexercises.exercise2_contabancaria.domain;

public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;

    public ContaBancaria(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nNúmero da conta: " + this.numero + "\nSaldo: " + this.saldo;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        if (valor > this.saldo || valor == 0) {
            System.out.println("Valor do saque inválido ou saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        System.out.println("Voce fez um saque de: " + valor);
        System.out.println("Saldo final: " + this.saldo);
    }

    public void depositar(double valor) {
        if (valor < 0){
            System.out.println("O valor do depósito deve ser maior do que 0.");
        }
        this.saldo += valor;
        System.out.println("Voce fez um depósito de: " + valor);
        System.out.println("Saldo final: " + this.saldo);
    }
}
