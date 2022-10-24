import java.util.Scanner;

public class AreasPoligonos {
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        double base, altura, perimetro, apotema, resultado;
        int opcion;
        System.out.println("En este programa se puede calcular el área del triangulo, el cuadrado y el pentagono.");
        System.out.println("Escribe el número del area que quieras calcular:\n1.Triangulo\n2.Cuadrado\n3.Pentagono");
        opcion = lector.nextInt();
        if (opcion == 1) {
            System.out.println("Área del triangulo");
            System.out.println("Introduce la base:");
            base = lector.nextDouble();
            System.out.println("Introduce la altura:");
            altura = lector.nextDouble();
            resultado = (base * altura)/ 2;
            System.out.println("El área del triangulo es: " + resultado);
        } else if (opcion == 2) {
            System.out.println("Área del cuadrado");
            System.out.println("Introduce la base:");
            base = lector.nextDouble();
            resultado = Math.pow(base, 2);
            System.out.println("El área del cuadrado es: " + resultado);
        } else if (opcion == 3) {
            System.out.println("Área del pentagono");
            System.out.println("Introduce el perímetro:");
            perimetro = lector.nextDouble();
            System.out.println("Introduce el apotema:");
            apotema = lector.nextDouble();
            resultado = (5 * perimetro * apotema)/2;
            System.out.println("El área del pentagono es: " + resultado);
        } else {
            System.out.println("No has introducido una instrucción correcta");
        }
    }
}
