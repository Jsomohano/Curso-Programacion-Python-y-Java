
package javafolder.Sesion5;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("Maria", 28);
        edades.put("Jaime",27);

        // Acceder a un valor
        System.out.println("Edad de Ana: " + edades.get("Ana"));

        // Recorrer el HashMap
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años");
        }

        // Verificar si contiene una clave
        if (edades.containsKey("Luis")) {
            System.out.println("Luis está en el HashMap");
        }

        // Eliminar un elemento
        edades.remove("Maria");
        System.out.println("Después de eliminar a Maria: " + edades);

        
    }
}
