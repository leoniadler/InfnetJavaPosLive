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
	  
	  <h3>Classe: Televisão</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Nome</th>
	      	<th>Valor</th>
	      	<th>Código</th>
	        <th>Marca</th>
	        <th>Tamanho</th>
	        <th>Preço</th>
	        <th>Definição</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach var= "c" items="${listagem}">
	      <tr>
	      	<td>${c.id}</td>
	        <td>${c.nome}</td>
	        <td>${c.valor}</td>
	        <td>${c.codigo}</td>
	        <td>${c.marca}</td>
	        <td>${c.tamanho}</td>
	        <td>${c.preco}</td>
	        <td>${c.definicao}</td>
	        <td><a href="/televisao/${c.id}/excluir">excluir</a></td>
	      </tr>
	      </c:forEach>
	      
	    </tbody>
	  </table>
	  
	  
	  
	 
	    
	</div>
</body>
</html>