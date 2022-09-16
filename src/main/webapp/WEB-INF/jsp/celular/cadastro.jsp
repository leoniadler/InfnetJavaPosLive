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

	<div class="container mt-3">
  <h2>Cadastro de Celulares</h2>
  
  <form action="/celular/incluir" method="post">
  
  	<c:import url="/WEB-INF/jsp/produto/cadastro.jsp"/>
  
  	<div class="mb-3 mt-3">
      <label >Marca:</label>
      <input type="text" class="form-control" placeholder="Entre com a marca" name="marca">
    </div>
    
    <div class="mb-3 mt-3">
      <label >Modelo:</label>
      <input type="text" class="form-control" placeholder="Entre com o modelo" name="modelo">
    </div>
    
    <div class="mb-3 mt-3">
      <label >Preço:</label>
      <input type="text" class="form-control" placeholder="Entre com o preço" name="preco">
    </div>
    
    <div class="mb-3 mt-3">
      <label >Carregador:</label>
       <label class="radio-inline">
      <input type="radio" name="carregador" value="true" checked> Sim
    	</label>
    	<label class="radio-inline">
     	 <input type="radio" name="carregador" value="false"> Não
   	 </label>
    </div>
    
   
    
    
    
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>