package javaexercises.exercise7_sistemadelanchonetes.test;

import javaexercises.exercise7_sistemadelanchonetes.domain.*;
import javaexercises.exercise7_sistemadelanchonetes.servico.RelatorioItens;

public class Lanchonete {
    public static void main(String[] args) {
        Item salgadinho = new Salgadinho("Frango", "Batata", TipoSalgadinho.FRITO, 5.99, 50, "22/10/2024");
        Item pizza = new Pizza("Bolonhesa", "Gorgonzola", "Catupiry", 40.0, 40, "22/11/2024");
        Item lanche = new Lanche("Brioche", "Frango Catupiry", "Requiejao", 20.0, 400, "04/06/2024");

        RelatorioItens.relatorioItem(salgadinho);
        System.out.println();
        RelatorioItens.relatorioItem(pizza);
        System.out.println();
        RelatorioItens.relatorioItem(lanche);
    }
}
