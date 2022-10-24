import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {
        Scanner lectorGrados = new Scanner(System.in);
        System.out.println("Introduce los grados celsius que quieras convertir a grados Farenheit");
        double gradosCelsius = lectorGrados.nextDouble();
        double gradosFarenheit = (gradosCelsius *1.8) + 32;

        System.out.println(gradosCelsius + " grados celsius son " + gradosFarenheit + " grados Farenheit");
    }
}
