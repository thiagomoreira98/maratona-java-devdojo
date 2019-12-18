package br.com.maratonajava.javacore.interfaces.test;

import br.com.maratonajava.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calcularImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}
