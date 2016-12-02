<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
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
        <h1>Editar Monitor</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
            <c:forEach items="${getNewsById}" var="p">
                    <input type="hidden" id="documento" value="${p.documento}">
                    Nombre:<br>
                    <input type="text" value="${p.nombre}" id="nombre" style="width: 200px"><br>
                    Apellidos:<br>
                    <input type="text" value="${p.apellidos}" id="apellidos" style="width: 200px"><br>
                    Correo:<br>
                    <input type="text" value="${p.correo}" id="correo" style="width: 200px"><br>
                    Semestre:<br>
                    <input type="text" value="${p.semestre}" id="semestre" style="width: 200px"><br>
                    Telefono:<br>
                    <input type="text" value="${p.telefono}" id="telefono" style="width: 200px"><br>
                    Carrera:<br>
                    <input type="text" value="${p.carrera}" id="carrera" style="width: 200px"><br>
                 
                    <button type="submit" id="modificarMonitor">Ingresar</button>
            </c:forEach>

        </div>
    </body>
</html>
