<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>ONG</title>
    </head>
    <body>
        <h1>Listar Atividades</h1>
            <c:forEach items="${atividades}" var="atividade">
                <h2>${atividade.getTitulo()}</h2>    
                <ul>
                    <li><strong>Sede:</strong> ${atividade.getSede().getNome()}</li>
                    <li><strong>Descrição:</strong> ${atividade.getDescricao()}</li>
                    <li><strong>Início da atividade:</strong> ${atividade.getDataInicio().toString()}</li>
                    <li><strong>Fim da atividade:</strong> ${atividade.getDataFim()}</li>
                    <li><strong>Horas Assistenciais:</strong> ${atividade.getHorasAssistenciais()}</li>
                    <li><strong>Horas Juridicas:</strong> ${atividade.getHorasJuridicas()}</li>
                    <li><strong>Horas Financeiras:</strong> ${atividade.getHorasFinanceiras()}</li>
                    <li><strong>Horas Administrativas:</strong> ${atividade.getHorasAdministrativas()}</li>
                </ul> 
                <form action="/atividade/excluir/${atividade.getId()}">            
                    <button type="submit">Excluir</button>
                </form>
            </c:forEach>        	   
    </body>
</html>