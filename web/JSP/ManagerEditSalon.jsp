<%-- 
    Document   : ManageEditPost
    Created on : 25-sep-2016, 14:53:19
    Author     : Memo
--%>

<%@page import="CRUD.CRUDSalones"%>
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
            String id=request.getParameter("identificador");
            String tipo=request.getParameter("tipo");
            String beam=request.getParameter("beam");
            String computadores=request.getParameter("computadores");
            String sillas=request.getParameter("sillas");
            
            CRUDSalones da = new CRUDSalones();
            da.edit(beam,tipo,computadores,sillas,edificio,id);
            response.sendRedirect("/ProyectoSalas/Mostrars");
        %>
    </body>
</html>
