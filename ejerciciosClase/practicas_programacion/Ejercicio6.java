
package ejerciciosClase.practicas_programacion;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrda el número de términos en fibonacci");
        int numero = scan.nextInt();

        // Validaciones
        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número positivo");
        } else if (numero == 1) {
            System.out.println("serie de fibonacci es 0");
        } else {
            int primer = 0;
            int segundo = 1;
            System.out.print("Srie de fibonacci: " + primer + " " + segundo);

            for (int i = 2; i < numero; i++) {
                int siguiente = primer + segundo;
                System.out.print(" " + siguiente);
                primer = segundo;
                segundo = siguiente;
            }
        }

    }
}
