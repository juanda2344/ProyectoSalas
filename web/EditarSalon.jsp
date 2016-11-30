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
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
    </head>
    <body>
        <h2>Editar Salon</h2>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
      <c:forEach items="${getSalonByID}" var = "p">
            
            <input type="hidden" id="edificio" value="${p.edificio}">
            <input type="hidden" id="id" value="${p.identificador}">
            Computadores:<br>
            <input type ="text" value="${p.computadores}" id="computadores" style="width:100px"><br>
            Sillas:<br>
            <input type ="text" value="${p.sillas}" id="sillas" style="width:100px"><br>
            Tipo: <br>
            <select id="tipo">
                <option value="${p.tipo}">Seleccionar</option>
                <option value="Salon">Salon</option>
                <option value="Laboratorio">Laboratorio</option>
                <option value="Sala">Sala</option>
            </select><br>
            Beam: <br>
            <select  id="beam">
                <option value="${p.beam}">Seleccionar</option>
                <option value="Si">Si</option>
                <option value="No">No</option>
            </select><br>
         
            <input type="submit" value="Actualizar" id="EditarSalon">
        
        </c:forEach>

        </div>
    </body>
</html>





















