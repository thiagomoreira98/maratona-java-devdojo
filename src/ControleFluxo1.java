public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 15;
        float salario = 2000f;

        String categoria;
        if(idade >= 18) {
            categoria = "infantil";
        } else if(idade >= 15 && idade <= 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }

        System.out.println(categoria);
    }
}
