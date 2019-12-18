package br.com.maratonajava.javacore.classesabstratas.test;

import br.com.maratonajava.javacore.classesabstratas.classes.Gerente;
import br.com.maratonajava.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", "0000", 4500);
        Vendedor vendedor = new Vendedor("Marcos", "1111", 2000, 5000);
        gerente.calculaSalario();
        vendedor.calculaSalario();
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}
