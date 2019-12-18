package br.com.maratonajava.javacore.modificadorestatico.test;

import br.com.maratonajava.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("CLIENTE TEST");
//        for(int parcela : c1.getParcelas()) {
//            System.out.print(parcela + ", ");
//        }
        System.out.println(Cliente.getParcelas().length);
    }
}
