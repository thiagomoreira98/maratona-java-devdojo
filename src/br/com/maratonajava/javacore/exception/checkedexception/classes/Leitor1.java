package br.com.maratonajava.javacore.exception.checkedexception.classes;

public class Leitor1 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechado leitor 1");
    }
}
