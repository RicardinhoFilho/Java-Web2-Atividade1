<%-- 
    Document   : meu-tads
    Created on : 27 de jun de 2022, 16:02:04
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style="display: flex; justify-content: center">
            <a class="navbar-brand" href="http://www.sept.ufpr.br/portal/analisesistemas/sobre-o-curso/"><img src="http://www.sept.ufpr.br/portal/wp-content/uploads/2020/08/TADS_Analise_Desen_Sistemas-1.png" 
                                                                                                              alt="Logo - Meu TADS" width="150"/></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>

        </nav>
        <table class="table">
            <thead>

            </thead>
            <tr>
                <th scope="col">NOME</th>
                <th scope="col">REDE SOCIAL</th>
            </tr>
            <tbody>
                <tr>
                    <td>RICARDO PINTO GIASSON FILHO</td>
                    <td><a href="https://github.com/RicardinhoFilho" target="_blank">GITHUB</a></td>
                </tr>
                <tr>
                    <td>Alessandra Vieira</td>
                    <td><a href="https://www.instagram.com/alessandralvieira_/" target="_blank">INSTAGRAM</a></td>
                </tr>

                <tr>
                    <td>Felipe Kazuo Borges Miyazaki</td>
                    <td><a href="https://www.instagram.com/felipekbm/" target="_blank">INSTAGRAM</a></td>
                </tr>

                <tr>
                    <td>Felipe Eduardo Mendes Santana</td>
                    <td><a href="https://instagram.com/eduardomsantana/" target="_blank">INSTAGRAM</a></td>
                </tr>
                <tr>
                    <td>Gabriel Duarte Ribeiro</td>
                    <td><a href="https://instagram.com/goberken" target="_blank">INSTAGRAM</a></td>
                </tr>
            </tbody>
        </table>
        <div style="display: flex; justify-content: center; margin-top: 20px;"><button type="button" class="btn btn-primary" onclick="voltar()">VOLTAR</button></div>

        <script>
            function voltar() {
                window.location.href = "http://localhost:8080/atividade-1/servlet";
            }
        </script>
    </body>


</html>