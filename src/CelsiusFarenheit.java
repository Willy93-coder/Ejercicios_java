import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {
        Scanner lectorGrados = new Scanner(System.in);
        System.out.println("Introduce los grados celsius que quieras convertir a grados Farenheit");
        double gradosCelsius = lectorGrados.nextDouble();

        double resultado = gradosFarenheit(gradosCelsius);
        System.out.println(gradosCelsius + " grados celsius son " + resultado + " grados Farenheit");
    }

    public static double gradosFarenheit(double celsius){
        double gradosFarenheit = (celsius *1.8) + 32;

        return gradosFarenheit;
    }
}
