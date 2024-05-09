package practicas.calculadora.guadalupe_crespo;

public class Operaciones {
    public int num1;
    public int num2;
    
    public Operaciones (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    /*Creamos los metodos para las operaciones*/
    public void suma (){
        int suma = num1 + num2;
        System.out.println("La suma es igual a: " + suma);
    }

    public void resta (){
        int resta = num1 - num2;
        System.out.println("La resta es igual a: " + resta);
    }

    public void division (){
        int division = num1 / num2;
        System.out.println("La división es igual a: " + division);
    }

    public void multiplicacion (){
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación es igual a: " + multiplicacion);
    }

}
