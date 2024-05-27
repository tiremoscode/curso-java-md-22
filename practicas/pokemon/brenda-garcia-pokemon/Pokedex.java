public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charizard = new PokemonFuego("Charizard", 50);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 40);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 100);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 85);
        PokemonPlanta chikorita = new PokemonPlanta("Chikorita", 20);

        charizard.atacar();
        squirtle.atacar();
        pikachu.atacar();
        bulbasaur.atacar();
        chikorita.atacar();

        //edad
        System.out.println("la edad de charizard es " + charizard.getEdad());
        System.out.println("la edad de squirtle es " + squirtle.getEdad());
        System.out.println("la edad de pikachu es " + pikachu.getEdad());
        System.out.println("la edad de bulbasaur es " + bulbasaur.getEdad());
        System.out.println("la edad de chikorita es " + chikorita.getEdad());
    }
}
