import java.util.Scanner;

public class EjercicioArray1Variante {
    public static void main(String[] args) {
        final int SIZE = 10;
        int list[] = new int[SIZE];
        int maxPosition=0, maxValue = Integer.MIN_VALUE, minPosition=0, minValue = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce diez números: ");
        for(int i = 0; i < list.length; i++) {
            System.out.println("Introduce un número:");
            list[i] = sc.nextInt();
            if(list[i] <= minValue) {
                minValue=list[i];
                minPosition = i;
            }

            if(list[i] >= maxValue) {
                maxValue=list[i];
                maxPosition = i;
            }
        }
        System.out.println("El numero más alto del array es: " + maxValue + " y está en la posición " + maxPosition);
        System.out.println("El numero más bajo del array es: " + minValue + " y está en la posición " + minPosition);
    }
}
