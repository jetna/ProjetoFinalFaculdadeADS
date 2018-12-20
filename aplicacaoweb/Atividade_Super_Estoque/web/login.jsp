<%-- 
    Document   : login
    Created on : 03/05/2014, 18:19:00
    Author     : Jétna
--%>
<%@page import="Controller.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <%Usuario estoquista=new Usuario();
        String teste=estoquista.id;
        String login=request.getParameter("login");
        String senha=request.getParameter("senha");
        boolean status = estoquista.verificarusuario(login, senha);
        if(estoquista.resultado==true){
        response.sendRedirect("principal_Sistema_estoque.jsp");
            /*out.println("login realizado"+estoquista.id);
            out.println("loginha/senha inválidos");*/
            } else
            response.sendRedirect("Error.jsp");
        out.println(teste);
%>
        <h1>Hello World!</h1>
    </body>
</html>
