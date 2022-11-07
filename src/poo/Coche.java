package poo;

public class Coche {

    // Atributos
    String modelo;
    String color;
    String motor;
    int cv;
    double velocidad;

    // Constructores
    public Coche(){}
    public Coche(String modelo, String color, String motor, int cv, double velocidad) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.cv = cv;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                ", cv=" + cv +
                ", velocidad=" + velocidad +
                '}';
    }
}
