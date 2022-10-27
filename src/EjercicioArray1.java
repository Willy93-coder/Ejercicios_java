import java.util.Scanner;

public class EjercicioArray1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int list[] = new int[SIZE];
        int value, maxPosition, maxValue, minPosition, minValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce diez números: ");
        for (int i=0; i < list.length; i++) {
            System.out.println("Introduce un número");
            value = sc.nextInt();
            list[i] = value;
        }
        maxValue = list[0];
        maxPosition = 0;
        minValue = list[0];
        minPosition = 0;
        for (int j = 1; j < list.length; j++){
            if (list[j] > maxValue) {
                maxValue = list[j];
                maxPosition = j;
            }
            if (list[j] < minValue) {
                minValue = list[j];
                minPosition = j;
            }
        }
        System.out.println("El numero más alto del array es: " + maxValue + " y está en la posición " + maxPosition);
        System.out.println("El numero más bajo del array es: " + minValue + " y está en la posición " + minPosition);
    }
}
