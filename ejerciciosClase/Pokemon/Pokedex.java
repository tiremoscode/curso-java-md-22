package ejerciciosClase.Pokemon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard = new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 30);

        charizard.atacar();
        squirtle.atacar();
        // Mostrar la edad de Charizard
        System.out.println("La edad de charizard es " + charizard.getEdad());
    }
}
