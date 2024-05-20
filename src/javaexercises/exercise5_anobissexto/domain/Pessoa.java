package javaexercises.exercise5_anobissexto.domain;

public class Pessoa{
    private String nome;
    private String profissao;
    private int idade;
    public int anoAtual = 2024;
    public int dataNasc = 2007;

    public Pessoa(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nProfissao: " + this.profissao + "\nIdade: " + this.idade;
    }

    public void calcularIdadeAnoBissexto(){
        System.out.println("Sua idade em todos os anos bissextos até 2100:");
        for (int anoAtual = 2024; anoAtual <= 2100; anoAtual++){
            if (anoAtual % 4 == 0){
                System.out.println(anoAtual + ": " + this.idade + " anos");
                this.idade += 4;
            }
        }



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
