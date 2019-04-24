<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>ONG</title>
    </head>
    <body>
        <h1>Editar Sede</h1>
        <form action="/sede/atualizar">
            <div>
                <label for="Nome">Nome:</label>
                <input type="text" name="Nome" value="${sede.getNome()}"/>
            </div>
            <div>
                <label for="EstadoFederacao">EstadoFederacao</label>
                <input type="text" name="EstadoFederacao" value="${sede.getEstadoFederacao()}"/>
            </div>
            <div>
                <label for="Cidade">Cidade</label>
                <input type="text" name="Cidade" value="${sede.getCidade()}"/>
            </div>
            <div>
                <label for="Bairro">Bairro:</label>
                <input type="text" name="Bairro" value="${sede.getBairro()}"/>
            </div>
            <div>
                <label for="Telefone">Telefone:</label>
                <input type="text" name="Telefone" value="${sede.getTelefone()}"/>
            </div>
            <div>
                <label for="Url">URL:</label>
                <input type="text" name="Url" value="${sede.getUrl()}"/>
            </div>
            <input type="hidden" name="Id" value="${sede.getId()}"/>
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>