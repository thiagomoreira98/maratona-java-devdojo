package br.com.maratonajava.introducao.operadores;

// Aula 9 - br.com.maratonajava.introducao.operadores.Operadores de atribuicao
public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // == -= += *= /= %=
        int salario = 1800;
        salario = salario + 1000;
        salario *= 0.1;

        System.out.println(salario);
    }
}
