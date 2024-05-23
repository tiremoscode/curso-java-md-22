package ejerciciosClase.alumnas;

import java.sql.*;

public class Grupo22 {
    public static void main(String[] args) {
        // Parámetros de conexión
        // JDBC - Java DataBase Connectivity
        String url = "jdbc:mysql://localhost:3306/grupo22";
        String usuario = "root";
        String password = "buttons";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer la conexión con la bd
            connection = DriverManager.getConnection(url, usuario, password);

            // Crear una declaración de datos
            statement = connection.createStatement();

            // Ejecutar una consulta SQL
            // Para validar que mi conexión haya sido correcta.

            String query = "SELECT * FROM alumnas";
            resultSet = statement.executeQuery(query);

            // Visualizar los resultados en consola.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
    }
}