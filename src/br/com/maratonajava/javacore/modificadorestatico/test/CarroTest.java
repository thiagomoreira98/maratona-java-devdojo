// Aula 42 - Modificador Static
package br.com.maratonajava.javacore.modificadorestatico.test;

import br.com.maratonajava.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprime();
        Carro.setVelocidadeLimite(100);
        c2.imprime();
        c3.imprime();
    }
}
