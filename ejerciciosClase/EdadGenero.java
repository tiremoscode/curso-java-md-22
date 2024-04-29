package ejerciciosClase;
import java.util.Scanner;

public class EdadGenero {
    // El usuario ingresara la edad 
    // para determinar si es mayor de edad
    // o es menor de edad
    // Así mismo, ingresará si el genero es masculino
    // o femenino y determinar como saludar o dirigirse
    // a esa persona.
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu edad");
        //int edad = 18;
        int edad = sca.nextInt();
        //System.out.println("Edad que el usuario ingreso: "+edad);
        
        sca.nextLine();

        System.out.println("Por favor, ingresa tu genero");
        String genero = sca.nextLine();
        //System.out.println("Genero ingresado "+ genero);

        // Mensaje de edad
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.err.println("Es menor de edad");
        }

        // Saludar de acuerdo al género usando if - else
        if (genero.equalsIgnoreCase("masculino")){
            System.out.println("Bienvenido caballero!");
        } else if(genero.equalsIgnoreCase("femenino")){
            System.out.println("Bienvenida dama!");
        } else {
            System.err.println("Genero no reconocido");
        }

        // utilizando un switch de acuerdo al genero
        switch(genero.toLowerCase()){
            case "masculino":
                System.out.println("Bienvenido caballero!");
                break;
            case "femenino":
                System.out.println("Bienvenida dama!");
                break;
            default:
                System.err.println("Genero no reconocido");
                break;
        }

        // Cerrar el Scanner
        sca.close();


    }
}
