import java.util.Scanner;

public class PesoLuna {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa que calcula tu peso en la luna");
        Scanner lector = new Scanner(System.in);
        double pesoUsuario, pesoUsuarioLuna;
        System.out.println("Introduce tu peso en kg por favor:");
        pesoUsuario = lector.nextDouble();
        pesoUsuarioLuna = (pesoUsuario/9.81) * 1.622;
        System.out.println("Tu peso en la luna sería de: " + pesoUsuarioLuna + "kg.");
    }
}
