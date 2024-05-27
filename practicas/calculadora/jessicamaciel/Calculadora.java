package practicas.calculadora.jessicamaciel;

public class Calculadora{
    public static void main(String[] args) {
        
    Operaciones ope1 = new Operaciones(10, 2);
    Operaciones ope2 = new Operaciones(10, 2);
    Operaciones ope3 = new Operaciones(10, 2);
    Operaciones ope4 = new Operaciones(10, 2);

    ope1.suma();
    ope2.resta();
    ope3.multiplicacion();
    ope4.division();
}
}
