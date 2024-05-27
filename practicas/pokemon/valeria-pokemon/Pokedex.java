public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard =new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle =new PokemonAgua ("Squirtle", 30);
        PokemonElectri pikachu = new PokemonElectri ("Pikachu", 45);
        PokemonPlanta venusaur = new PokemonPlanta ("Venusaur", 30);

        charizard.atacar();
        squirtle.atacar();
        pikachu.atacar();
        venusaur.atacar();
    

        System.out.println("La edad de charizard es: " + charizard.getEdad());
        System.out.println("La edad de squirtle es: " + squirtle.getEdad());
        System.out.println("La edad de pikachu es: " + pikachu.getEdad());
        System.out.println("La edad de venusaur es: " + venusaur.getEdad());
    }
}