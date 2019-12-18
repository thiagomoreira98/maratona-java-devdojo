package br.com.maratonajava.javacore.modificadorfinal.test;

import br.com.maratonajava.javacore.modificadorfinal.classes.Carro;
import br.com.maratonajava.javacore.modificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Kuririm");
        System.out.println(carro.getComprador());
        carro.imprime();
    }
}
