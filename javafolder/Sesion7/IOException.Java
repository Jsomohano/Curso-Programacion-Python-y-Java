import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class IOException {
    
    public static void main(String[] args) {
        IOException demo = new IOException();
        
        System.out.println("=== DEMOSTRACIÓN DE IOException ===\n");
        
        // 1. Lectura de archivo que no existe
        demo.ejemploArchivoNoExiste();
        
        // 2. Escritura en archivo
        demo.ejemploEscrituraArchivo();
        
        // 3. Lectura de archivo existente
        demo.ejemploLecturaArchivo();
        
        // 4. Manejo de diferentes tipos de IOException
        demo.ejemploTiposDeIOException();
        
        // 5. Uso de try-with-resources
        demo.ejemploTryWithResources();
    }
    
    /**
     * Ejemplo 1: Intentar leer un archivo que no existe
     * Esto generará FileNotFoundException (subtipo de IOException)
     */
    public void ejemploArchivoNoExiste() {
        System.out.println("1. EJEMPLO: Archivo que no existe");
        System.out.println("-----------------------------------");
        
        try {
            FileReader archivo = new FileReader("archivo_inexistente.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea = lector.readLine();
            System.out.println("Contenido: " + linea);
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("❌ ERROR: Archivo no encontrado");
            System.out.println("Mensaje: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("❌ ERROR de E/S: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Ejemplo 2: Escribir en un archivo
     * Demuestra manejo correcto de IOException en escritura
     */
    public void ejemploEscrituraArchivo() {
        System.out.println("2. EJEMPLO: Escritura de archivo");
        System.out.println("---------------------------------");
        
        try {
            FileWriter escritor = new FileWriter("ejemplo.txt");
            escritor.write("¡Hola desde Java!");
            escritor.write("\nEste es un ejemplo de manejo de IOException");
            escritor.write("\nFecha: " + java.time.LocalDateTime.now());
            escritor.close();
            System.out.println("✅ Archivo 'ejemplo.txt' creado exitosamente");
        } catch (java.io.IOException e) {
            System.out.println("❌ ERROR al escribir archivo: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Ejemplo 3: Leer el archivo creado anteriormente
     */
    public void ejemploLecturaArchivo() {
        System.out.println("3. EJEMPLO: Lectura de archivo");
        System.out.println("------------------------------");
        
        try {
            FileReader archivo = new FileReader("ejemplo.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            System.out.println("📄 Contenido del archivo:");
            
            while ((linea = lector.readLine()) != null) {
                System.out.println("   " + linea);
            }
            lector.close();
            System.out.println("✅ Archivo leído correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("❌ ERROR: Archivo no encontrado");
        } catch (java.io.IOException e) {
            System.out.println("❌ ERROR de lectura: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Ejemplo 4: Diferentes tipos de IOException
     */
    public void ejemploTiposDeIOException() {
        System.out.println("4. EJEMPLO: Tipos de IOException");
        System.out.println("--------------------------------");
        
        // FileNotFoundException
        try {
            new FileInputStream("no_existe.txt");
        } catch (FileNotFoundException e) {
            System.out.println("🔍 FileNotFoundException: " + e.getClass().getSimpleName());
        }
        
        // EOFException (End of File Exception)
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(new byte[0]));
            dis.readInt(); // Intentar leer cuando no hay datos
        } catch (EOFException e) {
            System.out.println("📄 EOFException: " + e.getClass().getSimpleName());
        } catch (java.io.IOException e) {
            System.out.println("❌ IOException general: " + e.getClass().getSimpleName());
        }
        
        System.out.println("ℹ️  Nota: FileNotFoundException y EOFException son subclases de IOException");
        System.out.println();
    }
    
    /**
     * Ejemplo 5: Try-with-resources (recomendado para manejo de recursos)
     */
    public void ejemploTryWithResources() {
        System.out.println("5. EJEMPLO: Try-with-resources");
        System.out.println("------------------------------");
        
        // El try-with-resources automáticamente cierra los recursos
        try (FileWriter escritor = new FileWriter("recursos.txt");
             PrintWriter print = new PrintWriter(escritor)) {
            
            print.println("=== INFORMACIÓN SOBRE IOException ===");
            print.println("1. Es una excepción verificada (checked exception)");
            print.println("2. Debe ser manejada con try-catch o declarada con throws");
            print.println("3. Ocurre en operaciones de entrada/salida");
            print.println("4. Subclases comunes: FileNotFoundException, EOFException");
            
            System.out.println("✅ Archivo 'recursos.txt' creado con try-with-resources");
            
        } catch (java.io.IOException e) {
            System.out.println("❌ ERROR en try-with-resources: " + e.getMessage());
        }
        // Los recursos se cierran automáticamente aquí
        System.out.println();
    }
    
    /**
     * Método adicional: Ejemplo interactivo
     */
    public void ejemploInteractivo() {
        System.out.println("6. EJEMPLO: Lectura interactiva");
        System.out.println("-------------------------------");
        
        try (BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingrese el nombre de un archivo para leer: ");
            String nombreArchivo = entrada.readLine();
            
            try (BufferedReader lector = Files.newBufferedReader(Paths.get(nombreArchivo))) {
                System.out.println("📄 Contenido del archivo " + nombreArchivo + ":");
                String linea;
                while ((linea = lector.readLine()) != null) {
                    System.out.println("   " + linea);
                }
            } catch (NoSuchFileException e) {
                System.out.println("❌ El archivo no existe: " + nombreArchivo);
            }
            
        } catch (java.io.IOException e) {
            System.out.println("❌ ERROR de entrada/salida: " + e.getMessage());
        }
    }
}

/*
=== RESUMEN SOBRE IOException ===

¿QUÉ ES IOException?
- Es una excepción verificada (checked exception)
- Indica problemas en operaciones de entrada/salida
- Debe ser manejada obligatoriamente con try-catch o throws

CUÁNDO OCURRE:
- Al leer/escribir archivos que no existen
- Problemas de permisos de archivos
- Dispositivos de almacenamiento llenos
- Conexiones de red interrumpidas
- Streams cerrados inesperadamente

SUBCLASES COMUNES:
- FileNotFoundException: Archivo no encontrado
- EOFException: Fin de archivo inesperado
- SocketException: Problemas de red
- InterruptedIOException: Operación interrumpida

BUENAS PRÁCTICAS:
1. Usar try-with-resources para cerrar recursos automáticamente
2. Manejar excepciones específicas antes que las generales
3. Proporcionar mensajes de error informativos
4. Limpiar recursos en bloques finally (si no usas try-with-resources)
5. Considerar usar Files y Paths (NIO.2) para operaciones modernas

SINTAXIS BÁSICA:
try {
    // Operación de E/S
} catch (FileNotFoundException e) {
    // Manejo específico
} catch (IOException e) {
    // Manejo general
} finally {
    // Limpieza de recursos (si es necesario)
}
*/
