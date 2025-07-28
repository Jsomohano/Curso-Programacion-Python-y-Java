package javafolder.Sesion6;

public class Carro {
    private String marca;
    private String color;
    private String placa;

    public Carro(String marca, String color, String placa) {
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
