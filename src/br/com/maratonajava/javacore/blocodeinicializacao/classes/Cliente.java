package br.com.maratonajava.javacore.blocodeinicializacao.classes;

public class Cliente {
    // Aula 41
    // 1 - primeiro eh alocado espaco na memoria para o objeto que sera criado
    // 2 - cada atributo de classe eh inicializado com seus valores default ou valores explicitos
    // 3 - bloco de inicializacao eh executado
    // 4 - o construtor eh executado

    // private int[] parcelas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private int[] parcelas;

    // Bloco de inicializacao
    // boas praticas: deve ser colocado antes do construtor
    {
        this.parcelas = new int[100];
        System.out.println("BLOCO DE INICIALIZACAO");
        for(int i = 1; i <= 100; i++) {
            this.parcelas[i - 1] = i;
        }
    }

    public Cliente() {
        System.out.println("CONSTRUTOR");
        for(int parcela : this.parcelas) {
            System.out.print(parcela + ", ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
