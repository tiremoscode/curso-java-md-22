package practicas.claseCalculadora.melissaNavarro;

public class operaciones {
    public int numero1;
    public int numero2;


         //constructor 
    public operaciones (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }
      //acciones de una calculadora
    public void suma (){
        int suma = numero1 + numero2;
        System.out.println("Suma :"+suma);

    }
    public void resta (){
        int resta = numero1 - numero2;
        System.out.println("Resta :"+resta);
    }
    public void multiplicacion (){
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicacion :"+multiplicacion);

    }
    public void division (){
        int division = numero1 / numero2;
        System.out.println("Division :"+division);
    }

}
