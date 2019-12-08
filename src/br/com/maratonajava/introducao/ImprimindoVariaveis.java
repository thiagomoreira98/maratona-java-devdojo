package br.com.maratonajava.introducao;

// Aula 5 - Tipo de variaveis
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade = 10;
        double salarioDouble = 3000d;
        float salarioFloat = 3000f;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = 'A'; // 2 Bytes
//        char caractere = 80; // Traduz o numero para o char correspondente no unicode
        String nome = "Thiago";
        System.out.println(nome + " de idade " + idade);
        System.out.println(caractere);
    }
}
