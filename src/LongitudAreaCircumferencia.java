import java.util.Scanner;

public class LongitudAreaCircumferencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un radio para la circunferencia");
        double radio = lector.nextDouble();
        double pi = Math.PI;
        // System.out.println("¿Con cuantos decimales quieres redondear PI?");
        // int numRedondeoPi = lector.nextInt();
        int numRedondeoPi = 2;

        double longitudCircunferencia = longitud(radio, pi);
        double areaCircunfencia = area(radio, pi, numRedondeoPi);

        System.out.println("La longitud de la circunferencia con un radio " + radio + " es " + longitudCircunferencia + " y el área es " + areaCircunfencia);
    }

    public static double longitud(double radio, double pi){
        double longitud = 2 * pi * radio;
        return longitud;
    }

    public static double area(double radio, double pi, int redondeo){
        double area = pi * Math.pow(radio, redondeo);
        return area;
    }
}
