


$(function () 
{


    $('#login').click(function(event) 
    {
                        var _thisuser = $('#username');
                        var _thispassword = $('#password');
			var user = $('#username').val();
			var pass = $('#password').val();
                        if(user == '' || pass=='')
                        {
                         if(user == '')
                         {
                              _thisuser.attr('style', 'background:#3CF693');
                         }
                         if(pass == '')
                         {
                             _thispassword.attr('style', 'background:#3CF693');
                         }
                            alert("Campos Vacios");
                        }
			else
                        {
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
            $.post('login',
                    {
                        username: user,
                        password: pass


                    }, function (responseText)
            {

                if (responseText.trim() == "dirigir")
                {
                    window.location = "principal.jsp"
                } else
                {
                    $('#mensaje').html(responseText);
                }
            });
                    }
	});
        
          $('#addSala').click(function(event) 
                 {
                      
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
			$.post('AddNewSalon.html', function(data) 
                        {

                       $('#content').html(data);

                             });
                    
	        });


});

       
