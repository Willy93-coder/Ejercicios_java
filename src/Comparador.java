import java.io.IOException;


public class Comparador {
    public static void main(String[] args) throws IOException {
        char letra1, letra2;
        System.out.println("Introduce un caracter");
        letra1 = (char)System.in.read();
        System.in.read();
        System.out.println("Introduce otro caracter");
        letra2 = (char)System.in.read();
        if(letra1 == letra2) {
            System.out.println("La letra 1 " + letra1 + " es igual a la letra 2 " + letra2);
        } else {
            System.out.println("La letra 1 " + letra1 + " no es igual a la letra 2 " + letra2);
        }
    }
}
