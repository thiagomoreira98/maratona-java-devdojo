package br.com.maratonajava.javacore.polimorfismo.test;

import br.com.maratonajava.javacore.polimorfismo.classes.Funcionario;
import br.com.maratonajava.javacore.polimorfismo.classes.Gerente;
import br.com.maratonajava.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.maratonajava.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Thiago", 7000, 10);
        Vendedor vendedor = new Vendedor("Ana", 2000, 10000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(gerente);
//        relatorio.relatorioPagamentoVendedor(vendedor);
        relatorio.relatorioPagamentoGenerico(gerente);
        relatorio.relatorioPagamentoGenerico(vendedor);

        // Polimorfismo
        Funcionario funcionario = gerente;
        System.out.println("----------------------------------------------");
//        System.out.println(funcionario.getSalario());

    }
}
