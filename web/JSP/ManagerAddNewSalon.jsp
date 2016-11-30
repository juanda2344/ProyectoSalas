
<%@page import="CRUD.CRUDSalones"%>
<%@page import="modelo.Salones "%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
               
            String edificio= request.getParameter("edificio");
            String id=request.getParameter("id");
            String tipo=request.getParameter("tipo");
            String beam=request.getParameter("beam");
            String computadores=request.getParameter("computadores");
            String sillas=request.getParameter("sillas");
            
         
            Salones s= new Salones(edificio,id,beam,tipo,computadores,sillas);
            CRUDSalones da= new CRUDSalones();
            da.addSalon(s);
            response.sendRedirect("/ProyectoSalas/Mostrars");
            
        %>
          

    </body>
</html>
