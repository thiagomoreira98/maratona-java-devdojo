// Aula 31 - Métodos com parâmetros tipo reference parte 01
package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("\nPARAMETROS TEST");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
