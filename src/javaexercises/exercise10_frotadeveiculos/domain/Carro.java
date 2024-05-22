package javaexercises.exercise10_frotadeveiculos.domain;

public class Carro extends VeiculoBase{
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, TipoCombustivel tipoCombustivel, int numeroPortas) {
        super(placa, marca, modelo, tipoCombustivel);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro " + modelo + " está freando.");
    }



}
