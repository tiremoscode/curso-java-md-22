package practicas_programacion.dalel;

public class PokemonHada extends Pokemon implements Elemental {
    public PokemonHada(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Hada";
    }

    @Override
    public int getEdad() {
        return 30;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Se disfraza!");
    }

}
