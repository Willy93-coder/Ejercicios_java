import java.util.Scanner;

public class EurosPesetas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double euros, pesetas, conversionEuros, conversionPesetas;
        int opcion;
        System.out.println("Si quieres convertir de euros a pesetas escribe 1, si prefieres de pesetas a euros escribe 2.");
        opcion = lector.nextInt();
        if(opcion == 1) {
            System.out.println("Introduce los euros que quieras saber cuantas pesetas eran:");
            euros = lector.nextDouble();
            conversionPesetas = euros * 166.386;
            System.out.println(euros + "€ serían " + conversionPesetas + "pesetas.");
        } else if ( opcion == 2) {
            System.out.println("Introduce las pesetas que quieras convertir:");
            pesetas = lector.nextDouble();
            conversionEuros = pesetas / 166.386;
            System.out.println(pesetas + "pts serían " + conversionEuros + "€.");
        } else {
            System.out.println("El número que has escrito no se corresponde con las operaciones que podemos realizar.");
        }
    }
}
