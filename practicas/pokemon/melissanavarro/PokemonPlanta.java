package practicas.pokemon.melissanavarro;

public class PokemonPlanta extends Pokemon implements Elemental {
    public PokemonPlanta(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Planta";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza una liana!");
    }

}