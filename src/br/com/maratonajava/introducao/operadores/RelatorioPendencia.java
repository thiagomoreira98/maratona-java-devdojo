package br.com.maratonajava.introducao.operadores;

// Aula 6 - Exercicios de tipos de variaveis
public class RelatorioPendencia {
    public static void main(String[] args) {
        String nome = "Thiago Moreira";
        String endereco = "Rua teste, 111";
        String telefone = "(16)99265-1641";

        System.out.println("O " + nome + " domiciliado no endereco " + endereco + " e telefone " + telefone + " nao possui nenhum tipo de pendencia");

        double salario = 4200.90d;
        char sexo = 'M';
        int idade = 22;
        String estadoCivil = "solteiro";

        System.out.println("O trabalhador(a) " + nome + " do sexo " + sexo + ", idade " + idade + ", estado civil " + estadoCivil + " e salario " + salario + " encontra-se empregado neste estabelecimento");
    }
}
