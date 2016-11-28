<%-- 
    Document   : AllPost
    Created on : Sep 19, 2016, 12:08:44 AM
    Author     : porta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Todos</title>
    </head>
    <body>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Cedula</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                    <th>Cumpleaños</th>
                </tr>
                <c:forEach items="${MostrarProfesores}" var="p">
                    <tr>
                        <td>${p.cedula}</td>
                        <td>${p.nombres}</td>
                        <td>${p.apellidos}</td>
                        <td>${p.correo}</td>
                        <td>${p.telefono}</td>
                        <td>${p.cumpleaños}</td>
                        <td>
                            <a href="edit?id=${p.cedula}&n=3">Edit</a>
                            <a href="delete?id=${p.cedula}&n=3">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <a href="addProfesores.html">Add Profesor</a>
        </div>
    </body>
</html>
    