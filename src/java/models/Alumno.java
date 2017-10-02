
package models;


public class Alumno {
    String apellido, nombre, tipodoc,dni, provincia, departamento, extranjero,nacionalidad;
    String sexo, obrasocial, becado, segurovida, establecimiento, egreso,jurisdiccion, establecimientosecundario;
    String titulosecundario, egresosecundario, adeuda,cuantasasignaturas,juridisccionescuela,estudios,estudiosuper;

    public Alumno(String apellido, String nombre, String tipodoc, String dni, String provincia, String departamento, String extranjero, String nacionalidad, String sexo, String obrasocial, String becado, String segurovida, String establecimiento, String egreso, String jurisdiccion, String establecimientosecundario, String titulosecundario, String egresosecundario, String adeuda, String cuantasasignaturas, String juridisccionescuela, String estudios, String estudiosuper) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipodoc = tipodoc;
        this.dni = dni;
        this.provincia = provincia;
        this.departamento = departamento;
        this.extranjero = extranjero;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.obrasocial = obrasocial;
        this.becado = becado;
        this.segurovida = segurovida;
        this.establecimiento = establecimiento;
        this.egreso = egreso;
        this.jurisdiccion = jurisdiccion;
        this.establecimientosecundario = establecimientosecundario;
        this.titulosecundario = titulosecundario;
        this.egresosecundario = egresosecundario;
        this.adeuda = adeuda;
        this.cuantasasignaturas = cuantasasignaturas;
        this.juridisccionescuela = juridisccionescuela;
        this.estudios = estudios;
        this.estudiosuper = estudiosuper;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(String extranjero) {
        this.extranjero = extranjero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
