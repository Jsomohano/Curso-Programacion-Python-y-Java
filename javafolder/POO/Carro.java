package javafolder.POO;

public class Carro {
    private  String marca;
    private String modelo;
    private String color;

    public Carro(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void encender() {
        System.out.println("El carro está encendido.");
    }

    public void apagar() {
        System.out.println("El carro está apagado.");
    }

    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
