<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>ONG</title>
    </head>
    <body>
        <h1>Listar Sedes</h1>
            <c:forEach items="${sedes}" var="sede">
                <h2>${atividade.getNome()}</h2>    
                <ul>
                    <li><strong>Cidade:</strong> ${sede.getCidade()}</li>
                    <li><strong>Estado Federacao:</strong> ${sede.getEstadoFederacao()}</li>
                    <li><strong>Bairro:</strong> ${sede.getBairro()}</li>
                    <li><strong>Telefone:</strong> ${sede.getTelefone()}</li>
                    <li><a href="${sede.getUrl()}" target="_blank">Pagina da sede</a></li>
                </ul> 
            </c:forEach>        	   
    </body>
</html>