package javaexercises.exercise10_frotadeveiculos.test;

import javaexercises.exercise10_frotadeveiculos.domain.Caminhao;
import javaexercises.exercise10_frotadeveiculos.domain.Carro;
import javaexercises.exercise10_frotadeveiculos.domain.TipoCombustivel;
import javaexercises.exercise10_frotadeveiculos.servico.Frota;

public class MainFrotas {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro = new Carro("ABC-1234", "Toyota", "Corolla", TipoCombustivel.GASOLINA, 4 );
        Caminhao caminhao = new Caminhao("DEF-5678", "Volvo", "FH", TipoCombustivel.DIESEL, 20.0);

        frota.adicionarVeiculo(carro);
        System.out.println();
        frota.adicionarVeiculo(caminhao);

        frota.listarVeiculos();
    }
}

