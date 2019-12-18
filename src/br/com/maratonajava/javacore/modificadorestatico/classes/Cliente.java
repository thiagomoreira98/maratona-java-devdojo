package br.com.maratonajava.javacore.modificadorestatico.classes;

public class Cliente {
    private static int[] parcelas;

    // Aula 44 - Blocos de inicializacao estatico, executa apenas uma vez quando a JVM carregar a classe
    static {
        Cliente.parcelas = new int[100];
        System.out.println("BLOCO DE INICIALIZACAO");
        for(int i = 1; i <= 100; i++) {
            Cliente.parcelas[i - 1] = i;
        }
    }

    public Cliente() {
        System.out.println("CONSTRUTOR");
        for(int parcela : Cliente.parcelas) {
            System.out.print(parcela + ", ");
        }
    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
