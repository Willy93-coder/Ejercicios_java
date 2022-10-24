import java.io.IOException;

public class LetraMinuscula {
    public static void main(String[] args) throws IOException {
        char letra1, letra2;
        boolean minuscula1, minuscula2;
        System.out.println("Introudce un caracter");
        letra1 =(char)System.in.read();
        System.in.read();
        System.out.println("Introduce un segundo caracter");
        letra2 = (char)System.in.read();
        minuscula1 = Character.isLowerCase(letra1);
        minuscula2 = Character.isLowerCase(letra2);


        if(minuscula1 && minuscula2) {
            System.out.println("La letra1 " + letra1 + " y la letra 2 " + letra2 + " son minusculas");
        } else {
            System.out.println("Una de las dos no es minuscula");
        }
    }
}
