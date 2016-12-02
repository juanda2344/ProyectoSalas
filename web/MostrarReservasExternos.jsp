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
                    <th>Externo</th>
                    <th>Salon</th>
                    <th>Hora Inicio</th>
                    <th>Hora Fin</th>
                     <th></th>
                </tr>
                <c:forEach items="${listaReservasExternas}" var="p">
                    <tr>
                        <td>${p.nombreExterno}</td>
                        <td>${p.edificio}${p.identificador}</td>
                        <td>${p.horaInicio}</td>
                        <td>${p.horaFin}</td>
                        
                        <td>
                    
                            <a href="#" onclick="myFunctionEdit('${p.idReserva}?7')">Modificar</a>
                            <a href="#" onclick="myFunctionDelete('${p.idReserva}?8')">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p id="mensaje" style="color:red"></p>
        </div>
    </body>
</html>
