public class Calculadora {


    public static void main (String[] args){
        Operaciones num1 = new Operaciones(5,16);
        Operaciones num2 = new Operaciones(20,2);
        Operaciones num3 = new Operaciones(3, 14);
        Operaciones num4 = new Operaciones(2, 1);
        Operaciones num5 = new Operaciones(8,22);
    

        num1.suma();

        num2.multiplicacion();

        num3.suma();

        num4.division();

        num5.multiplicacion();
    }
}