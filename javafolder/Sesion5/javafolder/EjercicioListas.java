package javafolder;

public class EjercicioListas
{
    public static void main(String[] args) 
    {
        // Dado una lista de calificaciones, muestre en pantalla cual es la calificacion mas alta

        int[] grupo_1 = {5,5,5,5,5,5,5,5,5,5,5}; //->93

        int[] grupo_2 = {65, 78, 82, 60, 88, 20, 50}; //->88

        int[]grupo_3 = {75, 80, 91, 58, 85, 30, 60}; //->91

        int respuesta1 = calificacionMasAlta(grupo_1);
        int respuesta2 = calificacionMasAlta(grupo_2);
        int respuesta3 = calificacionMasAlta(grupo_3);

        System.out.println("La calificacion mas alta del grupo 1 es: " + respuesta1);
        System.out.println("La calificacion mas alta del grupo 2 es: " + respuesta2);
        System.out.println("La calificacion mas alta del grupo 3 es: " + respuesta3);
    }

    public static int calificacionMasAlta(int[] lista)
    {
        int ans = 0;
        for(int i = 0;i<lista.length;i++)
        {
            if(lista[i] > ans)
            {
                ans = lista[i];
            }
        }

        return ans;
    }
}