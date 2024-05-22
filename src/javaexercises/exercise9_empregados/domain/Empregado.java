package javaexercises.exercise9_empregados.domain;

public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String ultimoNome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.salarioMensal = salarioMensal;
    }

    public void imprime(){
        this.salarioMensal = Math.max(this.salarioMensal, 0.0);
        System.out.println("Nome completo: " + this.primeiroNome + " " + this.ultimoNome + "\nSalário mensal: " + this.salarioMensal + "\nSalário Anual: " + getSalarioAnual());
        System.out.println("Bonus de 10% no salário: " + getBonusSalario());
        System.out.println();
    }

    public double getSalarioAnual(){
        return Math.max(0, this.salarioMensal) * 12;
    }

    public double getBonusSalario(){
        return getSalarioAnual() + (getSalarioAnual() * 0.10);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
