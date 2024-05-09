package ejerciciosClase.practicas_programacion;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Encontrar el minimo de 3 numeros
        // Declarar esos 3 numeros y hacer ls comparaciones entre ellos
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 5;

        // Forma número 1 - Usando Math.min
        int minimo = Math.min(Math.min(numero1, numero2), numero3);
        System.out.println("El minimo de estos 3 valores es " + minimo);

        // Forma número 2 - Usando lógica
        int minimoLogica;

        if (numero1 <= numero2 && numero1 <= numero3) {
            minimoLogica = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            minimoLogica = numero2;
        } else {
            minimoLogica = numero3;
        }

        System.out.println("El minimo en el listado de numero es " + minimoLogica);

    }
}
