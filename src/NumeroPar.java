import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroUsuario;
        System.out.println("Introduce un número del que quieras saber si es par");
        numeroUsuario = lector.nextInt();
        if (numeroUsuario % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
