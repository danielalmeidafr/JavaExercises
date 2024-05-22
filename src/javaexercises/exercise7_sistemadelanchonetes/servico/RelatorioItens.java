package javaexercises.exercise7_sistemadelanchonetes.servico;

import javaexercises.exercise7_sistemadelanchonetes.domain.Item;
import javaexercises.exercise7_sistemadelanchonetes.domain.Lanche;
import javaexercises.exercise7_sistemadelanchonetes.domain.Pizza;
import javaexercises.exercise7_sistemadelanchonetes.domain.Salgadinho;

public class RelatorioItens {
    public static void relatorioItem(Item itens){
        if (itens instanceof Salgadinho){
            Salgadinho salgadinho = (Salgadinho) itens;
            System.out.println("Tipo do salgadinho: " + salgadinho.tipoFritura() + "\nMassa do salgadinhio: " + salgadinho.getMassaSalgadinho() + "\nRecheio do salgadinho: " + salgadinho.getRecheioSalgadinho());
        }

        if (itens instanceof Pizza){
            Pizza pizza = (Pizza) itens;
            System.out.println("Molho da pizza: " + pizza.getMolhoPizza() + "\nRecheio da pizza: " + pizza.getRecheioPizza() + "\nBorda da pizza: " + pizza.getBordaPizza());
        }

        if (itens instanceof Lanche){
            Lanche lanche = (Lanche) itens;
            System.out.println("Tipo do pao: " + lanche.getTipoPao() + "\nRecheio do lanche: " + lanche.getRecheioLanche() + "\nMolho do lanche: " + lanche.getMolhoLanche());
        }
    }
}
