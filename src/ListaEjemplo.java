import java.util.Scanner;

public class ListaEjemplo {
    public static void main(String[] args) {
        final int SIZE = 10;
        int list[] = new int[SIZE];
        Scanner sc = new Scanner(System.in);
        // Cargamos el array con los datos del usuario
        for (int i = 0; i < list.length; i++) {
            System.out.println("Introduce un número");
            String text = sc.next();
            list[i] = Integer.parseInt(text); // Convierte un string a entero
        }
        // Mostramos los datos del array
        for(int j = 0; j < list.length; j++){
            System.out.println("El índice " + j + " contiene el valor " + list[j]);
        }
    }
}
