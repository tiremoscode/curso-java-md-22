public class Calculadora {

    public static void main(String[] args) {
        Operaciones num1 = new Operaciones(67, 95);
        Operaciones num2 = new Operaciones(300, 190);
        Operaciones num3 = new Operaciones(78, 3);
        Operaciones num4 = new Operaciones(480, 40);

        num1.suma();

        num2.resta();

        num3.multiplicacion();

        num4.division();
    }
}