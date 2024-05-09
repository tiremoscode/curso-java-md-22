
//import javax.swing.JOptionPane;
import javax.swing.*;

public class Graficas {
    public static void main(String[] args) {
        // Solicitamos la edad del usuario
        // mediante un JOptionPane

        String input = JOptionPane.showInputDialog("Por favor, ingresa tu edad:");

        int edad = Integer.parseInt(input);

        // Comprobar la edad y mostrar un mensaje adeucado.
        if (edad >=18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
