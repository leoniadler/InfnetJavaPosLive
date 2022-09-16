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
	  
	   <h4><a href="/notebook">Novo Cadastro</a></h4> 
	  
	  <h3>Classe: Notebook</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      <th>ID</th>
	      	<th>Nome</th>
	      	<th>Valor</th>
	      	<th>Código</th>
	        <th>Marca</th>
	        <th>Informações</th>
	        <th>Preço</th>
	        <th>Placa de Vídeo</th>
	        <th></th>
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
	        <td>${c.marca}</td>
	        <td>${c.informacoes}</td>
	        <td>${c.preco}</td>
	        <td>${c.placaDeVideo}</td>
	        <td><a href="/notebook/${c.id}/excluir">excluir</a></td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	  
	  
	 
	    
	</div>
</body>
</html>