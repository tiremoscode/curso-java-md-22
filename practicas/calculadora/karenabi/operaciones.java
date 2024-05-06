package practicas.calculadora.karenabi;

public class operaciones {
        public int numero1;
        public int numero2;
    public operaciones(int numero1, int numero2){
    this.numero1= numero1;
    this.numero2= numero2;
    
    }
    
 public void suma (){
           int suma= numero1+ numero2;
            System.out.println("suma "+suma);
        }
 public void resta (){
         int resta= numero1- numero2;
            System.out.println("resta"+resta);
        }
 public void multiplicacion(){
            int multiplicacion= numero1*numero2;
            System.out.println("multiplicacion"+multiplicacion);
        }
 public void division(){
            int division= numero1/numero2;
            System.out.println("division"+division);
        }

    }
    

