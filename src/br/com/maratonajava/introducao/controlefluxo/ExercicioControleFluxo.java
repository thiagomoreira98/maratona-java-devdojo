package br.com.maratonajava.introducao.controlefluxo;

// Aula 12 - Controle de fluxo parte 1 (RESOLUCAO DE EXERCICIO)
public class ExercicioControleFluxo {
    public static void main(String[] args) {
        float salario = 10000f;

        if(salario < 1000) {
            System.out.println(salario * 0.05);
        } else if (salario >= 1000 && salario < 2000) {
            System.out.println(salario * 0.1);
        } else if (salario >= 2000 && salario < 4000) {
            System.out.println(salario * 0.15);
        } else if (salario> 5000) {
            System.out.println(salario * 0.2);
        } else {
            System.out.println("nao foi possivel calcular o impostos do salario");
        }
    }
}
