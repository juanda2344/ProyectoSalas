<%-- 
    Document   : index
    Created on : 28/11/2016, 01:45:46 PM
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Salas Universidad de Caldas</title>

        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="css/animate.css">
        <!-- Custom Stylesheet -->
        <link rel="stylesheet" href="css/style.css">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script type="text/javascript" src="js/login.js"></script>


    </head>

    <body>
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">Coordinación de Salas <span>UCALDAS</span></span></h1>
            </div>

            <form>
                <div class="login-box animated fadeInUp">
                    <div class="box-header">
                        <h2>Iniciar Sesión</h2>
                    </div>
                    <label for="username">Usuario</label>
                    <br/>
                    <input type="text" id="username" name="username" required>
                    <br/>
                    <label for="password">Contraseña</label>
                    <br/>
                    <input type="password" id="password" name="password" required>
                    <br/>
                    <button type="submit" id="login" >Ingresar</button>
                    <p id="mensaje" style="color:red"></p>
                    <br/>
                </div>
            </form>

        </div>
    </body>

    <script>
$(document).ready(function () {
    $('#logo').addClass('animated fadeInDown');
    $("input:text:visible:first").focus();
});
$('#username').focus(function () {
    $('label[for="username"]').addClass('selected');
});
$('#username').blur(function () {
    $('label[for="username"]').removeClass('selected');
});
$('#password').focus(function () {
    $('label[for="password"]').addClass('selected');
});
$('#password').blur(function () {
    $('label[for="password"]').removeClass('selected');
});
    </script>

</html>
