package practicas.calculadora.guadalupe_crespo;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones(5, 4);
        Operaciones op2 = new Operaciones(9, 3);
        Operaciones op3 = new Operaciones(6, 8);
        Operaciones op4 = new Operaciones(3, 4);
        Operaciones op5 = new Operaciones(23, 10);
        Operaciones op6 = new Operaciones(36, 20);
        Operaciones op7 = new Operaciones(15, 5);
        Operaciones op8 = new Operaciones(27, 11);

        op1.suma();
        op2.resta();
        op3.division();
        op4.multiplicacion();

        op5.suma();
        op6.resta();
        op7.division();
        op8.multiplicacion();
    }
}
