package br.com.maratonajava.javacore.sobrecargaconstrutores.test;

import br.com.maratonajava.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("1", "Thiago", new double[]{5, 7, 9}, "2019-10-10");
        estudante.imprime();
    }
}
