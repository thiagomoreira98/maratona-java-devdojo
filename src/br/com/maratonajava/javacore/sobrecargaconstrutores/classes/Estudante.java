package br.com.maratonajava.javacore.sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante() {

    }

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        // chamada de outro construtor deve ser a primeira linha
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);

        for(double nota : this.notas) {
            System.out.print(nota);
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
