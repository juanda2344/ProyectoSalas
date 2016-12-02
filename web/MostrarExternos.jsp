<%-- 
    Document   : MostrarMonitores
    Created on : 20/09/2016
    Author     : Juan
--%>


<%@page import="CRUD.CRUDMonitores"%>
<%@page import="modelo.Monitores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monitores</title>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
    </head>
    <body>
      
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Documento</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                    <th>Entidad</th>
                    <th></th>
                </tr>
                <c:forEach items="${MostrarExternos}" var="p">
                    <tr>
                        <td>${p.documento}</td>
                        <td>${p.nombres}</td>
                        <td>${p.apellidos}</td>
                        <td>${p.correo}</td>
                        <td>${p.telefono}</td>
                        <td>${p.entidad}</td>
                        <td>
                            <a href="#" onclick="myFunctionEdit('${p.documento}?6')">Modificar</a>
                            <a href="#" onclick="myFunctionDelete('${p.documento}?7')">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
