<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>

<%@page import="CRUD.CRUDUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String correo = request.getParameter("correo");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String contrasena = request.getParameter("contrasena");
            String usuario = request.getParameter("usuario");
            
            
            CRUDUsuario da = new CRUDUsuario();
            da.edit(nombre, apellidos,usuario,contrasena, correo);
            
            response.sendRedirect("/ProyectoSalas/mostraru");
        %>
    </body>
</html>
