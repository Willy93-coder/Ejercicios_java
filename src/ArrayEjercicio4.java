import java.util.Scanner;

public class ArrayEjercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para saber cuanto de larga va a ser");
        final int SIZE = sc.nextInt();
        int arrayRandom[] = new int[SIZE];
        int num1=0, num2=9;
        fillArray(arrayRandom, num1, num2);
    }
    // Función rellenar array
    public static void fillArray(int[] array, int a, int b){
        int plusArray = 0;
        for (int i = 0; i < array.length; i++) {
            int num=numRamdom(a, b);
            array[i] = num;
            plusArray += array[i];
            System.out.printf("%d ", array[i]);
        }
        System.out.println("\nLa suma total de todos los numeros del array es: " + plusArray);
    };

    // Función crear número random
    private static int numRamdom(int a, int b){
        int num=(int)Math.floor(Math.random()*(a-b)+b);
        return num;
    }


}
