<%-- 
    Document   : editarUsuario
    Created on : 20/09/2016
    Author     : Alexandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
    </head>
    <body>
        <h1>Editar usuario</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
            <c:forEach items="${getNewsById}" var="p">
                <input type="hidden" id="usuario" value="${p.usuario}">
                Nombre:<br>
                <input type="text" value="${p.nombre}" id="nombre" style="width: 200px"><br>
                Apellidos:<br>
                <input type="text" value="${p.apellidos}" id="apellidos" style="width: 200px"><br>
                contraseña:<br>
                <input type="text" value="${p.contrasena}" id="contrasena" style="width: 200px"><br>
                confirmacion contraseña:<br>
                <input type="text" value="" id="rcontrasena" style="width: 200px"><br>
                correo:<br>
                <input type="text" value="${p.correo}" id="correo" style="width: 200px"><br>

                <button type="submit" id="modificarUsuario">Ingresar</button>
                <p id="error"></p>
            </c:forEach>

        </div>
    </body>
</html>
