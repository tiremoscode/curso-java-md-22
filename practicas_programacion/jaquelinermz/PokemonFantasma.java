package practicas_programacion.jaquelinermz;

public class PokemonFantasma extends Pokemon implements Elemental {
    public PokemonFantasma (String nombre, int nivel){
    super(nombre, nivel);
}
@Override
public String getElementType() {
    return "Fantasma";
}
@Override
public int getEdad() {
    return 19;
}
@Override
public void atacar() {
    super.atacar();
    System.out.println(getNombre() + "Se esconde en su sombra y ataca!");
}
}
