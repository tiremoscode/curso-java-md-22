class PokemonElectri extends Pokemon implements Elemental {

    public PokemonElectri (String nombre, int nivel){
        super(nombre, nivel);
    }
    @Override
    public String getElementType(){
        return "Electricidad";
    }
    @Override
    public int getEdad(){
        return 28;
    }
    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " Lanza un rayo");
    }
}