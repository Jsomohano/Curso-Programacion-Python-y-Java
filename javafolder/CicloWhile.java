package javafolder;

public class CicloWhile {
    public static void main(String[] args) {
        int numero = 5;
        int numero_adivinado = Integer.parseInt(System.console().readLine("Adivina el numero: "));
        
        while (numero_adivinado != numero) { 
            System.out.println("Numero incorrecto, vuelve a intentarlo");
            numero_adivinado = Integer.parseInt(System.console().readLine("Adivina el numero: "));
        }

        System.out.println("Felicidades, has adivinado el numero: " + numero);

    }
}