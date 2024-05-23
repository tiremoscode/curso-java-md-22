package ejerciciosClase.practicas_programacion.karen;

class PokemonVeneno extends Pokemon implements Elemental {
    public PokemonVeneno(String nombre , int nivel ) {
       super(nombre , nivel);
    }
 
    public String getElementType() {
       return "Veneno";
    }
 
    public int getEdad() {
       return 10;
    }
 
    public void atacar() {
       super.atacar();
       System.out.println(this.getNombre() + " atacar!");
    }
 }
 