


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
    
      $('#adicionarSala').click(function (event)
    {
        
        var edificio = $('#edificio').val();
        var id = $('#id').val();
        var tipo = $('#tipo').val();
        var beam = $('#beam').val();    
        var computadores = $('#computadores').val();
        var sillas = $('#sillas').val();
        
       
        
            if(edificio != '' || id !='')
            {
                $.post('JSP/ManagerAddNewSalon.jsp', 
			{
				edificio :edificio,
                                id :id,
                                tipo :tipo,
				beam: beam,
                                computadores: computadores,
                                sillas:sillas
                                
			}, function(responseText) 
			{
                                
				$('#content').html(responseText);
			});
            }
            else
            {
                $('#edificio').attr('style', 'background:#3CF693');
                $('#id').attr('style', 'background:#3CF693');
                
            }
    });
    
    
      $('#ConsultarSalas').click(function (event)
    {
        
                $.post('/ProyectoSalas/Mostrars', function(data) 
			{
                            $('#content').html(data);
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
    
      $('#EditarSalon').click(function (event)
    {

        var beam = $('#beam').val();
        var tipo = $('#tipo').val();
        var computadores = $('#computadores').val();
        var sillas = $('#sillas').val();
        var identificador=$('#id').val();
        var edificio=$('#edificio').val();
       

      
            $.post('JSP/ManagerEditSalon.jsp',
                    {
                        beam: beam,
                        tipo: tipo,
                        computadores: computadores,
                        sillas: sillas,
                        identificador:identificador,
                        edificio:edificio
                        
                    }, function (responseText)
            {
                
                $('#content').html(responseText);
            });
      
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

function myFuctionEditSalon(link) {
    var arreglo = link.split("?");
    $.get('edit',
            {
                id: arreglo[0],
                id2:arreglo[1],
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
                id2:arreglo[1],
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

