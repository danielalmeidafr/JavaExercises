package javaexercises.exercise7_sistemadelanchonetes.domain;

public class Pizza extends Item {
    private String molhoPizza;
    private String recheioPizza;
    private String bordaPizza;

    public Pizza(String molhoPizza, String recheioPizza, String bordaPizza) {
        this.molhoPizza = molhoPizza;
        this.recheioPizza = recheioPizza;
        this.bordaPizza = bordaPizza;
    }

    public Pizza(String molhoPizza, String recheioPizza, String bordaPizza, double precoVenda, double peso, String dataValidade) {
        super(precoVenda, peso, dataValidade);
        this.molhoPizza = molhoPizza;
        this.recheioPizza = recheioPizza;
        this.bordaPizza = bordaPizza;
    }

    public String getMolhoPizza() {
        return molhoPizza;
    }

    public void setMolhoPizza(String molhoPizza) {
        this.molhoPizza = molhoPizza;
    }

    public String getRecheioPizza() {
        return recheioPizza;
    }

    public void setRecheioPizza(String recheioPizza) {
        this.recheioPizza = recheioPizza;
    }

    public String getBordaPizza() {
        return bordaPizza;
    }

    public void setBordaPizza(String bordaPizza) {
        this.bordaPizza = bordaPizza;
    }
}
