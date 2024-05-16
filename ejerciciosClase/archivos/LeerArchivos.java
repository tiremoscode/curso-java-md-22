package ejerciciosClase.archivos;

import java.io.*;

public class LeerArchivos {
    public static void main(String[] args) {
        // Definir el nombre del archivo que
        // hare lectura.
        String miArchivoTexto = "curso22.txt";

        // Intentaremos leer el archivo de texto existente
        // usando la clase BufferedReader.

        try (BufferedReader reader = new BufferedReader(new FileReader(miArchivoTexto))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El archivo no fue localizado");
        }
    }
}
