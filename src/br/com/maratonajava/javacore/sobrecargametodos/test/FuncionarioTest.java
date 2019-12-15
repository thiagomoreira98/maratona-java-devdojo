package br.com.maratonajava.javacore.sobrecargametodos.test;

import br.com.maratonajava.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Funcionario 1", "123.456.789-09", 4500, "123-X");
//        funcionario.setNome("Funcionario 1");
//        funcionario.setCpf("123.456.789-09");
//        funcionario.setSalario(4500);

//        funcionario.init("Funcionario 1", "123.456.789-09", 4500);
//        funcionario.init("Funcionario 2", "123.456.789-09", 4500, "123-X");
        funcionario.imprime();
    }
}
