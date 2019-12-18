package br.com.maratonajava.introducao.controlefluxo;

// Aula 17 - Controle de fluxo parte 5 (comando break)
public class ControleFluxo5 {
    public static void main(String[] args) {

        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            // acima de 30 parcelas estamos desperdicando o processamento pois sempre sera abaixo de 1000
            if(valorParcela < 1000) {
                break;
            } else {
                System.out.println(parcela + " parcelas de R$ " + valorParcela);
            }
        }
    }
}
