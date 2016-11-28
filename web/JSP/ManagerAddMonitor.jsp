<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>

<%@page import="CRUD.CRUDMonitores"%>
<%@page import="modelo.Monitores"%>
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
            String documento = request.getParameter("documento");
            String correo = request.getParameter("correo");
            String semestre = request.getParameter("semestre");
            String telefono = request.getParameter("telefono");
            
            Monitores n = new Monitores(nombre,apellidos,documento,correo,semestre,telefono);
            CRUDMonitores cm = new CRUDMonitores();
            cm.addNew(n);
            
            response.sendRedirect("/Proyecto_Salas/MostrarMonitores");
        %>
        
    </body>
</html>
