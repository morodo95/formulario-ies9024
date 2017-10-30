package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConectorBD {
    Connection conexion;
    final String URL_BASEDATOS = "jdbc:mysql://localhost/registroies";
    final String USUARIO = "root";
    final String CONTRASEÑA = "";
    Statement state;
    private Connection conexionBD;
    private Statement sentencia;
    ArrayList lista = new ArrayList();
    
    public ConectorBD() throws ClassNotFoundException {
        this.conexionBD = null;
        this.sentencia = null;
        System.out.println("Entrando al metodo ConectorBD");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println("Conexión fallada");
        }
    }

    public void insertar(String carrera,String apellido,String nombre,String tipodoc, String dni, String provincia, String departamento, String extranjero, String nacionalidad, String nacimiento, String sexo, String obrasocial,String becado,String segurovida) {
        Statement statement;
        try {
            String sentencia;
            sentencia = "INSERT INTO `Alumno` (`idAlumno`, `carrera`,`apellido`, `nombre`, `tipodoc`, `dni`, `provincia`, "
                    + "`departamento`, `extranjero`, `nacionalidad`, `nacimiento`, `sexo`, `obrasocial`, `becado`, "
                    + "`segurovida`, `establecimiento`, `egreso`, `jurisdiccion`, `establecimientosecundario`, "
                    + "`titulosecundario`, `egresosecundario`, `adeudaasignatura`, `cuantasasignaturas`, "
                    + "`juridisccionescuela`, `estudios`, `estudiosuper`) VALUES (NULL,'"+carrera+"', '"+apellido+"', '"
                    +nombre+"', '"+tipodoc+"', '"+dni+"', '"+provincia+"', '"+departamento+"', '"+extranjero+"', '"
                    +nacionalidad+"', '"+nacimiento+"', '"+sexo+"', '"+obrasocial+"', '"+becado+"','"+segurovida+
                    "', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);";
  
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            System.out.println("No se pudo ingresar los datos error: "+ ex);
        }
    }
    
    public ArrayList select() {
        ResultSet resultado = null;
        String sql = "SELECT * FROM registroies.Alumno;";
        try {
            sentencia = conexionBD.createStatement();
            resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
            String[] vectorTemporal = new String[26];  
            vectorTemporal[0] = resultado.getString("idAlumno");
            vectorTemporal[1] = resultado.getString("carrera");
            vectorTemporal[2] = resultado.getString("apellido");
            vectorTemporal[3] = resultado.getString("nombre");
            vectorTemporal[4] = resultado.getString("tipodoc");
            vectorTemporal[5] = resultado.getString("dni");
            vectorTemporal[6] = resultado.getString("provincia");
            vectorTemporal[7] = resultado.getString("departamento");
            vectorTemporal[8] = resultado.getString("extranjero");
            vectorTemporal[9] = resultado.getString("nacionalidad");
            vectorTemporal[10] = resultado.getString("nacimiento");
            vectorTemporal[11] = resultado.getString("sexo");
            vectorTemporal[12] = resultado.getString("obrasocial");
            vectorTemporal[13] = resultado.getString("becado");
            vectorTemporal[14] = resultado.getString("segurovida");
            vectorTemporal[15] = resultado.getString("establecimiento");
            vectorTemporal[16] = resultado.getString("egreso");
            vectorTemporal[17] = resultado.getString("jurisdiccion");
            vectorTemporal[18] = resultado.getString("establecimientosecundario");
            vectorTemporal[19] = resultado.getString("titulosecundario");
            vectorTemporal[20] = resultado.getString("egresosecundario");
            vectorTemporal[21] = resultado.getString("adeudaasignatura");
            vectorTemporal[22] = resultado.getString("cuantasasignaturas");
            vectorTemporal[23] = resultado.getString("juridisccionescuela");
            vectorTemporal[24] = resultado.getString("estudios");
            vectorTemporal[25] = resultado.getString("estudiosuper");
            lista.add(vectorTemporal);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return lista;
    }
}
    



