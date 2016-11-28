<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>


<%@page import="CRUD.CRUDUsuario"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String usuario = request.getParameter("usuario");
            String contrasena= request.getParameter("contrasena");
           
            
           Usuario n = new Usuario(nombre,apellidos,usuario,contrasena);
           CRUDUsuario cm = new CRUDUsuario();
           cm.addNew(n);
            
            response.sendRedirect("/Proyecto_Salas/mostraru");
        %>
        
    </body>
</html>
