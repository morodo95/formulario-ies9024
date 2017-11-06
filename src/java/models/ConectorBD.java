 package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectorBD {
    final String URL_BASEDATOS = "jdbc:mysql://192.168.0.108/inscriptosies";
    final String USUARIO = "tomas";
    final String CONTRASEÑA = "tomas123";
    private Connection conexionBD;
    private Statement sentencia;
    ArrayList lista = new ArrayList();
    
    public ConectorBD() throws ClassNotFoundException {
        this.conexionBD = null;
        this.sentencia = null;  
        conectar();
    }
    
    public void conectar(){
        System.out.println("Entrando al metodo ConectorBD");
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectorBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexionBD = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println("Conexión fallada");
        }
    }

    public void insertar(String carrera,String apellido,String nombre,String tipodoc, String dni, String provincia, String departamento, String extranjero, String nacionalidad, String nacimiento, String sexo, String obrasocial,String becado,String segurovida) {
        Statement statement;
        try {
            String sta;
            sta = "INSERT INTO `Alumno` (`idAlumno`, `carrera`,`apellido`, `nombre`, `tipodoc`, `dni`, `provincia`, "
                    + "`departamento`, `extranjero`, `nacionalidad`, `nacimiento`, `sexo`, `obrasocial`, `becado`, "
                    + "`segurovida`, `establecimiento`, `egreso`, `jurisdiccion`, `establecimientosecundario`, "
                    + "`titulosecundario`, `egresosecundario`, `adeudaasignatura`, `cuantasasignaturas`, "
                    + "`juridisccionescuela`, `estudios`, `estudiosuper`) VALUES (NULL,'"+carrera+"', '"+apellido+"', '"
                    +nombre+"', '"+tipodoc+"', '"+dni+"', '"+provincia+"', '"+departamento+"', '"+extranjero+"', '"
                    +nacionalidad+"', '"+nacimiento+"', '"+sexo+"', '"+obrasocial+"', '"+becado+"','"+segurovida+
                    "', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);";
  
            statement = this.conexionBD.createStatement();
            statement.executeUpdate(sta);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            System.out.println("No se pudo ingresar los datos error: "+ ex);
        }
    }
    
    public ArrayList select() {
        ResultSet resultado = null;
        String sql = "SELECT * FROM inscriptosies.alumno;";
        try {
            sentencia = conexionBD.createStatement();
            resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
            String[] vectorTemporal = new String[25];  
            vectorTemporal[0] = resultado.getString("id");
            vectorTemporal[1] = resultado.getString("apellido");
            vectorTemporal[2] = resultado.getString("nombre");
            vectorTemporal[3] = resultado.getString("tipodoc");
            vectorTemporal[4] = resultado.getString("dni");
            vectorTemporal[5] = resultado.getString("provincia");
            vectorTemporal[6] = resultado.getString("departamento");
            vectorTemporal[7] = resultado.getString("extranjero");
            vectorTemporal[8] = resultado.getString("nacionalidad");
            vectorTemporal[9] = resultado.getString("nacimiento");
            vectorTemporal[10] = resultado.getString("sexo");
            vectorTemporal[11] = resultado.getString("obrasocial");
            vectorTemporal[12] = resultado.getString("becado");
            vectorTemporal[13] = resultado.getString("segurovida");
            vectorTemporal[14] = resultado.getString("establecimiento");
            vectorTemporal[15] = resultado.getString("egreso");
            vectorTemporal[16] = resultado.getString("jurisdiccion");
            vectorTemporal[17] = resultado.getString("establecimientosecundario");
            vectorTemporal[18] = resultado.getString("titulosecundario");
            vectorTemporal[19] = resultado.getString("egresosecundario");
            vectorTemporal[20] = resultado.getString("adeudaasignatura");
            vectorTemporal[21] = resultado.getString("cuantasasignaturas");
            vectorTemporal[22] = resultado.getString("juridisccionescuela");
            vectorTemporal[23] = resultado.getString("estudios");
            vectorTemporal[24] = resultado.getString("estudiosuper");
            lista.add(vectorTemporal);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return lista;
    }
    
    public void mostrar(){
        for(int x = 0; x < lista.size(); ++x){
                String [] t = (String[]) lista.get(x);
                for(int p = 0; p < 4; ++p){
                    System.out.println(t[p]);  
                }
            }
    }
}
    



