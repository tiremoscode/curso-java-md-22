package practicas_programacion.jaquelinermz;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego magmortar = new PokemonFuego("magmortar", 50);
        PokemonAgua vaporeon = new PokemonAgua("vaporeon", 55);
        PokemonSiniestro umbreon = new PokemonSiniestro("umbreon", 40);
        PokemonVeneno arbok  = new PokemonVeneno("arbok", 60);
        PokemonFantasma gengar = new PokemonFantasma("gengar", 55);

        magmortar.atacar();
        vaporeon.atacar();
        umbreon.atacar();
        arbok.atacar();
        gengar.atacar();

        System.out.println("La edad de magmortar es " + magmortar.getEdad());
        System.out.println("La edad de vaporeon es " + vaporeon.getEdad());
        System.out.println("La edad de umbreon es " + umbreon.getEdad());
        System.out.println("La edad de arbok es " + arbok.getEdad());
        System.out.println("La edad de gengar es " + gengar.getEdad());
        

    }
}
