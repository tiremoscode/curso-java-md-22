package practicas.calculadora.karenabi;

public class calculadora {
    public static void main (String[]args){
        operaciones num1= new operaciones(76, 14);
        operaciones num2= new operaciones(56, 8);
        operaciones num3= new operaciones(46, 8);
        operaciones num4= new operaciones(89, 17);
        num1.suma();
        num2.multiplicacion();
        num3.division();
        num4.resta();
        
        
        }
}
