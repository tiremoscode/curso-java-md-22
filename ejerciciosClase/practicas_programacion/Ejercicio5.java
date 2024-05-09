package ejerciciosClase.practicas_programacion;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Estructura de números
        // 1, 2, 3, 4, 5, 6
        int numero = 123456;
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los digitos de 1,2,3,4,5 y 6 equivale a: " + suma);

    }
}
