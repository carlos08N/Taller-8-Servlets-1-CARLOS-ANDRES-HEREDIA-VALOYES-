package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Suzuki", urlPatterns = {"/Suzuki"})
public class Suzuki extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Suzuki</title>");           
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Suzuki</h1>");
        out.println("<br><br><br>");
        out.println("<p>Suzuki Motor Corporation, es una empresa japonesa "
        + "dedicada a la fabricación de automóviles, motocicletas, "
        + "motores fuera borda, y variedad de productos equipados con "
        + "motores de combustión.​ Fue fundada en 1909 en la localidad "
        + "de Hamamatsu, Japón, por Michio Suzuki.​</p>");
        out.println("<br><br><br>");
        out.println("<img src=\"IMG/i3.jpg\" alt=\"Ducati\">");
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
