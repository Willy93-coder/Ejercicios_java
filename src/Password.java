import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la contraseña, recuerda que solo tienes 3 intentos!!");
        byte contador = 3, intentos = 0;
        String password = "eureka";

        while (contador > 0) {
            String passwordUser = lector.next();
            contador --;
            intentos ++;
            if ( password.equals(passwordUser)) {
                System.out.println("Has acertado la contraseña en el intento: " + intentos);
                System.out.println("Enhorabuena, has acertado!!!!");
                break;
            } else {
                System.out.println("Te quedan " + contador + " intentos");
            }
            System.out.println("Introduce la contraseña otra vez, recuerda que te quedan " + contador + " intentos.");
        }
        if (contador == 0) {
            System.out.println("Se te han acabado los intentos");
        }
    }
}
