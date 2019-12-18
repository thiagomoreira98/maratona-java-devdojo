package br.com.maratonajava.javacore.polimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGerente(Gerente gerente) {
        System.out.println("----------------------------------------------");
        System.out.println("Gerando relatorio de pagamento para a gerencia");
        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario desse mes: " + gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor) {
        System.out.println("----------------------------------------------");
        System.out.println("Gerando relatorio de pagamento para o vendedor");
        vendedor.calcularPagamento();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salario desse mes: " + vendedor.getSalario());
    }

    // Polimorfismo (Parametros polimorficos)
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("----------------------------------------------");
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mes: " + funcionario.getSalario());

        if(funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participacao nos lucros: " + gerente.getParticipacaoNoLucro());
        } else if (funcionario instanceof Vendedor) {
            Vendedor vendedor = (Vendedor) funcionario;
            System.out.println("Total das vendas: " + vendedor.getTotalVendas());
        } else {
            System.out.println("");
        }
    }
}
