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
    public String mostrarAlumnos(){
    
        try {
            File archivoHTML = new File("C:\\Users\\Tommy\\Documents\\NetBeansProjects\\FormularioInscripcion\\web\\vedel.html");
            String archivoConvertido = FileUtils.readFileToString(archivoHTML);
            String h = ""; 
            ConectorBD list = new ConectorBD();
            ArrayList alumnos = new ArrayList();
            alumnos = list.select();
            h += "<table>";
            for(int x = 0; x < alumnos.size(); ++x){
                String [] t = (String[]) alumnos.get(x);
                h += "<tr>";
                for(int p = 0; p < 4; ++p){
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
