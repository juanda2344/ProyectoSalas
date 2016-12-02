<%-- 
    Document   : EditPost
    Created on : Sep 24, 2016, 7:52:05 PM
    Author     : porta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/contenidoAddReservaProfesor.js"></script>
        <script type="text/javascript" src="js/contenido.js"></script>
        <title>Editar Profesor</title>
    </head>
    <body>
        <h1>Editar Reserva Profesor</h1>
        <c:forEach items="${getNewsByCedula}" var="p">
            <div style="width: 900px; margin-left: auto; margin-right: auto">
                <input type="hidden" id="idReserva" value="${p.idReserva}">

                Nombre Profesor:<br>
                <input list="profesores" id="documentoProfesorRes" type="text" placeholder="Ingrese su nombre" value="${p.documento}">
                <div id="listaProfesores">

                </div>
                <br>Edificio Salón :<br>
                <input list="edificios" id="edificioProfesorRes" type="text" placeholder="Ingrese el edificio" value="${p.edificio}">
                <div id="listaEdificios">

                </div>
                <br>Identificador Salón:<br>
                <input list="salones" id="salonProfesorRes" type="text" placeholder="Ingrese el salón" value="${p.identificador}">
                <div id="listaSalones">

                </div>
                <br>Fecha:<br>
                <input id="fechaProfesorRes" type="date" value="${p.fecha}">   

                <br>Hora Inicio: <br>
                <input id="horaInicioProfesorRes" type="time" value="${p.horaInicio}">
                <br>    

                <br>Hora Fin: <br>
                <input id="horaFinProfesorRes" type="time" value="${p.horaFin}">
                <br> 

                <input type="submit" id="editarResProBtn" name="Submit">
            </div>
        </c:forEach>

    </body>
</html>
