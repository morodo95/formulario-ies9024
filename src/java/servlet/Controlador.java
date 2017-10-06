package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ConectorBD;
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             Enumeration<String> array = request.getParameterNames();
            String [] Array = new String[36];
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"vista/mainformulario1.css\">");
            out.println("<title>Registro IES-9024 Online</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"form_top\">");
            out.println("<h2>IES 9-024 - <span>INSCRIPCIÒN </span>- SISTEMAS <span>Finalizado</span></h2>");
            out.println("<body>");
            out.println("<img src=\"./img/LOGO_NUEVO.png\" >");
            out.println("<h2 style=\"color:brown\">REGISTRO EXITOSO</h2>");
            for(int x=0;x<36;x++){
                Array[x] =  request.getParameter(array.nextElement());
                out.println("<h1>"+Array[x]+"</h1>");
            }
            ConectorBD conectar = new ConectorBD();
            conectar.insertar(Array[0], Array[1], Array[2], Array[3], Array[4], Array[5], Array[6], Array[7], Array[8], Array[9], Array[10], Array[11], Array[12], Array[13], Array[14], Array[15], Array[16], Array[17], Array[18], Array[19], Array[20], Array[21], Array[22], Array[23],Array[24]); 
           
            out.println("</body>");
            out.println("</html>");
        }
    }



}
