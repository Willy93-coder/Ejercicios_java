import java.util.ArrayList;
import java.util.List;

public class EjercicioArray2 {
    public static void main(String[] args) {
        final int SIZE = 20;
        int arrayRandom[] = new int[SIZE];
        int numRandom;
        List<Integer> listaPrimos = new ArrayList<Integer>();

        for (int i = 0; i < arrayRandom.length; i++) {
            numRandom = (int)(Math.random()*100);
            arrayRandom[i] = numRandom;

            if (numPrimo(numRandom)) {
                listaPrimos.add(arrayRandom[i]);
            }
        }

        System.out.println("Array de 20 números random: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.printf("%d ",arrayRandom[i]);
        }

        System.out.println("\nArray de primos: ");
        for(int numPrimo : listaPrimos ) {
            System.out.printf("%d ",numPrimo);
        }

    }

    public static boolean numPrimo(int num){
        if (num == 0 || num == 1 || num == 4) {
            return false;
        }
        for (int x = 2; x < num / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (num % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    };
}
