<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>ONG</title>
    </head>
    <body>
        <h1>Crie uma nova Sede</h1>
        <form action="/sede/salvar">
            <div>
                <label for="Nome">Nome:</label>
                <input type="text" name="Nome" />
            </div>
            <div>
                <label for="EstadoFederacao">EstadoFederacao</label>
                <input type="text" name="EstadoFederacao" />
            </div>
            <div>
                <label for="Cidade">Cidade</label>
                <input type="text" name="Cidade" />
            </div>
            <div>
                <label for="Bairro">Bairro:</label>
                <input type="text" name="Bairro" />
            </div>
            <div>
                <label for="Telefone">Telefone:</label>
                <input type="text" name="Telefone"/>
            </div>
            <div>
                <label for="Url">URL:</label>
                <input type="text" name="Url" />
            </div>
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>