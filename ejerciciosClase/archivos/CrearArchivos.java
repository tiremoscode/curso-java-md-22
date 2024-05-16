package ejerciciosClase.archivos;

import java.io.*;
import java.util.Scanner;

public class CrearArchivos {
    public static void main(String args[]) {

        // Definir el ingreso de datos
        // con nuestra clase Scanner
        Scanner scan = new Scanner(System.in);

        // Definimos el nombre de nuestro archivo.
        String miArchivoTexto = "curso22.txt";

        // Definir el contenido
        // que será guardado en el archivo.
        // String contenido = "Hola grupo 22, los saludo en este archivo";
        System.out.println("Ingresa una frase");
        String dato = scan.nextLine();

        // definir nuestra acción
        // de guardado de datos.
        try (FileWriter writer = new FileWriter(miArchivoTexto)) {
            writer.write(dato);
            System.out.println("Información escrita con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }
}
