package javaexercises.exercise1_escola.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome) {
        this();
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprimeInfoProfessor(){
        if (this.nome == null){
            System.out.println("Como você quer as informações do professor sendo que não tem nem o nome?");
            return;
        }

        System.out.println("Informações do professor:");

        System.out.println("Nome: " + this.nome);

        if (this.especialidade == null){
            System.out.println("Professor sem especialidade? Claro que não!");
            return;
        }else{
            System.out.println("Especialidade: " + this.especialidade);
        }

        if (seminarios == null){
            System.out.println("Nenhum seminário administrado!");
            return;
        }else {
            System.out.println("Seminários administrados pelo(a) professor(a) " + this.nome + ":");
            for (Seminario seminario : this.seminarios){
                System.out.println(seminario.getTitulo());
            }
        }

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
