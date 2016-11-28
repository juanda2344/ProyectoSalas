<%-- 
    Document   : ManagerAddProfesor
    Created on : Sep 18, 2016, 11:31:54 PM
    Author     : porta
--%>

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
            String cedula = request.getParameter("cedula");
            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            String cumpleaños = request.getParameter("cumpleanos");
            
            Profesores p = new Profesores(cedula, nombres, apellidos, correo, telefono, cumpleaños);
            CRUDProfesores da = new CRUDProfesores();
            da.addProfesor(p);
            
            response.sendRedirect("/Proyecto_Salas/mostrarp");
        %>
    </body>
</html>
