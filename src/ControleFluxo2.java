public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 18;

        System.out.println(idade >= 18 ? "Adulto" : "Nao adulto");
        System.out.println(idade < 15 ? "Infantial" : idade >= 18 ? "Adulto" : "Nao adulto");
    }
}
