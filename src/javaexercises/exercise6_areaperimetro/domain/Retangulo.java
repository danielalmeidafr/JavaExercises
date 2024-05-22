package javaexercises.exercise6_areaperimetro.domain;

public class Retangulo {
    public double altura;
    public double comprimento;

    public Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }
    public void calcularAreaPerimetro() {
        System.out.println("Calculando a área do retangulo:");
        System.out.println("Altura: " + this.altura + "\nComprimento: " + this.comprimento);
        double area = this.comprimento * this.altura;
        System.out.println("\nÁrea: " + area);
        double perimetro = 2 * (this.comprimento + this.altura);
        System.out.println("Perímetro: " + perimetro);
    }
}
