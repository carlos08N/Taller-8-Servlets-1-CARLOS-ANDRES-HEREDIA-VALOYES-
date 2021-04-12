package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SpringMVC", urlPatterns = {"/SpringMVC"})
public class SpringMVC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Spring MVC</title>"); 
        out.println("<script>");
        out.println("function myFunction() {\n" +
        "  document.getElementById(\"demo\").innerHTML = \"Spring es un framework "
        + "para el desarrollo de aplicaciones y contenedor de inversión "
        + "de control, de código abierto para la plataforma Java.\";\n" +
        "}");
        out.println("</script>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div id=\"demo\">Spring MVC</div>");
        out.println("<button onclick=\"myFunction()\">Mas informacion</button>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    /*CARLOS ANDRES HEREDIA VALOYES*/
}
