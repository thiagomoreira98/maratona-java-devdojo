public class ExercicioControleFluxo3 {
    public static void main(String[] args) {

        int valorMaximo = 100000;
        for(int i = 0; i <= valorMaximo; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " eh par");
            }
        }
    }
}
