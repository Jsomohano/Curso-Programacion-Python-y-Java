package javafolder;

public class Condicionales {
    public static void main(String[] args) {
        int edad = 19;
        if (edad >= 18){
            System.out.println("Es mayor de edad");
            System.out.println("puede votar");
            System.out.println("Puede conducir");
        }
        else {
            System.out.println("No es mayor de edad");
        }

        System.out.println("Fin del programa");
    }
}