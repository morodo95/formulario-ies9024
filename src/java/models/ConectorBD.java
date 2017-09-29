package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectorBD {
    Connection conexion;
    final String URL_BASEDATOS = "jdbc:mysql://127.0.0.1/Formulario_DB";
    final String USUARIO = "root";
    final String CONTRASEÑA = "";
    Statement state;
    

    public ConectorBD() {
        try {
            conexion = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertar(String nombre, String apellido, int edad) {
        Statement statement;

        try {
            String sentencia;
            sentencia = "INSERT INTO Alumno VALUES (NULL,'" + nombre + "','" + apellido + "','" + edad + "')";
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
