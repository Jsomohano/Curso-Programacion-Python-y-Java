package javafolder.Sesion6_2;

public class Carro extends Vehiculo{
    private int numeroPuertas;
    //HEREDADOS
    // COLOR
    // MARCA
    // PLACA

    public Carro(String marca, String color, String placa, int numeroPuertas) {
        super(marca, color, placa);
        this.numeroPuertas = numeroPuertas;
    }

    // Metodos herededados
    //arrancar
    // frenar
    // pitar

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
