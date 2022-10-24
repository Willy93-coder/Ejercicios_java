import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;
        double resultado;
        System.out.println("Este programa es una calculadora");
        System.out.println("Introduce un número");
        num1 = lector.nextInt();
        System.out.println("Introduce otro número");
        num2 = lector.nextInt();
        System.out.println("Que operación deseas realizar: \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir");
        byte menu = lector.nextByte();
        switch (menu) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma del primer número: " + num1 + " y el segundo número: " + num2 + " tiene de resultado " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta del primer número: " + num1 + " y el segundo número: " + num2 + " tiene de resultado " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicación del primer número: " + num1 + " y el segundo número: " + num2 + " tiene de resultado " + resultado);
                break;
            case 4:
                resultado =(double) num1/num2;
                System.out.println("La división del primer número: " + num1 + " y el segundo número: " + num2 + " tiene de resultado " + resultado);
                break;
            default:
                System.out.println("No has introducido una operación correcta");
        }
    }
}
