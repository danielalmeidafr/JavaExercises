package javaexercises.exercise1_escola.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante() {
    }

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public void imprimeInfoEstudante() {
        if (this.nome == null){
            System.out.println("Como você quer as informações do aluno sendo que não tem nem o nome?");
            return;
        }

        System.out.println("Informações do aluno:");

        System.out.println("Nome: " + this.nome);
        if (this.idade <= 0){
            System.out.println("Impossivel ter essa idade!");
            return;
        }else {
            System.out.println("Idade: " + this.idade);
        }

        if (seminario == null) {
            System.out.println("Não possui nenhum seminário!");
            return;
        }
        System.out.println("Seminário: " + this.seminario.getTitulo());
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }
}
