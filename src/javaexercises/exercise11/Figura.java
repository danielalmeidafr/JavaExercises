package javaexercises.exercise11;

public abstract class Figura {
    private String cor;

    public Figura() {
    }

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Retangulo extends Figura{
    private double lado1;
    private double lado2;

    public Retangulo() {
    }

    public Retangulo(String cor, double lado1, double lado2) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area(){
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", area=" + area() +
                "} ";
    }
}

class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                "} ";
    }
}

class Circulo extends Figura{
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro(){
        return getRaio() * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diametro=" + getDiametro() +
                "} ";
    }
}

class Quadrado extends Retangulo{
    public Quadrado() {
    }

    public Quadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }

    @Override
    public double area() {
        return this.getLado1() * this.getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado:[area()=" + area() + ", cor= " + super.getCor() + "]";
    }
}
