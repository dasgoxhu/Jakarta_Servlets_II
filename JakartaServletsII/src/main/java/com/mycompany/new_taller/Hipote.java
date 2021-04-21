
package com.mycompany.new_taller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Hipote", urlPatterns = {"/Hipote"})
public class Hipote extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException 
{
    PrintWriter out = response.getWriter();
    response.setContentType("text/html");

    Float cata = Float.valueOf(request.getParameter("catetoa"));
    Float catb = Float.valueOf(request.getParameter("catetob"));
    Float R = (float)Math.sqrt(Math.pow(cata, 2) + Math.pow(catb, 2));

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Calculo hipotenusa</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>cateto a = " + cata + "</p>");
    out.println("<p>cateto b = " + catb + "</p>");
    out.println("<p>Hipotenusa = " + R + "</p>");
    out.println("</body>");
    out.println("</html>");        
}


}
