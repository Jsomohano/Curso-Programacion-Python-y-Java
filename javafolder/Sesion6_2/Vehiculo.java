package javafolder.Sesion6_2;

public class Vehiculo {
    private String marca;
    private String color;
    private String placa;

    public Vehiculo(String marca, String color, String placa) {
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

    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void sumar()
    {
        System.out.println("Sumando...");
    }
}
