import java.util.Scanner;

public class MetrosPorSegundo {
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        System.out.println("Introduce una velocidad en km/h (solo números)");
        float velocidad = lector.nextFloat();
        double velocidadMetrosSegundo = velocidad * 0.27777;
        System.out.println("La velocidad de " + velocidad + "km/h es de " + velocidadMetrosSegundo + "m/s");
    }
}
