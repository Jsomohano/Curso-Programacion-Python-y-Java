package javafolder.Sesion5;

import java.util.HashMap;
import java.util.Map;

public class EjercicioHashMaps {
    public static void main(String[] args) {
        HashMap<String, Double> estudiantes = new HashMap<>();
        estudiantes.put("Ana", 9.5);
        estudiantes.put("Luis", 9.2);
        estudiantes.put("Marta", 7.8);

        mostrarPromedio(estudiantes);
        calificacionMasAlta(estudiantes);
        calificacionMasBaja(estudiantes);
    }

    public static void mostrarPromedio(HashMap<String, Double> dictCalificaciones) {
        double suma = 0;
        for (double calificacion : dictCalificaciones.values()) {
            suma += calificacion;
        }
        int cantidad = dictCalificaciones.size();
        double promedio = suma / cantidad;
        System.out.println("El promedio es de: " + promedio);
    }

    public static void calificacionMasAlta(HashMap<String, Double> dictCalificaciones) {
        double masAlta = -1;
        String nombreAlta = "";
        for (Map.Entry<String, Double> entry : dictCalificaciones.entrySet()) {
            if (entry.getValue() > masAlta) {
                masAlta = entry.getValue();
                nombreAlta = entry.getKey();
            }
        }
        System.out.println("La persona " + nombreAlta + " tiene la calificación más baja de: " + masAlta);

    }

    public static void calificacionMasBaja(HashMap<String, Double> dictCalificaciones) {
        double masBaja = 11; // Suponiendo escala de 0 a 10
        String nombreBaja = "";
        for (Map.Entry<String, Double> entry : dictCalificaciones.entrySet()) {
            if (entry.getValue() < masBaja) {
                masBaja = entry.getValue();
                nombreBaja = entry.getKey();
            }
        }
        System.out.println("La persona " + nombreBaja + " tiene la calificación más baja de: " + masBaja);
    }
}