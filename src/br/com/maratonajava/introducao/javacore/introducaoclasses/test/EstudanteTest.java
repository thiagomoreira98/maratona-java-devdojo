// Aula 24 - Classes parte 1
package br.com.maratonajava.introducao.javacore.introducaoclasses.test;

import br.com.maratonajava.introducao.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.matricula = "1212";
        estudante.nome = "joao";

        System.out.println(estudante.nome);
    }
}
