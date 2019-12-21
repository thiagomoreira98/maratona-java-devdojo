package br.com.maratonajava.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplesRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        // classe mae (generica) sempre por ultimo
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        // A partir do JAVA 7 pode usar a classe Exception para pegar todos os exceptions do metodo
        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
