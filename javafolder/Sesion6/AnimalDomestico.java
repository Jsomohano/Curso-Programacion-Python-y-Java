package javafolder.POO;

public class AnimalDomestico {
    //Atributos
    public String nombre;
    public String color;
    public double edad;

    //constructor
    public AnimalDomestico(String nombre, String color, double edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    //Metodos

    public void Dormir() {
        System.out.println(" está Durmiendo.");
    }
    public void Correr() {
        System.out.println(" está corriend.");
    }
}
