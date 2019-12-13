// Aula 26 - Classes parte 2 (Resolucao exercicio)
package br.com.maratonajava.introducao.javacore.introducaoclasses.test;

import br.com.maratonajava.introducao.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Prof.";
        professor.matricula = "123B";
        professor.rg = "11.111.111-X";
        professor.cpf = "123.456.789-09";
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
