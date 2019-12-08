public class ControleFluxo4 {
    public static void main(String[] args) {

        System.out.println("WHILE ------------------------------------------------");
        int contador = 0;
        while(contador < 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("DO WHILE ------------------------------------------------");
        int contador2 = 11;
        do {
            System.out.println(contador2);
        } while (contador2 < 10);

        System.out.println("FOR ------------------------------------------------");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);

            if(i == 5) {
                break;
            }
        }
    }
}
