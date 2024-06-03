package practicas.pokemon.melissanavarro;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard = new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 30);
        PokemonPlanta vileplume = new PokemonPlanta ("vileplume", 25);
        PokemonTierra sandslash = new PokemonTierra ("sandslash", 21);
        PokemonVeneno arbok = new PokemonVeneno ("arbok", 27);

        charizard.atacar();
        squirtle.atacar();
        vileplume.atacar();
        sandslash.atacar();
        arbok.atacar();

        // Mostrar la edad de Charizard
        System.out.println("La edad de charizard es " + charizard.getEdad());
        System.out.println("La edad de squirtle es " + squirtle.getEdad());
        System.out.println("La edad de vileplume es " + vileplume.getEdad());
        System.out.println("La edad de sandslash es " + sandslash.getEdad());
        System.out.println("La edad de arbok es " + arbok.getEdad());
    }
}
