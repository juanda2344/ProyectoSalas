


$(function ()
{



    $('#adicionarProfe').click(function (event) {
        $.post('AddUsuario.html', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#consultProfe').click(function (event) {
        $.post('/ProyectoSalas/mostraru', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#envio').click(function (event)
    {

        var pass1 = $('#contrasena').val();
        var pass2 = $('#rcontrasena').val();
        var nombre = $('#nombre').val();
        var apellidos = $('#apellidos').val();
        var usuario = $('#usuario').val();
        var correo = $('#correo').val();


        if (pass1 == pass2) {
            $.post('JSP/ManagerAddUsuario.jsp',
                    {
                        nombre: nombre,
                        apellidos: apellidos,
                        usuario: usuario,
                        contrasena: pass1,
                        correo: correo
                    }, function (responseText)
            {
                $('#content').html(responseText);
            });
        } else {
            $('#contrasena').attr('style', 'background:#3CF693');
            $('#rcontrasena').attr('style', 'background:#3CF693');
            $('#error').html('Verifique sus contraseñas');
        }
    });


    $('#modificarUsuario').click(function (event)
    {

        var nombre = $('#nombre').val();
        var apellidos = $('#apellidos').val();
        var pass1 = $('#contrasena').val();
        var pass2 = $('#rcontrasena').val();
        var correo = $('#correo').val();
        var usuario = ('#usuario').val();

        alert()
        if (pass1 == pass2) {
            alert('amsla');
            $.post('JSP/ManagerEditUsuario.jsp',
                    {
                        nombre: nombre,
                        apellidos: apellidos,
                        contrasena: pass1,
                        correo: correo,
                        usuario: usuario
                    }, function (responseText)
            {
                alert(responseText);
                $('#content').html(responseText);
            });
        } else {
            $('#contrasena').attr('style', 'background:#3CF693');
            $('#rcontrasena').attr('style', 'background:#3CF693');
            $('#error').html('Verifique sus contraseñas');
        }
    });
});

function myFuctionEdit(link) {
    var arreglo = link.split("?");
    $.get('edit',
            {
                id: arreglo[0],
                n: arreglo[1]
            }, function (responseText)
    {
        $('#content').html(responseText);
    });
}

function myFuctionDelete(link) {
    var arreglo = link.split("?");
    $.get('delete',
            {
                id: arreglo[0],
                n: arreglo[1]
            }, function (responseText)
    {
        if (responseText.trim() == 'error') {
            $('#mensaje').html('El Usuario No Se Puede Eliminar')
        } else {
            $('#content').html(responseText);
        }
    });
}

