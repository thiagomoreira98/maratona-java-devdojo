package br.com.maratonajava.javacore.exception.customexception;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        // Banco de dados
        String usuarioBancoDeDados = "goku";
        String senhaBancoDeDados = "111";

        // input do usuario
        String usuarioDigitado = "goku";
        String senhaDigitada = "123";

        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }
    }
}
