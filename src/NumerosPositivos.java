import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] arranyNum = new int[10];
        int numUser, num2;
        int numPositivo = 0, numNegativo = 0;


        for (int num = 0; num < 10; num++ ) {
            System.out.println("Introduce un numero");
            numUser = lector.nextInt();
            arranyNum[num] = numUser;
            if (numUser < 0) {
                numNegativo ++;
            } else {
                numPositivo ++;
            }
        }

        for (num2 = 0; num2 < 10; num2++) {
            System.out.println("Los números del array son:");
            System.out.println(arranyNum[num2]);
            if (num2 == 9) {
                System.out.println("Los números positivos son: " + numPositivo);
                System.out.println("Los números negativos son: " + numNegativo);
            }

        }


    }
}
