package javaexercises.exercise8_suprimentosinformatica.domain;

public class Invoice {
    private int numeroItem;
    private String descItem;
    private int quantCompradaItem;
    private double precoItem;

    public Invoice(int numeroItem, String descItem, int quantCompradaItem, double precoItem) {
        this.numeroItem = numeroItem;
        this.descItem = descItem;
        this.quantCompradaItem = quantCompradaItem;
        this.precoItem = precoItem;
    }

    // Método novo (pesquisado e aprendido)
    public void imprime() {
        System.out.println("Fatura: \n" + "Número do item: " + this.numeroItem + "\nDescrição: " + this.descItem);

        this.quantCompradaItem = Math.max(this.quantCompradaItem, 0);
        System.out.println("Quantidade comprada: " + this.quantCompradaItem);

        this.precoItem = Math.max(this.precoItem, 0.0);
        System.out.println("Preço por item: " + this.precoItem);

        System.out.println("Total: " + getInvoiceAmount());
    }

    //Método novo
    public double getInvoiceAmount() {
        return Math.max(0, this.quantCompradaItem) * Math.max(0.0, this.precoItem);
    }

    /* MÉTODO ANTIGO public void imprime() {
        System.out.println("Fatura: \n" + "Numero do item: " + this.numeroItem + "\nDescrição: " + this.descItem);
        if (this.quantCompradaItem <= 0){
            this.quantCompradaItem = 0;
            System.out.println("Quantidade comprada: " + this.quantCompradaItem);
        } else {
            System.out.println("Quantidade comprada: " + this.quantCompradaItem);
        }

        if (this.precoItem <= 0.0){
            this.precoItem = 0.0;
            System.out.println("Preço por item: " + this.precoItem);
        } else {
            System.out.println("Preço por item: " + this.precoItem);
        }
        System.out.println("\nTotal: " + getInvoiceAmount());
    }*/


//    METODO ANTIGO public double getInvoiceAmount() {
//        if (this.quantCompradaItem <= 0 || this.precoItem <= 0.0) {
//            return 0;
//        }
//        return this.quantCompradaItem * this.precoItem;
//    }


    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public int getQuantCompradaItem() {
        return quantCompradaItem;
    }

    public void setQuantCompradaItem(int quantCompradaItem) {
        this.quantCompradaItem = quantCompradaItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
