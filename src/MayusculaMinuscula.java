import java.io.IOException;

public class MayusculaMinuscula {
    public static void main(String[] args) throws IOException {
        char caracter;
        boolean caracterMayuscula;
        System.out.println("Introduce un caracter para saber si está en mayúscula o no");
        caracter = (char)System.in.read();
        caracterMayuscula = Character.isUpperCase(caracter);
        if (caracterMayuscula) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("No es mayúscula");
        }
    }
}
