public class PokemonElectrico extends Pokemon implements Elemental{
    public PokemonElectrico(String nombre, int nivel){
        super (nombre,nivel);
    }
    @Override
    public String getElementType(){
        return "Electrico";
    }

    @Override
    public int getEdad(){
        return 15;
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " lanza impactrueno");

    }
}
