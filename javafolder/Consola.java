package javafolder;

public class Consola {
    public static void main(String[] args) {
        //Imprimir valores por consola
        System.out.println("Hola, mundo!");

        //Imprimir valores por consola usando variables
        String nombre = "Juan";
        int edad = 30;

        String primerPalabra = "Hola";
        String segundaPalabra = "Mundo";

        String frase = primerPalabra + " " + segundaPalabra; //Hola Mundo

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        //Solicitar valores por consola
        String nombre_usuario = System.console().readLine("Ingrese su nombre: ");
        
        //Solicitar entrada de dato tipo numero
        String input = System.console().readLine("Ingrese su edad: ");
        int mi_edad = Integer.parseInt(input);
        System.out.println("Tu edad es: " + mi_edad);
    }
}