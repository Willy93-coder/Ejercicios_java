import java.util.ArrayList;
import java.util.List;

public class EjercicioArray2 {
    public static void main(String[] args) {
        final int SIZE = 20;
        int arrayRandom[] = new int[SIZE];
        int numRandom;
        List<Integer> listaPrimos = new ArrayList<Integer>();
        int rest;

        for (int i = 0; i < arrayRandom.length; i++) {
            numRandom = (int)(Math.random()*100);
            arrayRandom[i] = numRandom;
            rest = arrayRandom[i] % 2;
            if (rest != 0) {
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
}
