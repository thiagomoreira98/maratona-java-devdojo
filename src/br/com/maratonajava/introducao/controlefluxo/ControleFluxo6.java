package br.com.maratonajava.introducao.controlefluxo;

// Aula 17 - Controle de fluxo parte 6 (comando continue)
public class ControleFluxo6 {
    public static void main(String[] args) {

        double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000) {
                continue;
            }

            System.out.println(parcela + " parcelas de R$ " + valorParcela);
        }
    }
}
