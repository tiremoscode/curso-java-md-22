package practicas.calculadora.abigailastorga;

public class Calculadora {

    public static void main(String[] args) {

        Operaciones num1 = new Operaciones(16, 16);
        Operaciones num2 = new Operaciones(22, 2);
        Operaciones num3 = new Operaciones(14, 14);
        Operaciones num4 = new Operaciones(8, 8);

        num1.suma();

        num2.resta();

        num3.multiplicacion();

        num4.division();

    }

}
