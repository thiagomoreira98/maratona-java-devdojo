package br.com.maratonajava.javacore.exception.checkedexception.classes;

public class Leitor2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechado leitor 2");
    }
}
