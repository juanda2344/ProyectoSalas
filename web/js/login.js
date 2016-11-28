


$(function () 
{


    $('#login').click(function(event) 
    {
                        
			var user = $('#username').val();
			var pass = $('#password').val();
			
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
			$.post('login', 
			{
				username :user,
				password: pass
				
			}, function(responseText) 
			{
				
				$('#mensaje').html(responseText);
			});
	});


});

       
