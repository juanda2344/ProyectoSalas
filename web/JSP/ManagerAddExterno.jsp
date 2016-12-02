<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>

<%@page import="CRUD.CRUDExterno"%>
<%@page import="modelo.Externo"%>
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
            String documento = request.getParameter("documento");
            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            String entidad = request.getParameter("entidad");
            
            Externo externo = new Externo(documento, nombres, apellidos, correo, telefono, entidad);
            CRUDExterno crudExterno = new CRUDExterno();
            crudExterno.addNew(externo);
            
            System.out.print("Agregado");
           // response.sendRedirect("/ProyectoSalas/MostrarMonitores");
        %>
        
    </body>
</html>
