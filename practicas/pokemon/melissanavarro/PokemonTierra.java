package practicas.pokemon.melissanavarro;

public class PokemonTierra extends Pokemon implements Elemental {
    public PokemonTierra(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Tierra";
    }

    @Override
    public int getEdad() {
        return 10;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza una roca!");
    }

}