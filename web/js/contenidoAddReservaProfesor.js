function myFunctionCarga() {
    $.post('DatosReservaProfe',
            {
                tipoCarga: '1'
            }, function (responseText)
    {
        var respuesta = responseText.trim();
        var cadenaUnica = respuesta.substring(1, respuesta.length - 1);        
        var cedulas = cadenaUnica.split(',');
        var contruccionHtml = "<datalist id="+"profesores"+">";
        for (var indice in cedulas) {
            contruccionHtml = contruccionHtml + "<option value="+cedulas[indice]+">";
        }        
        contruccionHtml = contruccionHtml + "</datalist>";
        $('#listaProfesores').html(contruccionHtml);

    });
    
    $.post('DatosReservaProfe',
            {
                tipoCarga: '2'
            }, function (responseText)
    {
        var respuesta = responseText.trim();
        var cadenaUnica = respuesta.substring(1, respuesta.length - 1);        
        var edificio = cadenaUnica.split(',');
        var contruccionHtml = "<datalist id="+"edificios"+">";
        for (var indice in edificio) {
            contruccionHtml = contruccionHtml + "<option value="+edificio[indice]+">";
        }        
        contruccionHtml = contruccionHtml + "</datalist>";
        $('#listaEdificios').html(contruccionHtml);

    });
    $.post('DatosReservaProfe',
            {
                tipoCarga: '3'
            }, function (responseText)
    {
        var respuesta = responseText.trim();
        var cadenaUnica = respuesta.substring(1, respuesta.length - 1);        
        var salones = cadenaUnica.split(',');
        var contruccionHtml = "<datalist id="+"salones"+">";
        for (var indice in salones) {
            contruccionHtml = contruccionHtml + "<option value="+salones[indice]+">";
        }        
        contruccionHtml = contruccionHtml + "</datalist>";
        $('#listaSalones').html(contruccionHtml);

    });
    
}

window.onload = myFunctionCarga();


