package br.com.maratonajava.javacore.exception.customexception;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuario ou senha invalidos");
    }
}
