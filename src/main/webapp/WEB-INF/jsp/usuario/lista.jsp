<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AppCompra</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
		<div class="container">
		  <h2>AppCompra</h2>
		  <p>Gestão de Cadastro de Compras</p>
		  
		  <h4><a href="/usuario">Novo Cadastro</a></h4> 
		  
		  <h3>Classe: Usúarios</h3>            
		  <table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Nome</th>
		      	<th>E-mail</th>
		      	<th>Senha</th>
		      	<th></th>
		      </tr>
		    </thead>
		    <tbody>
				<!-- for(tipo da colecao Objeto : nome da colecao) -->
		    <c:forEach var= "u" items="${listagem}">
		      <tr>
		      	<td>${u.nome}</td>
		        <td>${u.email}</td>
		        <td>${u.senha}</td>
		        <td><a href="/usuario/${u.email}/excluir">excluir</a></td>
		      </tr>
		      </c:forEach>
		    </tbody>
		  </table>
		</div>
</body>
</html>