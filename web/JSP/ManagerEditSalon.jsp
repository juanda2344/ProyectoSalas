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
        
            
            String name = request.getParameter("name");
            String block = request.getParameter("block");
            String type = request.getParameter("type");
            String beam = request.getParameter("beam");
            String comment = request.getParameter("comment");
            
            CRUDSalones da = new CRUDSalones();
            da.edit(name, block, type, beam, comment);
            response.sendRedirect("/Proyecto_Salas/Mostrars");
        %>
    </body>
</html>
