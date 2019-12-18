package br.com.maratonajava.javacore.classesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + (this.salario * 0.2);
    }

    @Override
    public void imprime() {
        System.out.println(this);
    }
}
