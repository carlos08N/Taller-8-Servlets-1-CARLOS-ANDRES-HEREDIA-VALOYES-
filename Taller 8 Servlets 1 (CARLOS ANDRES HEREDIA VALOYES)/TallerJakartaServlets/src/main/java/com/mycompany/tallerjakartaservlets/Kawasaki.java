package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Kawasaki", urlPatterns = {"/Kawasaki"})
public class Kawasaki extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kawasaki</title>");           
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Kawasaki</h1>");
        out.println("<br><br><br>");
        out.println("<p>Las motocicletas Kawasaki son fabricadas por la división"
        + " de Motocicletas y Motores de Kawasaki Heavy Industries en "
        + "plantas en Japón, Míchigan, Filipinas, India, Indonesia, "
        + "Bangladés y Tailandia.​</p>");
        out.println("<br><br><br>");
        out.println("<img src=\"IMG/i2.jpg\" alt=\"Ducati\">");
        out.println("<br><br><br>");
        out.println("<a href=\"http://localhost:8080/TallerJakartaServlets/PaginaMoto\">Pagina Principal</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
/*CARLOS ANDRES HEREDIA VALOYES*/
}
