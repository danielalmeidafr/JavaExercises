package javaexercises.exercise7_sistemadelanchonetes.domain;

public class Item {
    private double precoVenda;
    private double peso;
    private String dataValidade;

    public Item() {
    }

    public Item(double precoVenda, double peso, String dataValidade) {
        this.precoVenda = precoVenda;
        this.peso = peso;
        this.dataValidade = dataValidade;
    }


}
