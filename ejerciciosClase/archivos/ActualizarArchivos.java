package ejerciciosClase.archivos;

import java.io.*;
import java.util.Scanner;

public class ActualizarArchivos {

    // Métood para leer el archivo

    public static void leerArchivo(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El archivo no fue localizado");
        }
    }

    public static void actualizarArchivo(String archivo, String nuevoContenido) {
        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write(nuevoContenido);
            System.out.println("Información actualizada exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El archivo no fue localizado");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String miArchivoTexto = "curso22.txt";

        // Leer el archivo
        System.out.println("Leyendo el contenido de mi archivo");
        leerArchivo(miArchivoTexto);

        // añado más contenido al archivo
        System.out.println("Añade una nueva frase para el archivo");
        String datoNuevo = scan.nextLine();
        actualizarArchivo(miArchivoTexto, "\n" + datoNuevo);

        // Leer el archivo nuevamente
        // para visualizar el nuevo contenido
        System.out.println("Leyendo el contenido de mi archivo una vez más");
        leerArchivo(miArchivoTexto);
    }
}
