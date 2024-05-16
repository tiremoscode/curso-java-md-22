package practicas_programacion.dalel;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard = new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 30);
        PokemonHada mimikyu = new PokemonHada("Mimikyu", 100);
        PokemonPsiquico kadabra = new PokemonPsiquico("Kadabra", 70);
        PokemonPsiquico alakasam = new PokemonPsiquico("Alakazam", 70);

        charizard.atacar();
        squirtle.atacar();
        mimikyu.atacar();
        kadabra.atacar();
        alakasam.atacar();

        System.out.println("La edad de Charizard es " + charizard.getEdad());
        System.out.println("La edad de Squirtle es " + squirtle.getEdad());
        System.out.println("La edad de Mimikyu es " + mimikyu.getEdad());
        System.out.println("La edad de Kadabra es " + kadabra.getEdad());
        System.out.println("La edad de Alakasam es " + alakasam.getEdad());

    }

}