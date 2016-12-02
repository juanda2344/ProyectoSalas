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
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
        <title>Profesores</title>
    </head>
    <body>
        <div style="width: 1200px; margin: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Documento</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                    <th>Cumpleanos</th>
                     <th></th>
                </tr>
                <c:forEach items="${MostrarProfesores}" var="p">
                    <tr>
                        <td>${p.documento}</td>
                        <td>${p.nombres}</td>
                        <td>${p.apellidos}</td>
                        <td>${p.correo}</td>
                        <td>${p.telefono}</td>
                        <td>${p.cumpleanos}</td>
                        
                        <td>
                    
                            <a href="#" onclick="myFunctionEdit('${p.documento}?3')">Modificar</a>
                            <a href="#" onclick="myFunctionDelete('${p.documento}?3')">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p id="mensaje" style="color:red"></p>
        </div>
    </body>
</html>
    