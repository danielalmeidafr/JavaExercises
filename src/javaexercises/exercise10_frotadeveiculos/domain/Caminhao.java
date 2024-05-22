package javaexercises.exercise10_frotadeveiculos.domain;

public class Caminhao extends VeiculoBase{
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, TipoCombustivel tipoCombustivel, double capacidadeCarga) {
        super(placa, marca, modelo, tipoCombustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão " + modelo + " está freando.");
    }
}
