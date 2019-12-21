package br.com.maratonajava.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {

    }

    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("arquivo criado ? " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void abrirArquivo() {
        File file = new File("teste.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("arquivo criado ? " + isCreated);
            throw new Exception();
//            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
    }
}
