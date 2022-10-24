import java.util.Scanner;

public class NumerosPantalla {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Introduce un número");
        int number1 = inputNumber.nextInt();
        System.out.println("Introduce otro número");
        int number2 = inputNumber.nextInt();

        System.out.println("Has introducido los números " + number1 + " y " + number2);
    }
}
