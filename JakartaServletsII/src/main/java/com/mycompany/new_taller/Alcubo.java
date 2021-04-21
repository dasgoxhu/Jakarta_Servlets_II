
package com.mycompany.new_taller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Alcubo", urlPatterns = {"/Alcubo"})
public class Alcubo extends HttpServlet {

      

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
           
        Integer N = Integer.valueOf(request.getParameter("N"));
        
        Integer R = (int)Math.pow(N, 3);
        
        
        
        PrintWriter out = response.getWriter();
        
        out.println("El cubo del numero ingresado es:" +R);
     
    }
}
