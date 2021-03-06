/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import BaseDatos.Consultas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author smarv
 */
public class RegistraPregunta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");

        String IdPregunta = "";
        String NombrePregunta = "";
        String IdEncuesta = "";

        if (request.getParameter("IdPregunta") != null) {
            IdPregunta = request.getParameter("IdPregunta");
        }

        if (request.getParameter("NombrePregunta") != null) {
            NombrePregunta = request.getParameter("NombrePregunta");
        }

        if (request.getParameter("IdEncuesta") != null) {
            IdEncuesta = request.getParameter("IdEncuesta");
        }

        System.out.println("IdPregunta: " + IdPregunta);
        System.out.println("NombrePregunta: " + NombrePregunta);
        System.out.println("IdEncuesta: " + IdEncuesta);

        Consultas con = new Consultas();
        
        if (con.registraPregunta(IdPregunta, NombrePregunta, IdEncuesta)) {
            response.sendRedirect("Preguntas.jsp");
        } else {
            response.sendRedirect("AltaPreguntas.jsp?idPregunta=" + IdEncuesta);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
