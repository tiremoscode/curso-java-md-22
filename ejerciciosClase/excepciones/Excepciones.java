package ejerciciosClase.excepciones;

import java.util.*;

public class Excepciones {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        // Checked Exceptions.
        // usando bloques try-catch

        try {
            System.out.println("Ingresa tu edad");
            int edad = scan.nextInt();
            System.out.println("Tu edad es " + edad);

            // unckecked exceptions
            // Son excepciones que no requieren manejar expliticamente en el código.
            // ArrayIndexOutOfBoundsException
            int[] numeros = new int[5];
            numeros[0] = 5;
            numeros[1] = 6;
            numeros[2] = 7;
            numeros[3] = 8;
            numeros[4] = 9;

            System.out.println("Posición 5 " + numeros[5]);

            // Errors.
            // Son condiciones graves de las que una aplicación
            // no podrá continuar su ejecución
            // debido a temas externos.
            // OutOfMemoryError.

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Solo puedes ingresar números");
        } finally {
            scan.close();
        }

    }
}
