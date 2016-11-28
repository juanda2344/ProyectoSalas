<%-- 
    Document   : ManagerEditPost
    Created on : Sep 24, 2016, 7:57:27 PM
    Author     : porta
--%>

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
            String cedulaTemp = request.getParameter("cedula");
            int cedula = Integer.parseInt(cedulaTemp);
            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String correo = request.getParameter("correo");
            String telefonoTemp = request.getParameter("telefono");
            int telefono = Integer.parseInt(telefonoTemp);
            String cumpleaños = request.getParameter("cumpleanos");
            
            CRUDProfesores dt = new CRUDProfesores();
            dt.edit(cedula, nombres, apellidos, correo, telefono, cumpleaños);
            
            response.sendRedirect("/Proyecto_Salas/mostrarp");
        %>
    </body>
</html>
