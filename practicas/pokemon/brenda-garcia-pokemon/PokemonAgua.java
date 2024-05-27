public class PokemonAgua extends Pokemon implements Elemental{
    public PokemonAgua(String nombre, int nivel){
        super (nombre,nivel);
    }
    @Override
    public String getElementType(){
        return "Agua";
    }

    @Override
    public int getEdad(){
        return 10;
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " lanza un chorro de agua");

    }
}
