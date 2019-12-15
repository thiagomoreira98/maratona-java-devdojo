// Aula 31, 32 - Métodos com parâmetros tipo reference parte 1, 2
package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.456.789-09";
        prof.matricula = "11122";
        prof.nome = "Prof. 1";
        prof.rg = "122211-5";

        prof.imprime(prof);

        Professor prof2 = new Professor();
        prof2.cpf = "111.222.333-44";
        prof2.matricula = "44421";
        prof2.nome = "Prof. 2";
        prof2.rg = "153312-3";

        prof2.imprime(prof2);
    }
}
