


$(function ()
{
    
    
    
    $('#adicionarProfe').click(function (event){        
        $.post('AddUsuario.html', function(data) 
                        {
                       $('#content').html(data);
                             });
    });

    $('#envio').click(function (event)
    {
        var pass1 = $('#contrasena').val();
        var pass2 = $('#rcontrasena').val();
            
            if (pass1 == pass2){
                
            }
            else{
                $('#contrasena').attr('style', 'background:#3CF693');
                $('#rcontrasena').attr('style', 'background:#3CF693');
                $('#error').html('Verifique sus contraseñas');
            }
        //<form action="JSP/ManagerAddUsuario.jsp" method="post">
    });


});


