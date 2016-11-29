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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Editar", urlPatterns = {"/edit"})
public class Editar extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException
    {
        String idTemp = request.getParameter("id");
        String op = request.getParameter("n");
        if(op.equals("1"))
        {
           request.setAttribute("getNewsById", CRUDMonitores.getMonitorConDocumento(idTemp));
           RequestDispatcher rd = request.getRequestDispatcher("EditarMonitores.jsp");
              try 
           {
            rd.forward(request, response);
           } 
              catch (ServletException | IOException ex)
           {
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
   
        else if(op.equals("2"))
        {
           request.setAttribute("getNewsById", CRUDUsuario.getUsuario(idTemp));
           RequestDispatcher rd = request.getRequestDispatcher("EditarUsuario.jsp");  
               try 
           {
            rd.forward(request, response);
           } 
              catch (ServletException | IOException ex)
           {
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        else if(op.equals("3"))
        {
           
           int id = Integer.parseInt(idTemp);
         
           request.setAttribute("getNewsByCedula", CRUDProfesores.getNewByCedula(id));
           RequestDispatcher rd = request.getRequestDispatcher("EditarProfesor.jsp");  
               try 
           {
               System.out.println("yes");
            rd.forward(request, response);
           } 
              catch (ServletException | IOException ex)
           {
           
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
            else 
        {
           
           
           String idTemp2 = request.getParameter("id2");
           request.setAttribute("getSalonByID", CRUDSalones.getSalonByID(idTemp,idTemp2));
           RequestDispatcher rd = request.getRequestDispatcher("EditarSalon.jsp");  
            System.out.println("no puede ser");
               try 
           {
               System.out.println("dkdkdkdkdkdk");
            rd.forward(request, response);
           } 
              catch (ServletException | IOException ex)
           {
               System.out.println("2");
               System.out.println("aqui"+ex.getMessage());
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
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
