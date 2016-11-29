


$(function ()
{
    
    
    
    $('#adicionarProfe').click(function (event){        
        $.post('AddUsuario.html', function(data) 
                        {
                       $('#content').html(data);
                             });
    });
    
    $('#consultProfe').click(function (event){        
        $.post('/ProyectoSalas/mostraru', function(data) 
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
        
        
            if (pass1 == pass2){
                $.post('JSP/ManagerAddUsuario.jsp', 
			{
				nombre :nombre,
                                apellidos :apellidos,
                                usuario :usuario,
				contrasena: pass1,
                                correo: correo
			}, function(responseText) 
			{
				$('#content').html(responseText);
			});
            }
            else{
                $('#contrasena').attr('style', 'background:#3CF693');
                $('#rcontrasena').attr('style', 'background:#3CF693');
                $('#error').html('Verifique sus contraseñas');
            }
    });


});


