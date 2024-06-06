package practicas_programacion.jessicamaciel;

public class PokemonPsiquico extends Pokemon implements Elemental {
    public PokemonPsiquico(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElementType() {
        return "Psiquico";
    }

    @Override
    public int getEdad() {
        return 70;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Derriba el edificio!");
    }   
}
