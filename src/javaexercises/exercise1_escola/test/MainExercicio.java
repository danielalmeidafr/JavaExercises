package javaexercises.exercise1_escola.test;


import javaexercises.exercise1_escola.domain.Estudante;
import javaexercises.exercise1_escola.domain.Local;
import javaexercises.exercise1_escola.domain.Professor;
import javaexercises.exercise1_escola.domain.Seminario;

public class MainExercicio {
    public static void main(String[] args) {
        Local local1 = new Local("Casa verde");

        Estudante estudante1 = new Estudante("Daniel", 16);
        Estudante[] estudantes = {estudante1};

        Professor professor1 = new Professor("Lucimara", "Desenvolvimento de Software");

        Seminario seminario1 = new Seminario("Desenvolvimento de Sistemas", local1, estudantes);
        Seminario[] seminarios = {seminario1};

        // Definindo o seminário para o professor
        professor1.setSeminarios(seminarios);

        // Definindo o seminário para o estudante
        estudante1.setSeminario(seminario1);


        // ESTUDANTES
        estudante1.imprimeInfoEstudante();
        System.out.println();

        // PROFESSORES
        professor1.imprimeInfoProfessor();
        System.out.println();

        //SEMINARIOS
        seminario1.imprimeInfoSeminario();




    }
}
