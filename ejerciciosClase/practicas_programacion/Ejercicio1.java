package ejerciciosClase.practicas_programacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Para calcular el area de un circulo
        // Necesitamos multiplicar
        // El valor de Pi
        // por el radio al cuadrado

        // Importamos e instanciamos la clase Scanner
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = sca.nextDouble();

        // Calcular el area de nuestro circulo.
        double areaCirculo = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado del calculo
        System.out.println("El area del circulo es " + areaCirculo);

        // Cerramos el Scanner de texto
        sca.close();

    }
}
