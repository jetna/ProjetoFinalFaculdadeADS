<%-- 
    Document   : index
    Created on : 01/05/2014, 18:11:54
    Author     : Jétna
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login - Sistema Estoque</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilo.css" type="text/css">
        
    </head>
    <body>
        <div id="telalogin">
            <h3>Sistema de Estoque</h3>
            <div id="containerLoginSenha">
                <form action="login.jsp" method="post">
                    Login:<br>
                    <input type="text" name="login"/> <br/>
                    Senha:<br/>
                    <input type="text" name="senha"/><br/>
                    <input type="button" value="!"/>
                </form></div>
            <a href="TelaExibirEstoque.jsp">Tela Exibir Estoque </a>
            </div>
        </div>
    </body>
</html>