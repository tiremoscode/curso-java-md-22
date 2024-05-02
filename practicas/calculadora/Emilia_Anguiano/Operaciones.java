package Emilia_Anguiano;

public class Operaciones {
    public int numero1;
    public int numero2;
    
    public Operaciones (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void suma (){
        int suma = numero1 + numero2;
        System.out.println("La suma es igual a: " +suma);
    }

    public void resta (){
        int resta = numero1 - numero2;
        System.out.println("La resta es igual a: " +resta);
    }

    public void multiplicacion (){
        int multiplicaciion = numero1 * numero2;
        System.out.println("La multiplicación es igual a: " +multiplicaciion);
    }

    public void division (){
        int division = numero1 / numero2;
        System.out.println("La división es igual a: " +division);
    }

    }

