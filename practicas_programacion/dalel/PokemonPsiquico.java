package practicas_programacion.dalel;

public class PokemonPsiquico extends Pokemon implements Elemental {
    public PokemonPsiquico(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Psiquico";
    }

    @Override
    public int getEdad() {
        return 40;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Crea un muro mágico!");
    }

}
