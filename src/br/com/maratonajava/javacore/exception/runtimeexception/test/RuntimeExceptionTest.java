package br.com.maratonajava.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // ArithmeticException
//        int a = 10 / 0;
//        System.out.println(a);

        // ArrayIndexOutOfBoundsException
//        int[] b = new int[2];s

        divisao(10,0);
    }

    private static void divisao(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }

        int result = num1 / num2;
        System.out.println(result);
    }
}
