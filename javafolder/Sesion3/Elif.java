package javafolder.Sesion3;

public class Elif {
    public static void main(String[] args) {
        int calificacion = 95;
        String value = System.console().readLine();
        if (calificacion >= 90) {
            System.out.println("Excelente");
        }
        else if (calificacion >= 80) {
            System.out.println("Promedio");
        }
        else if(calificacion >= 70) {
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }

        int var1 = 10;
        int var2 = 20;
    }
}