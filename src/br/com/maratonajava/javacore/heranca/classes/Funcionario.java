package br.com.maratonajava.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void printReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    @Override
    public void print() {
        System.out.println("\n---------- FUNCIONARIO -------------");
        super.print();
        System.out.println("Salario: " + this.salario);
        this.printReciboPagamento();
    }
}
