package javaexercises.exercise1.domain;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this();
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this(titulo);
        this.local = local;
    }

    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this(titulo, local);
        this.estudantes = estudantes;
    }

    public void imprimeInfoSeminario() {
        if (this.titulo == null){
            System.out.println("Como você quer as informações do seminário sendo que nem existe?");
            return;
        }

        if (this.local == null) {
            System.out.println("Você precisa de um local!");
            return;
        }

        System.out.println("Informações do seminário:");

        System.out.println("Título: " + this.titulo);

        System.out.println("Local: " + this.local.getEndereco());

        if (this.estudantes == null) {
            System.out.println("Não possui nenhum estudante!");
            return;
        }

        System.out.println("Alunos que fazem o seminário:");
        for (Estudante estudante : this.estudantes){
            System.out.println(estudante.getNome());
        }

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }
}
