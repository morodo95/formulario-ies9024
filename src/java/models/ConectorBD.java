package models;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectorBD {
    Connection conexion;
    final String URL_BASEDATOS = "jdbc:mysql://localhost:3306/inscriptosies";
    final String USUARIO = "root";
    final String CONTRASEÑA = "";
    Statement state;
    

    public ConectorBD() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertar(String dato,String nombre) {
        Statement statement;

        try {
            String sentencia;
            sentencia = "INSERT INTO `alumno`(`id`, `apellido`,`nombre`) VALUES (null,'"+dato+"','"+nombre+"')";
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    

}
