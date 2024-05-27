package practicas_programacion.jaquelinermz;

public class PokemonVeneno extends Pokemon implements Elemental {
    public PokemonVeneno (String nombre, int nivel){
    super(nombre, nivel);
}
@Override
public String getElementType() {
    return "Veneno";
}
@Override
public int getEdad() {
    return 28;
}
@Override
public void atacar() {
    super.atacar();
    System.out.println(getNombre() + "Lanza veneno!");
}
}
