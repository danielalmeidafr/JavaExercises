package javaexercises.exercise10_frotadeveiculos.domain;

public enum TipoCombustivel {
    GASOLINA("gasolina"),
    DIESEL("diesel"),
    ELETRICO("elétrico");

    private String combustivel;

    TipoCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
}
