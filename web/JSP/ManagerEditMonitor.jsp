<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>

<%@page import="CRUD.CRUDMonitores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String idTemp = request.getParameter("documento");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String correo = request.getParameter("correo");
            String semestre = request.getParameter("semestre");
            String telefono = request.getParameter("telefono");
            
            CRUDMonitores da = new CRUDMonitores();
            da.edit(nombre, apellidos, idTemp, correo, semestre,telefono);
            
            response.sendRedirect("/Proyecto_Salas/MostrarMonitores");
        %>
    </body>
</html>
