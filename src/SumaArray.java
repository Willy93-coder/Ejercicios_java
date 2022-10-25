import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        final int SIZE = 5;
        int list[] = new int[SIZE];
        int result = 0;
        int value;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < list.length; i++) {
            System.out.println("Introduce un número");
            value = sc.nextInt();
            list[i] = value;
            result += list[i];
        }
        System.out.println("El resultado de la suma es: " + result);
    }
}
