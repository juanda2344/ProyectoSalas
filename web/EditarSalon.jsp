<%-- 
    Document   : EditPost
    Created on : 25-sep-2016, 14:50:54
    Author     : Memo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit</title>
    </head>
    <body>
        <h1>Editar Salon</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
      <c:forEach items="${getSalonByID}" var = "p">
            <form action ="JSP/ManagerEditSalon.jsp" method = "post">
               
            Nombre:<br>
            <input type ="text" value="${p.name}" name="name" style="width:200px"><br>
            Bloque: <br>
            <input type="text" value="${p.block}"name="block" style ="width:200px"><br>
            Tipo: <br>
            <select name="type">
                <option value="${p.type}">${p.type}</option>
                <option value="Salon">Salon</option>
                <option value="Laboratorio">Laboratorio</option>
                <option value="Sala">Sala</option>
            </select><br>
            Beam: <br>
            <select  name="beam">
                <option value="${p.beam}">${p.beam}</option>
                <option value="Si">Si</option>
                <option value="No">No</option>
            </select><br>
            Comentarios: <br>
            <textarea name="comment" style="width: 200px; height: 150px">${p.comment}</textarea>
            <input type="submit" value="Actualizar">
        </form>
        </c:forEach>

        </div>
    </body>
</html>





















