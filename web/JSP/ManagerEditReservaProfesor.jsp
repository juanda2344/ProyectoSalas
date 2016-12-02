<%-- 
    Document   : ManagerEditPost
    Created on : Sep 24, 2016, 7:57:27 PM
    Author     : porta
--%>

<%@page import="CRUD.CRUDReservaProfesores"%>
<%@page import="modelo.ReservaProfesor"%>
<%@page import="CRUD.CRUDProfesores"%>
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
            String idReserva = request.getParameter("idReserva");
            String documento = request.getParameter("documentoProfesorRes");
            String edificio = request.getParameter("edificioProfesorRes");
            String salon = request.getParameter("salonProfesorRes");
            String fecha = request.getParameter("fechaProfesorRes");
            String horaInicio = request.getParameter("horaInicioProfesorRes");
            String horaFin = request.getParameter("horaFinProfesorRes");            
            
           ReservaProfesor reservaProfesor = new ReservaProfesor();
           reservaProfesor.ReservaProfesor2(idReserva, nameIdUsuario, documento, edificio, salon, fecha, horaInicio, horaFin, "");
           CRUDReservaProfesores RP = new CRUDReservaProfesores();
           RP.edit(reservaProfesor);
            
            response.sendRedirect("/ProyectoSalas/mostrarRP");
        %>
    </body>
</html>
