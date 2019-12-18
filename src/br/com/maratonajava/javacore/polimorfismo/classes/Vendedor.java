package br.com.maratonajava.javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private int totalVendas;

    public Vendedor(String nome, double salario, int totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (this.totalVendas * 0.05);
    }
}
