public class Alumna {
    public String nombre;
    public int edad;
    public String genero;

    // Constructor

    public Alumna(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Acciones

    // Escuchar
    // Realizar Tareas
    // Aprender

    public void escuchar(){
        System.out.println(nombre + " escucha la clase de Java!");
    }

    public void hacerTarea(){
        System.out.println(nombre + " no hizo la tarea");
    }

    public void participarEnClase(){
        System.out.println(nombre + " participa en clase");
    }

}
