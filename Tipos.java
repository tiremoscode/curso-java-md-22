public class Tipos {
    public static void main(String[] args) {
        // tipos de Datos

        // Primitivos

        // Tipo de dato findamental que no es un objeto y no requiere
        // ser instanciado para ser usado.

        // int o Integer
        // rango de valores de 
        // -2.147.483.648 a 2.147.483.647
        // decimal
        // 32 bits

        int numero = 10;
        int numero2 = -90;

        // float o Flotante
        // agrega Soporte a un valor decimal
        // Rango de valores 
        // 1.4e-45 a 3.4e38
        // 32 bits
        float numeroFloat = 3.1416f;

        // double
        // rango de valores
        // 4.9e-324 a 1.8e308
        // 64 bits
        double pi = 3.141592654;

        // char
        // caracter
        // 0 a 65535 en valor decimal
        // 16 bits
        char letra = 'A';

        // Boolean
        // Representados para valores verdadros y falsos
        // Controlar flujos de ejecución de unprpgrama - if, while y un dow while.
        boolean hoyDesayune = true;

        // Tipos de dato de referencia

        // String
        String alumna = "Ana Jael";
        String aluman2 = "Guadalupe Crespo";

        // Array
        // Arreglos
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento indice "+i + " Valor en el arreglo "+numeros[i]);
        }
    }
}
