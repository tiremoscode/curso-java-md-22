package Emilia_Anguiano;

public class Calculadora {

    public static void main(String[] args) {
    
        Operaciones no1 = new Operaciones(5, 10);
        Operaciones no2 = new Operaciones(75, 43);
        Operaciones no3 = new Operaciones(35, 12);
        Operaciones no4 =new Operaciones(120, 35);

        no1.suma();
        no2.resta();
        no3.multiplicacion();
        no4.division();

    }
}
