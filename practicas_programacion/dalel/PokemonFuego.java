package practicas_programacion.dalel;

public class PokemonFuego extends Pokemon implements Elemental {
    public PokemonFuego(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Fuego";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza una llamarada!");
    }

}