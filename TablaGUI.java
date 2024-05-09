import javax.swing.*;

public class TablaGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearTabla();
            }
        });

    }

    private static void crearTabla() {
        // Creamos la ventana
        // donde se colocaran los botones, tablas, etiquetas, etc.
        JFrame frame = new JFrame("Mi primer Tabla en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una tabla
        String[] columnas = { "Nombre", "Edad", "Genero" };

        // Datos que llenaran la tabla
        Object[][] datos = {
                { "Lupita", 26, "Femenino" },
                { "Alberto", 36, "Masculino" },
                { "Gabriel", 26, "Masculino" }
        };

        // Crear la tabla con la información.
        JTable tabla = new JTable(datos, columnas);

        // Agregamos la tabla a un JSCrollPane
        JScrollPane scroll = new JScrollPane(tabla);
        // tabla.setFillsViewPortHeight(true);

        // Añadimos el JSCrollPane al frame.
        frame.add(scroll);

        // Poner un tamaño para esta ventana
        // y además hacerlo visible.
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
