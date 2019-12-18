package br.com.maratonajava.javacore.modificadorfinal.classes;

// utilizar o final na declaracao de classe implica que esta classe nao podera ser extendida
public class Carro {
    private String nome;
    private String marca;

    // uma das finalidades de "final" eh para declarar constantes em JAVA
    private final Comprador comprador = new Comprador();
    public static final double VELOCIDADE_MAXIMA = 250;

    //    Pode inicializar usando um bloco de inicializacao estatico, pois o atributo eh estatico
//    static {
//        VELOCIDADE_MAXIMA = 250;
//    }

    //    Se a variavel final nao for estatica, pode inicializar no construtor
//    public Carro() {
//        VELOCIDADE_MAXIMA = 240;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return comprador;
    }

    // utilizar o final em metodos implica que este mesmo nao podera ser sobrescrito (Override)
    public final void imprime() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", comprador='" + comprador.toString() + '\'' +
                '}';
    }
}
