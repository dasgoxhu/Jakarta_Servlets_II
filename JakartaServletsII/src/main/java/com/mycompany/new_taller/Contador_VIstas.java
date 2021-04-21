
package com.mycompany.new_taller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Contador_VIstas", urlPatterns = {"/Contador_VIstas"})
public class Contador_VIstas extends HttpServlet {

   
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        int visitas = 1;
        HttpSession session = request.getSession();
        
        if (session.getAttribute("ContadorVistas") != null)
        {
            visitas = (int)session.getAttribute("ContadorVistas");
            visitas += 1;
        }
        
        session.setAttribute("ContadorVistas", visitas);
        PrintWriter out = response.getWriter();
        out.println("Numero de visitas de la pagina: " + visitas);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        int visitas = 1;
        HttpSession session = request.getSession();
        
        if (session.getAttribute("ContadorVistas") != null)
        {
            visitas = (int)session.getAttribute("ContadorVistas");
            visitas += 1;
        }
        
        session.setAttribute("ContadorVistas", visitas);
        PrintWriter out = response.getWriter();
        out.println("Numero de visitas de la pagina: " + visitas);
    }

}
   
   