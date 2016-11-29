


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
                                alert(responseText);
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


});

function myFuction(link){
       alert($('#modificarUsuario').attr('href')); 
}