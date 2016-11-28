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
    </head>
    <body>
        <h1>Editar usuario</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
            <c:forEach items="${getNewsById}" var="p">
                <form action="JSP/ManagerEditUsuario.jsp" method="post">
                    <input type="hidden" name="usuario" value="${p.usuario}">
                    Nombre:<br>
                    <input type="text" value="${p.nombre}" name="nombre" style="width: 200px"><br>
                    Apellidos:<br>
                    <input type="text" value="${p.apellidos}" name="apellidos" style="width: 200px"><br>
                    contrasena:<br>
                    <input type="text" value="${p.contrasena}" name="contrasena" style="width: 200px"><br>
                                     
                    <input type="submit" value="Submit">
                </form>
            </c:forEach>

        </div>
    </body>
</html>
