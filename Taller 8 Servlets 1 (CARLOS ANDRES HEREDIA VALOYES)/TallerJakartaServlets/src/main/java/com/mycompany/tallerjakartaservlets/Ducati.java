package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ducati", urlPatterns = {"/Ducati"})
public class Ducati extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ducati</title>");           
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Ducati</h1>");
        out.println("<br><br><br>");
        out.println("<p>\n Ducati Motor Holding S.p.A. es una empresa italiana fabricante de \n" +
        " motocicletas, fundada en 1926 en Bolonia por el ingeniero Antonio \n" +
        " Cavalieri Ducati, Carlo Crespi y tres de sus hijos, pero no fue hasta \n" +
        " 1952 cuando diseñaron su primera motocicleta.\n" +
        " </p>");
        out.println("<br><br><br>");
        out.println("<img src=\"IMG/i1.png\" alt=\"Ducati\">");
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
