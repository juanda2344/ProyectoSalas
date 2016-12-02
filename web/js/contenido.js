$(function ()
{
    $('#borrarAllMonitores').click(function (event) {
        $.post('AddUsuario.html', function (data)
        {
            $('#content').html(data);
        });
    });

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
    
    $('#adicionarExterno').click(function (event) {
        $.post('AddExterno.html', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#adicionarReservaProfesor').click(function (event) {
        $.post('AddReservaProfesor.html', function (data)
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

    $('#consultarReservaProfesor').click(function (event) {
        $.post('/ProyectoSalas/mostrarRP', function (data)
        {
            $('#content').html(data);
        });
    });

    $('#asignarReservas').click(function (event) {

    });

    $('#addReservaProfesor').click(function (event)
    {
        var nameIdUsuario = $('#usuarioSesion').val();
        var documento = $('#documentoProfesorRes').val();
        var edificio = $('#edificioProfesorRes').val();
        var salon = $('#salonProfesorRes').val();
        var fecha = $('#fechaProfesorRes').val();
        var horaInicio = $('#horaInicioProfesorRes').val();
        var horaFin = $('#horaFinProfesorRes').val();

        alert('entre');

        $.post('JSP/ManagerAddReservaProfesor.jsp',
                {
                    nameIdUsuario: nameIdUsuario,
                    documento: documento,
                    edificio: edificio,
                    salon: salon,
                    fecha: fecha,
                    horaInicio: horaInicio,
                    horaFin: horaFin
                }, function (responseText)
        {
            $('#content').html(responseText);
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

    $('#addExterno').click(function (event)
    {
        var documento = $('#documento').val();
        var nombres = $('#nombres').val();
        var apellidos = $('#apellidos').val();
        var correo = $('#correo').val();
        var telefono = $('#telefono').val();
        var entidad = $('#entidad').val();
        

        $.post('JSP/ManagerAddExterno.jsp',
                {
                    documento: documento,
                    nombres: nombres,
                    apellidos: apellidos,
                    correo: correo,
                    telefono: telefono,
                    entidad: entidad
                }, function (responseText)
        {
            $('#content').html(responseText);
        });
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
    $('#consultarExterno').click(function (event)
    {
        $.post('/ProyectoSalas/MostrarExternos', function (data)
        {
            $('#content').html(data);
        });
    });



    $('#editarResProBtn').click(function (event)
    {
        var nameIdUsuario = $('#usuarioSesion').val();
        var idReserva = $('#idReserva').val();
        var documento = $('#documentoProfesorRes').val();
        var edificio = $('#edificioProfesorRes').val();
        var salon = $('#salonProfesorRes').val();
        var fecha = $('#fechaProfesorRes').val();
        var horaInicio = $('#horaInicioProfesorRes').val();
        var horaFin = $('#horaFinProfesorRes').val();


        $.post('JSP/ManagerEditReservaProfesor.jsp',
                {
                    nameIdUsuario: nameIdUsuario,
                    idReserva: idReserva,
                    documentoProfesorRes: documento,
                    edificioProfesorRes: edificio,
                    salonProfesorRes: salon,
                    fechaProfesorRes: fecha,
                    horaInicioProfesorRes: horaInicio,
                    horaFinProfesorRes: horaFin
                }, function (responseText)
        {
            $('#content').html(responseText);
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
            $('#content').html(responseText);
        });
    });
    $('#modificarExterno').click(function (event)
    {
        var documento = $('#documento').val();
        var nombres = $('#nombres').val();
        var apellidos = $('#apellidos').val();
        var correo = $('#correo').val();
        var telefono = $('#telefono').val();
        var entidad = $('#entidad').val();
        
        
        $.post('JSP/ManagerEditExterno.jsp',
                {
                    documento: documento,        
                    nombres: nombres,
                    apellidos: apellidos,                    
                    correo: correo,
                    telefono: telefono,
                    entidad: entidad
                }, function (responseText)
        {
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

    $('#EditarSalon').click(function (event)
    {

        var beam = $('#beam').val();
        var tipo = $('#tipo').val();
        var computadores = $('#computadores').val();
        var sillas = $('#sillas').val();
        var identificador = $('#id').val();
        var edificio = $('#edificio').val();



        $.post('JSP/ManagerEditSalon.jsp',
                {
                    beam: beam,
                    tipo: tipo,
                    computadores: computadores,
                    sillas: sillas,
                    identificador: identificador,
                    edificio: edificio

                }, function (responseText)
        {

            $('#content').html(responseText);
        });

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

function myFunctionCarga() {
    alert('cargado');
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

function myFuctionEditSalon(link) {
    var arreglo = link.split("?");
    $.get('edit',
            {
                id: arreglo[0],
                id2: arreglo[1],
                n: arreglo[2]
            }, function (responseText)
    {
        $('#content').html(responseText);
    });
}

function myFuctionDeleteSalon(link) {
    var arreglo = link.split("?");
    $.get('delete',
            {
                id: arreglo[0],
                id2: arreglo[1],
                n: arreglo[2]
            }, function (responseText)
    {

        if (responseText.trim() == 'error')
        {

            $('#mensaje').html('La Sala  no Se Puede Eliminar')
        } else
        {
            $('#content').html(responseText);
        }
    });
}

