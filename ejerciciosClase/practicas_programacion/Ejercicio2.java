package ejerciciosClase.practicas_programacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Verificar que un numero sea par o impar
        // de acuerdo a lo que el usuario ingrese
        Scanner sca = new Scanner(System.in);

        // Ingrdar un numero por parte del usuario
        System.out.println("Ingresa un numero: ");
        int numero = sca.nextInt();

        // Validar si es un numero par o impar.
        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " es un numero impar");
        }

        // Cerramos scanner para entrada de texto
        sca.close();
    }
}
