/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import CRUD.CRUDMonitores;
import CRUD.CRUDProfesores;
import CRUD.CRUDSalones;
import CRUD.CRUDUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Borrar", urlPatterns = {"/delete"})
public class Borrar extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {

        String idTemp = request.getParameter("id");
        String op = request.getParameter("n");

        if ("1".equals(op)) {
            CRUDMonitores da = new CRUDMonitores();
            da.delete(idTemp);
            response.sendRedirect("/Proyecto_Salas/MostrarMonitores");
        } else if ("2".equals(op)) {
            CRUDUsuario da = new CRUDUsuario();
            boolean respuesta = da.delete(idTemp);
            if (respuesta) {
                response.sendRedirect("/ProyectoSalas/mostraru");
            }
            else{
                PrintWriter out = response.getWriter();
                out.println("error");
            }
        } else if ("3".equals(op)) {
            int id = Integer.parseInt(idTemp);
            CRUDProfesores da = new CRUDProfesores();
            da.delete(id);
            response.sendRedirect("/Proyecto_Salas/mostrarp");
        } else {
            CRUDSalones da = new CRUDSalones();
            String idTemp2 = request.getParameter("id2");
            System.out.println(idTemp);
            System.out.println(idTemp2);
            boolean respuesta=da.delete(idTemp, idTemp2);
            System.out.println(respuesta);
               if (respuesta) 
            {
                response.sendRedirect("/ProyectoSalas/Mostrars");
            }
            else
            {
                PrintWriter out = response.getWriter();
                out.println("error");
            }
            
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
