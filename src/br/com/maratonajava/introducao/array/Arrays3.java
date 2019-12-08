package br.com.maratonajava.introducao.array;

// Aula 20 - Arrays parte 3 (Foreach)
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        // int[] numeros = new int[]{1, 2, 3, 4, 5};

        for(int aux : numeros2) {
            System.out.println(aux);
        }
    }
}
