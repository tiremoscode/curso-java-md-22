package practicas.claseCalculadora.melissaNavarro;

public class calculadora {
    public static void main(String[] args) {
        operaciones suma1 = new operaciones(10, 15);
        operaciones resta1 = new operaciones(30, 20);
        operaciones multiplicacion1 = new operaciones(25, 5);
        operaciones division1 = new operaciones(100, 2);

        suma1.suma();
        resta1.resta();
        multiplicacion1.multiplicacion();
        division1.division();

    
    }
}
