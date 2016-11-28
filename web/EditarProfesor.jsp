<%-- 
    Document   : EditPost
    Created on : Sep 24, 2016, 7:52:05 PM
    Author     : porta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Profesor</title>
    </head>
    <body>
        <h1>Editar Profesor</h1>
        <c:forEach items="${getNewsByCedula}" var="p">
            <div style="width: 900px; margin-left: auto; margin-right: auto">
            <form action="JSP/ManagerEditProfesor.jsp" method="post">
                Cedula:<br>
                <input type="number" value="${p.cedula}" name="cedula" style="width: 200px"><br>
                Nombres:<br>
                <input type="text" value="${p.nombres}" name="nombres" style="width: 200px"><br>
                Apellidos:<br>
                <input type="text" value="${p.apellidos}" name="apellidos" style="width: 200px"><br>
                Correo:<br>
                <input type="text" value="${p.correo}" name="correo" style="width: 200px"><br>
                Telefono:<br>
                <input type="number" value="${p.telefono}" name="telefono" style="width: 200px"><br>
                Fecha De Nacimiento:<br>
                <input type="date" value="${p.cumpleaños}" name="cumpleanos" style="width: 200px"><br>
                <input type="submit" name="Submit">
            </form>
        </div>
        </c:forEach>
        
    </body>
</html>
