import java.util.Scanner;

public class LongitudAreaCircumferencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un radio para la circunferencia");
        double radio = lector.nextDouble();
        double pi = Math.PI;

        double longitud = 2 * pi * radio;
        double area = pi * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia con un radio " + radio + " es " + longitud + " y el área es " + area);
    }
}
