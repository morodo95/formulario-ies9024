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
            System.out.println("Conexion Fallida");
        }
    }

    public void insertar(String apellido, String nombre, String tipodoc, String dni, String provincia, String departamento, String extranjero, String nacionalidad,String nacimiento, String sexo, String obrasocial, String becado, String segurovida, String establecimiento, String egreso, String jurisdiccion, String establecimientosecundario, String titulosecundario, String egresosecundario, String adeuda, String cuantasasignaturas, String juridisccionescuela, String estudios, String estudiosuper) {
        Statement statement;
        
        try {
            String sentencia;
            int x;
            sentencia = "INSERT INTO `alumno` (`id`, `apellido`, `nombre`, `tipodoc`, `dni`, `provincia`, `departamento`, `extranjero`, `nacionalidad`, `nacimiento`, `sexo`, `obrasocial`, `becado`, `segurovida`, `establecimiento`, `egreso`, `jurisdiccion`, `establecimientosecundario`, `titulosecundario`, `egresosecundario`, `adeudaasignatura`, `cuantasasignaturas`, `juridisccionescuela`, `estudios`, `estudiosuper`) VALUES (NULL,'"+apellido+"','"+nombre+"','"+tipodoc+"','"+dni+"', '"+provincia+"', '"+departamento+"','"+extranjero+"', '"+nacionalidad+"', '"+nacimiento+"', '"+sexo+"','"+obrasocial+"', '"+becado+"', '"+segurovida+"', '"+establecimiento+"', '"+egreso+"', '"+jurisdiccion+"', '"+establecimientosecundario+"', '"+titulosecundario+"', '"+egresosecundario+"', '"+adeuda+"', '"+cuantasasignaturas+"', '"+juridisccionescuela+"', '"+estudios+"', '"+estudiosuper+"');";
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void insertar(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22,String string23) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
