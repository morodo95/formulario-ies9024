/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ConectorBD;
import org.apache.commons.io.FileUtils;
public class Vista {
    public String mostrar(){
    
        try {
            File archivoHTML = new File("C:\\Users\\Tommy\\Documents\\NetBeansProjects\\FormularioInscripcion\\web\\vedel.html");
            String archivoConvertido = FileUtils.readFileToString(archivoHTML);
            String h = ""; 
            ConectorBD list = new ConectorBD();
            ArrayList alumnos = new ArrayList();
            alumnos = list.select();
            h += "";
            h += "<table>";
            h += "<tr>";
            h += "<td>ID</td>" + "<td>Apellido</td>" + "<td>Nombre/s</td>" + "<td>Tipo de identificacion</td>" + "<td>Nro</td>" + 
                    "<td>Provincia</td>" + "<td>Departamento</td>" + "<td>Extranjero</td>" + "<td>Nacionalidad</td>" + 
                    "<td>Fecha de nacimiento</td>" + "<td>Sexo</td>" + "<td>Obra Social</td>" + "<td>Beca</td>" +
                    "<td>Seguro de vida</td>" + "<td>Establecimiento primerio</td>" + "<td>Año de egreso</td>" +
                    "<td>Jurisdiccion</td>" + "<td>Establecimiento secundario</td>" + "<td>Titulo secundario</td>" + 
                    "<td>Año de egreso</td>" + "<td>Deuda de asignaturas</td>" + "<td>Cantidad</td>" + "<td>Jurisdiccion</td>" +
                    "<td>Otros estudios</td>" + "<td>Estudios superiores</td>";
            h += "</tr>";
            for(int x = 0; x < alumnos.size(); ++x){
                String [] t = (String[]) alumnos.get(x);
                h += "<tr>";
                for(int p = 0; p < 25; ++p){
                    h += "<td>  " + t[p] + "  </td>";   
                }
                h += "</tr>";
            }
            h += "</table>";
            archivoConvertido = archivoConvertido.replace("[ALUMNOS]", h);
            return archivoConvertido;
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
}
