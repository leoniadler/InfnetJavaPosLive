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
	
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/celular/lista">Celular</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/notebook/lista">Notebook</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/televisao/lista">Televisão</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/produto/lista">Produto</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/cliente/lista">Cliente</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/compra/lista">Compra</a>
      </li>
    </ul>
  </div>
</nav>
		<div class="container">
	  <h2>AppCompra</h2>
	  <p>Gestão de Cadastro de Compras</p>
	  
	  <h3>Classe: Celular</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	      	<th>Nome</th>
	      	<th>Valor</th>
	      	<th>Código</th>
	        <th>Marca</th>
	        <th>Modelo</th>
	        <th>Preço</th>
	        <th>Carregador</th>
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
	        <td>${c.modelo}</td>
	        <td>${c.preco}</td>
	        <td>${c.carregador}</td>
	        <td><a href="/celular/${c.id}/excluir">excluir</a></td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>