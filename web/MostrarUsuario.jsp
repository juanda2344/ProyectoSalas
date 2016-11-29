<%-- 
    Document   : Mostrarusuarios
    Created on : 20/09/2016
    Author     : Alexandra
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
        <title>usuarios</title>
    </head>
    <body>
        <div style="width: 1200px; margin: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Usuario</th>
                    <th>Contraseña</th>
                     <th></th>
                </tr>
                <c:forEach items="${MostrarUsuarios}" var="p">
                    <tr>
                        <td>${p.nombre}</td>
                        <td>${p.apellidos}</td>
                        <td>${p.usuario}</td>
                        <td>${p.contrasena}</td>
                        
                        <td>
                    
                            <a href="#" onclick="myFuctionEdit('${p.usuario}?2')">Modificar</a>
                            <a href="#" onclick="myFuctionDelete('${p.usuario}?2')">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p id="mensaje" style="color:red"></p>
        </div>
    </body>
</html>
