package com.mycompany.tallerjakartaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "JavaServerFaces", urlPatterns = {"/JavaServerFaces"})
public class JavaServerFaces extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>JavaServerFaces</title>"); 
        out.println("<style>");
        out.println("div {\n" +
        "  background-color: lightblue;\n" +
        "}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1><em><strong>Java Server Faces</strong></em></h1>");
        out.println("<div class=\"temp\">");
        out.println("<p><em><strong> una tecnología y framework para aplicaciones Java "
        + "basadas en web que simplifica el desarrollo de interfaces de "
        + "usuario en aplicaciones Java EE. JSF usa JavaServer Pages (JSP) como "
        + "la tecnología que permite hacer el despliegue de las páginas, pero también "
        + "se puede acomodar a otras tecnologías como XUL (acrónimo de XML-based User-interface Language, "
        + "lenguaje basado en XML para la interfaz de usuario).</strong></em></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
/*CARLOS ANDRES HEREDIA VALOYES*/
}
