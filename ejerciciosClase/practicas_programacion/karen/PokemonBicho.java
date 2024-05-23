package ejerciciosClase.practicas_programacion.karen;

class PokemonBicho extends Pokemon implements Elemental {
    public PokemonBicho(String nombre, int nivel) {
       super(nombre, nivel);
    }
 
    public String getElementType() {
       return "Bicho";
    }
 
    public int getEdad() {
       return 10;
    }
 
    public void atacar() {
       super.atacar();
       System.out.println(this.getNombre() + " atacar!");
    }
 }