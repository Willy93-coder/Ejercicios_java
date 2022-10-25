import java.util.Scanner;

public class ArrayFunciones {
    public static void main(String[] args) {
        final int SIZE = 10;
        int num[] = new int[SIZE];
        rellenarArray(num);
        mostrarArray(num);
    }

    // Cargamos el array con los datos del usuario
    public static void rellenarArray(int list[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.println("Introduce un número");
            String text = sc.next();
            list[i] = Integer.parseInt(text);
        }
    }
    // Función para mostrar el array
    public static void mostrarArray(int list[]){
        for(int j = 0; j < list.length; j++){
            System.out.println("El índice " + j + " contiene el valor " + list[j]);
        }
    }
}
