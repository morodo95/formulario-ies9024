/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo;
import org.apache.commons.io.FileUtils;
public class Vista {
    public String crearVista(){
    
        try {
            File archivoHTML = new File("C:\\Users\\Tommy\\Documents\\NetBeansProjects\\FormularioInscripcion\\web\\vedel.html");
            String archivoConvertido = FileUtils.readFileToString(archivoHTML);
            String reemplazo = ""; 
            Modelo list = new Modelo();
            ArrayList alumnos = new ArrayList();
            alumnos = list.select();
            reemplazo += "";
            reemplazo += "<table>";
            reemplazo += "<tr>";
            reemplazo += "<td>ID</td>" + "<td>Apellido</td>" + "<td>Nombre/s</td>" + "<td>Tipo de identificacion</td>" + "<td>Nro</td>" + 
                    "<td>Provincia</td>" + "<td>Departamento</td>" + "<td>Extranjero</td>" + "<td>Nacionalidad</td>" + 
                    "<td>Fecha de nacimiento</td>" + "<td>Sexo</td>" + "<td>Obra Social</td>" + "<td>Beca</td>" +
                    "<td>Seguro de vida</td>" + "<td>Establecimiento primerio</td>" + "<td>Año de egreso</td>" +
                    "<td>Jurisdiccion</td>" + "<td>Establecimiento secundario</td>" + "<td>Titulo secundario</td>" + 
                    "<td>Año de egreso</td>" + "<td>Deuda de asignaturas</td>" + "<td>Cantidad</td>" + "<td>Jurisdiccion</td>" +
                    "<td>Otros estudios</td>" + "<td>Estudios superiores</td>";
            reemplazo += "</tr>";
            for(int x = 0; x < alumnos.size(); ++x){
                String [] t = (String[]) alumnos.get(x);
                reemplazo += "<tr>";
                for(int p = 0; p < 25; ++p){
                    reemplazo += "<td>  " + t[p] + "  </td>";   
                }
                reemplazo += "</tr>";
            }
            reemplazo += "</table>";
            archivoConvertido = archivoConvertido.replace("[ALUMNOS]", reemplazo);
            return archivoConvertido;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
}
