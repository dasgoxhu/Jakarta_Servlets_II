
package com.mycompany.new_taller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Randomnum", urlPatterns = {"/Randomnum"})
public class Randomnum extends HttpServlet {

   
    private ArrayList<Double> N;

@Override
public void init(ServletConfig config) 
throws ServletException
{
    super.init(config);

    Random random = new Random();
    N = new ArrayList<Double>();

    for(int  i=0; i<10; i++)
        N.add(random.nextDouble());
}

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        Double resultado = 0.;
        
        for (Double num: N)
        {
            resultado += num;
        }
        out.println("Resultado de la operación:" + resultado);
    }
   

 

}
