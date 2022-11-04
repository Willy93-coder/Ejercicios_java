import java.util.Random;

public class EjercicioMatriz {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        
        int matriz[][] = new int[FILAS][COLUMNAS];
        int num1 = 0, num2 = 9;

        rellenarMatriz(matriz, num1, num2);
        pintarMatriz(matriz);
        sumaMatriz(matriz);
        sumaParcialFilasMatriz(matriz);
        sumaParcialColumnasMatriz(matriz);
        
    }
    // Generar numero random
    public static int random(int a, int b) {
        Random random = new Random();
        return random.nextInt(a, b);
    }

    // Rellenar la matriz
    public static void rellenarMatriz(int[][] matriz, int num1, int num2) {

        for (int i=0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                int num = random(num1, num2);
                matriz[i][j]= num;
            }
        }
    }

    // Pintar la matriz
    public static void pintarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Sumar todos los numeros de la matriz
    public static void sumaMatriz(int[][] matriz){
        int suma = 0;
        for (int i=0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j] ;
            }
        }

        System.out.println("La suma total de la matriz es: " + suma);
    }

    // Suma parcial de filas y columnas de la matriz

    public static void sumaParcialFilasMatriz(int[][] matriz){
        int contador = 0;
        for (int i=0; i < matriz.length; i++) {
            int suma = 0;
            contador ++;
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
            System.out.println("La suma de la fila " + contador + " de la matriz es: " + suma);
        }
    }

    public static void sumaParcialColumnasMatriz(int[][] matriz){
        int contador = 0;
        for (int j=0; j < matriz[0].length; j++) {
            int suma = 0;
            contador ++;
            for (int i = 0; i < matriz.length; i++){
                suma += matriz[i][j];
            }
            System.out.println("La suma de la columna " + contador + " de la matriz es: " + suma);
        }
    }
}
