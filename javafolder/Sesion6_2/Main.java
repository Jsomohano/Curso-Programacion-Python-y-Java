package javafolder.Sesion6_2;

public class Main {
    public static void main(String[] args) {
        Carro primerCarrito = new Carro("Nissan Versa", "gris", "ABC123",4);
        primerCarrito.arrancar();

        int numeroPuertas = primerCarrito.getNumeroPuertas();
        System.out.println("El carro tiene " + numeroPuertas + " puertas.");

        primerCarrito.setColor("rojo");
        System.out.println("El color del carro es: " + primerCarrito.getColor());


        ///////////////////////////////
        int resultado = Calculadora.sumar(5,7);
        System.out.println("El resultado de la suma es: " + resultado);

        int resultadoResta = Calculadora.restar(10,3);
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
}
