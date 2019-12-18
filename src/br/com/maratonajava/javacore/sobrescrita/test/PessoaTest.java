package br.com.maratonajava.javacore.sobrescrita.test;

import br.com.maratonajava.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago");
        pessoa.setIdade(22);
        // Toda vez que usar o println para exibir uma variavel de referencia ele chama o metodo toString()
        System.out.println(pessoa);
    }
}
