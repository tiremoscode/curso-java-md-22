package practicas_programacion.Esmeralda_Aguilar;

public class Pokedex {
    
    public static void main(String[] args) {
        
        PokemonFuego charizard = new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 30);
        PokemonPlanta bulbasaur = new PokemonPlanta( "Bulbasaur", 100);
        PokemonVeneno arbok = new PokemonVeneno("Arbok", 150);
        PokemonTierra diglett = new PokemonTierra("Diglett", 25);

        charizard.atacar();
        squirtle.atacar();
        bulbasaur.atacar();
        arbok.atacar();
        diglett.atacar();

        System.out.println("La edad de Charizard es " + charizard.getEdad());
        System.out.println("La edad de Squirtle es " + squirtle.getEdad());
        System.out.println("La edad de Bulbasaur es "+ bulbasaur.getEdad());
        System.out.println("La edad de Arbok es "+ arbok.getEdad());
        System.out.println("La edad de Diglett es "+ diglett.getEdad());
}

}