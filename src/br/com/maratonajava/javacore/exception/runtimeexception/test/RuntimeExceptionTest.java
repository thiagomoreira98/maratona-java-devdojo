package br.com.maratonajava.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // ArithmeticException
//        int a = 10 / 0;
//        System.out.println(a);

        // ArrayIndexOutOfBoundsException
        int[] b = new int[2];
        System.out.println(b[2]);
    }
}
