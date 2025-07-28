package javafolder.Sesion6;

public class CarroEjemplo {
    // Atributos de la clase Carro
    public String color;
    public String marca;
    public String placa;
    public int numLlantas;

    // Constructor de la clase Carro
    public CarroEjemplo()
    {
        
    }

    public CarroEjemplo(String color, String marca, int numLlantas)
    {
        this.color = color;
        this.marca = marca;
        this.numLlantas = numLlantas;
    }

    public CarroEjemplo(String color, String marca, int numLlantas, String placa)
    {
        this.color = color;
        this.marca = marca;
        this.numLlantas = numLlantas;
        this.placa = placa;
    }


    // Metodos de la clase
    public void frenar()
    {
        System.out.println("El carro " + marca + " está frenando.");
    }

    public void acelerar()
    {
        System.out.println("El carro " + marca + " está acelerando.");
    }

    public void pitar()
    {
        System.out.println("El carro " + marca + " está pitando.");
    }

    public void estacionar()
    {
        System.out.println("El carro " + marca + " está estacionando.");
    }

}
