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
	  
	  <c:if test="${not empty mensagem }">	  
			<div class="alert ${tipo}">
	  			<strong>Informação</strong> ${mensagem} 
			</div>
	  	</c:if>
	  
	  <p>Gestão de Cadastro de Produtos</p>
	  
	  <h3>Listagem de Produto</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	      	<th>Nome</th>
	      	<th>Valor</th>
	      	<th>Código</th>
	        <th> </th>
	      </tr>
	    </thead>
	    <tbody>
	      <!-- for(tipo da colecao Objeto : nome da colecao) -->
	    <c:forEach var= "c" items="${listagem}">
	      <tr>
	      	<td>${c.id}</td>
	        <td>${c.nome}</td>
	        <td>${c.valor}</td>
	        <td>${c.codigo}</td>
	        <td><a href="/produto/${c.id}/excluir">excluir</a></td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>