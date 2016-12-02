<%-- 
    Document   : ManagerAddReservaProfesor
    Created on : 01-dic-2016, 18:20:54
    Author     : porta
--%>

<%@page import="CRUD.CRUDReservaExterna"%>
<%@page import="modelo.ReservaExterna"%>
<%@page import="CRUD.CRUDReservaProfesores"%>
<%@page import="modelo.ReservaProfesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String nameIdUsuario = request.getParameter("nameIdUsuario");
            String documento = request.getParameter("documento");
            String edificio = request.getParameter("edificio");
            String salon = request.getParameter("salon");
            String fecha = request.getParameter("fecha");
            String horaInicio = request.getParameter("horaInicio");
            String horaFin = request.getParameter("horaFin");            
            
           ReservaExterna reservaExterna = new ReservaExterna("", nameIdUsuario, documento, edificio, salon, fecha, horaInicio, horaFin, "");
           CRUDReservaExterna crudReservarExterna = new CRUDReservaExterna();
           crudReservarExterna.addNewReservaExterna(reservaExterna);
            
            response.sendRedirect("/ProyectoSalas/MostrarReservasExternas");
        %>
    </body>

</html>