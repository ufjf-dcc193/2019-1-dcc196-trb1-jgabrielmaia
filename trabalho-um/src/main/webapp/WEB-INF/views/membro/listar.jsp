<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>ONG</title>
    </head>
    <body>
        <h1>Listar Membros</h1>
            <c:forEach items="${membros}" var="membro">
                <h2>${membro.getNome()}</h2>    
                <ul>
                    <li><strong>Sede:</strong> ${membro.getSede().getNome()}</li>
                    <li><strong>Função:</strong> ${membro.getFuncao()}</li>
                    <li><strong>E-mail:</strong> ${membro.getEmail()}</li>
                    <li><strong>Data de entrada:</strong> ${membro.getDataEntrada()}</li>
                    <li><strong>Data de saída:</strong> ${membro.getDataSaida()}</li>
                </ul> 
            </c:forEach>        	   
    </body>
</html>