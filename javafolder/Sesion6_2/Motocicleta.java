package javafolder.Sesion6_2;

public class Motocicleta {
    private String marca;
    private String color;
    private String placa;

    public Motocicleta(String marca, String color, String placa) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
    }

    public void arrancar() {
        System.out.println("El carro " + marca + " está arrancando.");
    }

    public void frenar() {
        System.out.println("El carro " + marca + " está frenando.");
    }

    public void pitar() {
        System.out.println("El carro " + marca + " está pitando.");
    }
}
