public class Calculadora {

    public static void main(String[] args) {
        Operaciones sum = new Operaciones(8, 10);
        Operaciones rest = new Operaciones(20, 10);
        Operaciones mult = new Operaciones(2, 10);
        Operaciones div = new Operaciones(40, 10);

        sum.suma();
        rest.resta();
        mult.multiplicacion();
        div.division();
    }
}