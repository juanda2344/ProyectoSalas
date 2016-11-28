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
            String idTemp = request.getParameter("usuario");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String contrasena = request.getParameter("contrasena");
           
            
            CRUDUsuario da = new CRUDUsuario();
            da.edit(nombre, apellidos,idTemp,contrasena);
            
            response.sendRedirect("/Proyecto_Salas/mostraru");
        %>
    </body>
</html>
