package javaexercises.exercise8_suprimentosinformatica.test;

import javaexercises.exercise8_suprimentosinformatica.domain.Invoice;

public class MainInvoice {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice(123, "Celular usado", 0, 0);

        invoice1.imprime();
    }
}
