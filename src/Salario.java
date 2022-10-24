import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String name = sc.nextLine();
        System.out.println("Introduce tu edad:");
        int age = sc.nextInt();
        System.out.println("Escribe tu salario");
        double salary = sc.nextDouble();
    }
}
