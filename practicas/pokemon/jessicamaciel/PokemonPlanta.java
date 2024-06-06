package practicas.pokemon.jessicamaciel;

public class PokemonPlanta extends Pokemon implements Elemental {
    public PokemonPlanta(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElementType() {
        return "Planta";
    }

    @Override
    public int getEdad() {
        return 16;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza una rama!");
    }
}