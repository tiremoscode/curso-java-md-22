package practicas_programacion.dalel;

public class PokemonAgua extends Pokemon implements Elemental {
    public PokemonAgua(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Agua";
    }

    @Override
    public int getEdad() {
        return 10;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza chorro de agua!");
    }
}
