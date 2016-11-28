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
        <title>Edit</title>
    </head>
    <body>
        <h1>Editar Monitor</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
            <c:forEach items="${getNewsById}" var="p">
                <form action="JSP/ManagerEditMonitor.jsp" method="post">
                    <input type="hidden" name="documento" value="${p.documento}">
                    Nombre:<br>
                    <input type="text" value="${p.nombre}" name="nombre" style="width: 200px"><br>
                    Apellidos:<br>
                    <input type="text" value="${p.apellidos}" name="apellidos" style="width: 200px"><br>
                    Correo:<br>
                    <input type="text" value="${p.correo}" name="correo" style="width: 200px"><br>
                    Semestre:<br>
                    <input type="text" value="${p.semestre}" name="semestre" style="width: 200px"><br>
                    Telefono:<br>
                    <input type="text" value="${p.telefono}" name="telefono" style="width: 200px"><br>
                 
                    <input type="submit" value="Submit">
                </form>
            </c:forEach>

        </div>
    </body>
</html>
