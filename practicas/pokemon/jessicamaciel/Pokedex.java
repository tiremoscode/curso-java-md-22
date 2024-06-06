package practicas.pokemon.jessicamaciel;

public class Pokedex {

    public static void main(String[] args) {
        PokemonAgua Squirtle = new PokemonAgua("Squirtle", 10);
        PokemonFuego Charizard = new PokemonFuego("Charizard", 36);
        PokemonPlanta Grovyle = new PokemonPlanta("Grovyle", 16);
        PokemonPsiquico Lugia = new PokemonPsiquico("Lugia", 70);

        Squirtle.atacar();
        Charizard.atacar();
        Grovyle.atacar();
        Lugia.atacar();

        System.out.println("La edad de Squirtle es: " + Squirtle.getEdad());
        System.out.println("La edad de Charizard es: " + Charizard.getEdad());
        System.out.println("La edad de Grovyle es: " + Grovyle.getEdad());
        System.out.println("La edad de Lugia es: " + Lugia.getEdad());
    }
}
