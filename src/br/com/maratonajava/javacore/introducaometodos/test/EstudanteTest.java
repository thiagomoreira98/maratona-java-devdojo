package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Thiago Moreira");
        estudante.setIdade(22);
        estudante.setNotas(new double[]{10, 6, 8});
        estudante.imprimir();

        System.out.println("\n------- GET -------------");
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNotas());
        System.out.println(estudante.isAprovado());
    }
}
