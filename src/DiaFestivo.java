import java.util.Scanner;

public class DiaFestivo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana para saber que dia es y si tienes que trabajar o no");
        int diaSemana = lector.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes día laborable.");
                break;
            case 2:
                System.out.println("Hoy es martes día laborable.");
                break;
            case 3:
                System.out.println("Hoy es miercoles día laborable.");
                break;
            case 4:
                System.out.println("Hoy es jueves día laborable.");
                break;
            case 5:
                System.out.println("Hoy es viernes día laborable.");
                break;
            case 6:
                System.out.println("Hoy es sabado día no laborable, te toca descansar.");
                break;
            case 7:
                System.out.println("Hoy es domingo día no laborable, te toca descansar.");
                break;
            default:
                System.out.println("No has introducido un número del 1 al 7...");
        }
    }
}
