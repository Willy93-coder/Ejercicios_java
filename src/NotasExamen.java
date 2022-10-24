import java.util.Scanner;

public class NotasExamen {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("En este programa sabremos tu calificación del colegio");
        int calificacion;
        System.out.println("Introduce tu nota:");
        calificacion = lector.nextInt();
        switch (calificacion) {
            case 0, 1, 2, 3, 4 -> System.out.println("Has suspendido");
            case 5 -> System.out.println("Tienes un suficiente");
            case 6 -> System.out.println("Tienes un bien");
            case 7 -> System.out.println("Tienes un notable bajo");
            case 8 -> System.out.println("Tienes un notable alto");
            case 9 -> System.out.println("Tienes un excelente");
            case 10 -> System.out.println("Tienes matrícula de honor");
            default -> System.out.println("No has puesto una nota correcta");
        }
    }
}
