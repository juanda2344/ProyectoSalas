
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
            String name= request.getParameter("name");
            String block=request.getParameter("block");
            String type=request.getParameter("type");
            String beam=request.getParameter("beam");
            String comment=request.getParameter("comment");
            
            Salones s= new Salones(name,block,type,beam,comment);
            CRUDSalones da= new CRUDSalones();
            da.addSalon(s);
            response.sendRedirect("/Proyecto_Salas/Mostrars");
            
        %>
          

    </body>
</html>
