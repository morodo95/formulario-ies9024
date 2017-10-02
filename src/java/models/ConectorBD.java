package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectorBD {
    Connection conexion;
    final String URL_BASEDATOS = "127.0.0.1/ies9024";
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

    public void insertar(Alumno alumno) {
        Statement statement;

        try {
            String sentencia;
            int x;
            sentencia = "INSERT INTO alumno VALUES (NULL,)";
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
