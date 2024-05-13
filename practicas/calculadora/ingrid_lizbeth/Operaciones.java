public class Operaciones {
    public int n1;
    public int n2;

    /*Este es el constructor, inicializamos variables */
    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /*Operaciones para la calculadora */
    public void suma(){
        int suma = n1 + n2;
        System.out.println("El resultado de la suma es: " + suma);
    }

    public void resta(){
        int resta = n1 - n2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    public void multiplicacion(){
        int multi = n1 * n2;
        System.out.println("El resultado de la multiplicacion es: " + multi);
    }

    public void division(){
        int divi = n1 / n2;
        System.out.println("El resultado de la division es: " + divi);
    }
}
