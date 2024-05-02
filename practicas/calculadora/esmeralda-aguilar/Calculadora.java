public class Calculadora {
    public static void main(String[] args) {

        Operaciones num1 = new Operaciones(5, 7);
        Operaciones num2 = new Operaciones(8, 3);
        Operaciones num3 = new Operaciones(9, 20);
        Operaciones num4 = new Operaciones(32, 17);
        Operaciones num5 = new Operaciones(25, 30);

        num1.suma();
        num2.resta();
        num3.resta();
        num4.multiplicacion();
        num5.division();

    }

}
