package ejerciciosClase.practicas_programacion;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Para que un año sea considerado bisiesto
        // tiene que cumplor con las siguientes características
        // Divisible entre 4
        // No es divisible por 100, excepto que sea diviible por 400.
        // Ejemplos de años bisiestos - 2000, 2024, 2400
        // Ejemplos de años no bisiestos - 1800 y 1900

        int bisiesto = 1900;
        if ((bisiesto % 4 == 0 && bisiesto % 100 != 0) || (bisiesto % 400 == 0)) {
            System.out.println("El año " + bisiesto + " si es bisiesto");
        } else {
            System.out.println("El año " + bisiesto + " no es bisiesto");
        }

    }
}
