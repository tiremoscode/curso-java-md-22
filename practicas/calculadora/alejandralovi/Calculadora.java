public class Calculadora {
    
    public static void main (String[] args){
        Operacion num1 = new Operacion(232, 034);
        Operacion num2 = new Operacion(12, 9);
        Operacion num3 = new Operacion(23, 13);
        Operacion num4 = new Operacion(7, 33);


        num1.suma();
        num2.resta();
        num3.division();
        num4.multiplicacion();

    }
    
}
