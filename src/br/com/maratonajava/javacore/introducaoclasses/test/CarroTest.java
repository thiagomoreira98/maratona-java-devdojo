// Aula 25 - Classes parte 2
package br.com.maratonajava.javacore.introducaoclasses.test;

import br.com.maratonajava.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.velocidadeMaxima = 160f;
        System.out.println(carro.velocidadeMaxima);
    }
}
