// Ejemplo de código Java usando métodos
public class ConMetodos {
    public static void main(String[] args) {
        //Codigo principal (Fuera de la funcion)
        int resultadoSuma = suma(5,5);
        suma(resultadoSuma, 7);

    }

    //Funcion
    public static void esParOImpar(int numero)
    {
        if(numero % 2 == 0)
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }
    }

    public static int suma(int a, int b)
    {
        int resultado = a + b;
        System.out.println("La suma de los numeros es: " + resultado);
        return resultado;
    }


}
