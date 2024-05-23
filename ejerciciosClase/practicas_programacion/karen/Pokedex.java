package ejerciciosClase.practicas_programacion.karen;

public class Pokedex {
    public Pokedex() {
    }
 
    public static void main(String[] var0) {
       PokemonBicho Metapod = new PokemonBicho("Metapod", 60);
       PokemonVeneno Venusaur= new PokemonVeneno("Venusaur", 30);
       PokemonNormal Rattata= new PokemonNormal("Rattata", 8);
       Metapod.atacar();
       Venusaur.atacar();
       Rattata.atacar();
       System.out.println("La edad de Metapod es " +Metapod.getEdad());
       System.out.println("la edad de Venusaur es" +Venusaur.getEdad());
       System.out.println("la edad de Rattata es "+ Rattata.getEdad());
    }
 }
 