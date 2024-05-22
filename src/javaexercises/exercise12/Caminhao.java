package javaexercises.exercise12;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo de Veículo: Caminhão");
        super.exibirDados();
        System.out.println("Eixos: " + this.eixos);
    }
}
