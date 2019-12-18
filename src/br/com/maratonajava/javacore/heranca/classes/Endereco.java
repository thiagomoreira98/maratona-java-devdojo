package br.com.maratonajava.javacore.heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void print() {
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }
}
