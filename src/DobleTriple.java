import java.util.Scanner;

public class DobleTriple {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Introduce un número");
        int number1 = inputNumber.nextInt();

        int doble = number1 * 2;
        int triple = number1 * 3;

        System.out.println("El doble del número " + number1 + " es " + doble + " y el triple es " + triple);
    }
}
