import java.util.Scanner;

public class DistanciaKmHora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double distancia, tiempo, resultado;
        System.out.println("Introduce la dístancia en km:");
        distancia = lector.nextDouble();
        System.out.println("Introduce el tiempo en horas en que quieres que recorra la distnacia:");
        tiempo = lector.nextDouble();
        resultado = distancia/tiempo;
        System.out.println("La velocidad a la que tiene que ir un vehiculo para recorrer " + distancia + "km en " + tiempo + "h. es de " + resultado + "km/h");
    }
}
