// Aula 27, 28, 29, 30 - Metodos parte 1, 2, 3, 4
package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(2, 3);
        double divisaoResult = calc.divideDoisNumeros(10, 2);
        System.out.println(divisaoResult);

        int[] numeros = new int[]{1, 2, 3, 4, 5};
        calc.somaArray(numeros);

        // Var Args
        calc.somaVarArgs(1, 2, 3, 4);
    }
}
