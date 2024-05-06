package ejerciciosClase.practicas_programacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Necesitamos conocer si un numero es positivo, es negativo
        // o es un cero
        Scanner sca = new Scanner(System.in);
        // Solicitamos al usuario que ingrese el numero
        System.out.println("Ingresa el valor: ");

        double numero = sca.nextDouble();
        if (numero > 0) {
            System.out.println("El número " + numero + " Es positivo");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " Es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Cerramos el scanner
        sca.close();
    }
}
