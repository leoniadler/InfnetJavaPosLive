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
  <h2>Cadastro de Compras</h2>
  
  <form action="/compra/incluir" method="post">
  
  	<div class="mb-3 mt-3">
      <label >Descrição:</label>
      <input type="text" class="form-control" placeholder="Entre com a descrição" value="Primeiro Pedido" name="descricao">
    </div>
    
    <div class="mb-3 mt-3">
      <label >Cliente:</label>
       <select class="form-control" id="sel1">
    		
    		<c:forEach var="c" items="${cliente}"> 
    			<option>${c.nome}</option>
    		</c:forEach>
  		</select>
    </div>
    
   <div class="mb-3 mt-3">
      <label >Produtos:</label>
     	 <c:forEach var="p" items="${produtos}">
     	 	<div class="checkbox">
  				<label><input type="checkbox" value=""> ${p.nome}</label>
			</div>
     	 </c:forEach>
		
    </div>
    
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>