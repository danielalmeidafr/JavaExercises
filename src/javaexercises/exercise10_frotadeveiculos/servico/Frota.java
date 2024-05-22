package javaexercises.exercise10_frotadeveiculos.servico;

import javaexercises.exercise10_frotadeveiculos.domain.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Placa: " + veiculo.getPlaca() + ", Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo());
            veiculo.acelerar();
            veiculo.frear();
        }
    }
}

