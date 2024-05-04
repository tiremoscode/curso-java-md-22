public class Operaciones {
    
    public int num1;
    public int num2;

    public Operaciones (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }


public void suma (){
    int suma = num1 + num2;
    System.out.println("El resultado de la suma es: " + suma);
}

public void resta (){
    int resta = num1 - num2;
    System.out.println("El resultado de la resta es: " + resta);
}

public void multiplicacion (){
    int multiplicacion = num1 * num2;
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
}

public void division (){
    int division = num1 / num2;
    System.out.println("El resultado de la división es: " + division);
}
}
