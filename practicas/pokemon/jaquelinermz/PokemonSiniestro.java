package practicas.pokemon.jaquelinermz;

public class PokemonSiniestro extends Pokemon implements Elemental {
    public PokemonSiniestro(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElementType() {
        return "Siniestro";
    }

    @Override
    public int getEdad() {
        return 18;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + "Relucen sus anillos!");
    }
}
