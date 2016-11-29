


$(function ()
{



    $('#adicionarProfe').click(function (event) {
        $.post('AddUsuario.html', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#adicionarMonitor').click(function (event) {
        $.post('AddMonitor.html', function (data)
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

    $('#consultMonitor').click(function (event) {
        $.post('/ProyectoSalas/MostrarMonitores', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#addUsuario').click(function (event)
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

    $('#addMonitor').click(function (event)
    {
        var nombre = $('#nombre').val();
        var apellidos = $('#apellidos').val();
        var documento = $('#documento').val();
        var semestre = $('#semestre').val();
        var telefono = $('#telefono').val();
        var carrera = $('#carrera').val();
        var correo = $('#correo').val();

        $.post('JSP/ManagerAddMonitor.jsp',
                {
                    nombre: nombre,
                    apellidos: apellidos,
                    documento: documento,
                    semestre: semestre,
                    telefono: telefono,
                    carrera: carrera,
                    correo: correo
                }, function (responseText)
        {
            $('#content').html(responseText);
        });
    });

    $('#adicionarSala').click(function (event)
    {

        var edificio = $('#edificio').val();
        var id = $('#id').val();
        var tipo = $('#tipo').val();
        var beam = $('#beam').val();
        var computadores = $('#computadores').val();
        var sillas = $('#sillas').val();



        if (edificio != '' || id != '')
        {
            $.post('JSP/ManagerAddNewSalon.jsp',
                    {
                        edificio: edificio,
                        id: id,
                        tipo: tipo,
                        beam: beam,
                        computadores: computadores,
                        sillas: sillas

                    }, function (responseText)
            {
                alert(responseText);
                $('#content').html(responseText);
            });
        } else
        {
            $('#edificio').attr('style', 'background:#3CF693');
            $('#id').attr('style', 'background:#3CF693');

        }
    });


    $('#ConsultarSalas').click(function (event)
    {

        $.post('/ProyectoSalas/Mostrars', function (data)
        {
            $('#content').html(data);
        });


    });

    
    $('#modificarMonitor').click(function (event)
    {

        var nombre = $('#nombre').val();
        var apellidos = $('#apellidos').val();
        var documento = $('#documento').val();
        var semestre = $('#semestre').val();
        var telefono = $('#telefono').val();
        var carrera = $('#carrera').val();
        var correo = $('#correo').val();
        
        alert(documento);

        $.post('JSP/ManagerEditMonitor.jsp',
                {
                    nombre: nombre,
                    apellidos: apellidos,
                    documento: documento,
                    semestre: semestre,
                    correo: correo,
                    telefono: telefono,
                    carrera: carrera
                }, function (responseText)
        {            
            alert(responseText);
            $('#content').html(responseText);
        });
    });


    $('#modificarUsuario').click(function (event)
    {

        var nombre = $('#nombre').val();
        var apellidos = $('#apellidos').val();
        var pass1 = $('#contrasena').val();
        var pass2 = $('#rcontrasena').val();
        var correo = $('#correo').val();
        var usuario = $('#usuario').val();

        if (pass1 == pass2) {
            $.post('JSP/ManagerEditUsuario.jsp',
                    {
                        nombre: nombre,
                        apellidos: apellidos,
                        contrasena: pass1,
                        correo: correo,
                        usuario: usuario
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
});

function myFunctionEdit(link) {
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

function myFunctionDelete(link) {
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