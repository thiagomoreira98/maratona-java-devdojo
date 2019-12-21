package br.com.maratonajava.javacore.exception.checkedexception.test;

import br.com.maratonajava.javacore.exception.checkedexception.classes.Leitor1;
import br.com.maratonajava.javacore.exception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }

    // JAVA 6
    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // JAVA 7 ou maior
    public static void lerArquivoNew() {
        // o try with resources fecha a conexao automaticamente
        // apenas classes com o tipo Closeable ou AutoCloseable podem usar o try with resources
        try ( Reader reader = new BufferedReader(new FileReader("text.txt")) ) {
            // something
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {
        try (
            Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()
        ) {
            // something
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
