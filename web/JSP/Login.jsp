<%-- 
    Document   : ManagerAddProfesor
    Created on : Sep 18, 2016, 11:31:54 PM
    Author     : porta
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="CRUD.CRUDProfesores"%>
<%@page import="modelo.Profesores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String usuario = request.getParameter("user");
            String contrasena = request.getParameter("password");
            if(usuario=="" || contrasena=="")
            {
                JOptionPane.showMessageDialog(null,"Hola");
            }
            
             
            
         
            
           
        %>
    </body>
</html>
