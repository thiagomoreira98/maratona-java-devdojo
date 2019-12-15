package br.com.maratonajava.javacore.blocodeinicializacao.test;

import br.com.maratonajava.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println("CLIENTE TEST");
        for(int parcela : cliente.getParcelas()) {
            System.out.print(parcela + ", ");
        }
    }
}
