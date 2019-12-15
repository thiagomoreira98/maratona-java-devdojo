// Aula 27, 28, 29, 30 - Metodos parte 1, 2, 3, 4
package br.com.maratonajava.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return 0;
    }

    // Aula 31 - Métodos com parâmetros tipo reference parte 01
    // Argumento do tipo primitivo é apenas uma copia como parametro nas funções, os valores originais nunca serão alterados
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("DENTRO DO METODO");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    // Aula 33 - Apenas um var Args por metodo, mais de um gera erro de compilacao
    // var Args sempre por ultimo no metodo, gera erro de compilacao
    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }
}
