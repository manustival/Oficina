<%-- 
    Document   : CadastroVeiculo
    Created on : 18/09/2015, 20:34:36
    Author     : emanoelle.stival
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Veiculos</h1>
        <form action="cadastro" method="POST">
            <label for="cadastro">Placa</label><input type="text" name="cadastro" id="cadastro"></br>
            <label for="tipo">Tipo de Veiculo</label><input type="text" name="tipoVeiculo" id="tipoVeiculo"></input></br>            
            <select name="veiculo">
                <option>
                    Carro
                </option>
                <option>
                    Caminhão
                </option>
                <option>
                    Moto
                </option>
            </select></br>
            <input type="submit" name="Cadastrar"></input>
        </form>
    </body>
</html>
