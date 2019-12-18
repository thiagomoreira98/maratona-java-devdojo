package br.com.maratonajava.javacore.enumeracao.test;

import br.com.maratonajava.javacore.enumeracao.classes.Cliente;
import br.com.maratonajava.javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }
}
