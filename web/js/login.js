


$(function () {


    $('#login').on('click', login);

    function login()
    {
        
        
        var nombreusuario = $('#UserName').val();
        var contrasena = $('#Password').val();
        alert(nombreusuario);
        alert(contrasena);
        $.post("/Proyecto_Salas/Principal", {
            op:"1",
            user: nombreusuario,
            password: contrasena
        });

    }
});

       
