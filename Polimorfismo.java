
abstract class Animal {
    // Hace sonido
    // Se alimenta

    abstract void haceSonido();

    abstract void seAlimenta();

}

class Perro extends Animal {
    @Override
    void haceSonido() {
        System.out.println("Guau Guau - Ladra");
    }

    @Override
    void seAlimenta() {
        System.out.println("Come croquetas");
    }
}

class Gato extends Animal {
    @Override
    void haceSonido() {
        System.out.println("Miau Miau - Maulla");
    }

    @Override
    void seAlimenta() {
        System.out.println("Come pescado");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Mandamos llamar a nuestros objetos animales
        // Para Visualizarlos.

        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Crear un arreglo o un listado de animales
        Animal[] animales = { miPerro, miGato };

        // Recorrer l listado de animales.
        for (int i = 0; i < animales.length; i++) {
            animales[i].haceSonido();
            animales[i].seAlimenta();
        }

    }
}