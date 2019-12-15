package br.com.maratonajava.javacore.introducaometodos.classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimir() {
        System.out.println("\n----------------------------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);

        System.out.print("notas: ");
        for(double nota : this.notas) {
            System.out.print(nota + ", ");
        }

        this.calcularMedia();
    }

    public void calcularMedia() {
        if(this.notas == null || this.notas.length == 0) {
            System.out.println("Esse aluno nao possui notas");
            return;
        }

        int media = 0;
        for (double nota : this.notas) {
            media += nota;
        }

        media /= notas.length;
        System.out.println("\nmedia: " + media);

        if(media > 6) {
            this.aprovado = true;
            System.out.println("situacao: APROVADO");
        }
        else {
            this.aprovado = false;
            System.out.println("situacao: REPROVADO");
        }
    }

    // GETTERS & SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade deve ser maior ou igual a zero");
            return;
        }

        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }
}
