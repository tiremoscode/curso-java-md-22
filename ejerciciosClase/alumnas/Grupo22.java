package ejerciciosClase.alumnas;

import java.sql.*;
import java.util.Scanner;

public class Grupo22 {

    // Parámetros de conexión
    // JDBC - Java DataBase Connectivity
    private static String url = "jdbc:mysql://localhost:3306/grupo22";
    private static String usuario = "root";
    private static String password = "buttons";

    public void guardarAlumno(String nombre, int edad) {
        String queryInsertar = "INSERT INTO alumnas (nombre, edad) VALUES(?, ?)";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryInsertar)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);

            int registrosInsertados = preparedStatement.executeUpdate();
            System.out.println("Registros insertados: " + registrosInsertados);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerAlumnos() {
        String query = "SELECT * FROM alumnas";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Visualizar los resultados en consola.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Grupo22 operacionesBD = new Grupo22();
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Ingresa el nombre de la alumna");
            String nombreAlumna = scanner.nextLine();

            System.out.println("Ingresa la edad de la alumna");
            int edadAlumna = scanner.nextInt();

            operacionesBD.guardarAlumno(nombreAlumna, edadAlumna);
            operacionesBD.obtenerAlumnos();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
