package ejerciciosClase.practicas_programacion.karen;

class PokemonNormal extends Pokemon implements Elemental {
    public PokemonNormal(String nombre, int nivel) {
       super(nombre, nivel);
    }
 
    public String getElementType() {
       return "Normal";
    }
 
    public int getEdad() {
       return 15;
    }
 
    public void atacar() {
       super.atacar();
       System.out.println(this.getNombre() + "atacar");
    }
 }
 