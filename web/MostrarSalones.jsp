<%-- 
    Document   : AllPost
    Created on : 25-sep-2016, 12:07:50
    Author     : Memo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salones</title>
    </head>
    <body>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Nombre</th>
                    <th>Bloque</th>
                    <th>Tipo</th>
                    <th>Beam</th>
                </tr>
                <c:forEach items="${MostrarSalones}" var="p">
                    <tr>
                        <td>${p.name}</td>
                        <td>${p.block}</td>
                        <td>${p.type}</td>
                        <td>${p.beam}</td>
                        <td>
                            <a href="edit?id=${p.name}&n=4">Edit</a>
                            <a href="delete?id=${p.name}&n=4">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                    
                
                
            </table>
        </div>
    </body>
</html>
