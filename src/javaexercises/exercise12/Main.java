package javaexercises.exercise12;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC-1234", 2010);
        Caminhao caminhao1 = new Caminhao("DEF-5678", 2015, 4);
        Onibus onibus1 = new Onibus("GHI-9012", 2020, 50);

        // Exibindo os dados de cada veículo
        veiculo1.exibirDados();
        System.out.println();
        caminhao1.exibirDados();
        System.out.println();
        onibus1.exibirDados();
    }
}
