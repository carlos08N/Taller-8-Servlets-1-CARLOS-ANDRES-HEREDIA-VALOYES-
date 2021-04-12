package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HolaMarte", urlPatterns = {"/HolaMarte"})
public class HolaMarte extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<head>");
        out.println("<head>");
        out.println("<title>Hola Marte: Powered by the Perseverance</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1><em><strong>Hola Marte: Powered by the Perseverance</strong></em></h1>");
        out.println("</body></head>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    /**CARLOS ANDRES HEREDIA VALOYES*/
}
