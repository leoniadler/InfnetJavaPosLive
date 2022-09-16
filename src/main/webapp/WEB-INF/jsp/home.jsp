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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
		<div class="container">
	  <h2>${projeto.nome}</h2>
	  <h2>${projeto.descricao}</h2>
	  
	  <p>Gestão de Cadastro de Compras</p>

		<c:forEach var="c" items="${projeto.classes}">
	  <h3>Classe: ${c.nome}</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrisão</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="a" items="${c.atributos}">
	      <tr>
	        <td>${a.nome}</td>
	        <td>${a.tipo}</td>
	        <td>${a.descricao}</td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  </c:forEach>
	</div>
</body>
</html>