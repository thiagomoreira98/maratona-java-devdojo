package br.com.maratonajava.javacore.heranca.test;

import br.com.maratonajava.javacore.heranca.classes.Endereco;
import br.com.maratonajava.javacore.heranca.classes.Funcionario;
import br.com.maratonajava.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Thiago", "123.456.789-09");

        Endereco endereco = new Endereco();
        endereco.setRua("araras");
        endereco.setBairro("mato");

        pessoa.setEndereco(endereco);
        pessoa.print();

        Funcionario funcionario = new Funcionario("Mudei de nome", "000.000.000-00", 4500);
        funcionario.setEndereco(endereco);
        funcionario.print();
    }
}
