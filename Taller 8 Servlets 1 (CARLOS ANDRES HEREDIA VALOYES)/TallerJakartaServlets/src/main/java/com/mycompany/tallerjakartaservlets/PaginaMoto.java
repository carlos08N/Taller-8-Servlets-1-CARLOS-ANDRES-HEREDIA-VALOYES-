package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PaginaMoto", urlPatterns = {"/PaginaMoto"})
public class PaginaMoto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Pagina de motos</title>");           
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Motos</h1>");
        out.println("<br><br><br>");
        out.println("<h1>Ducati</h1>");
        out.println("<br><br><br>");
        out.println("<a href=\"Ducati\">Pagina Ducati</a>");
        out.println("<br><br><br>");
        out.println("<h1>Kawasaki</h1>");
        out.println("<a href=\"Kawasaki\">Pagina Kawasaki</a>");
        out.println("<br><br><br>");
        out.println("<h1>Suzuki</h1>");
        out.println("<a href=\"Suzuki\">Pagina Suzuki</a>");
        out.println("<br><br><br>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
/*CARLOS ANDRES HEREDIA VALOYES*/
}
