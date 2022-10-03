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
	
	
	<c:set var="ativaBotao" value="" ></c:set>
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
  <h2>Cadastro de Compras</h2>
  
  <form action="/compra/incluir" method="post">
  
  	<div class="mb-3 mt-3">
      <label >Descrição:</label>
      <input type="text" class="form-control" placeholder="Entre com a descrição" value="Primeiro Pedido" name="descricao">
    </div>
    
    <div class="mb-3 mt-3">
    <c:if test="${not empty cliente}">
      <label >Cliente:</label>
	       <select name="cliente" class="form-control" id="sel1">
	    		
	    		<c:forEach var="c" items="${cliente}"> 
	    			<option value="${c.id}" >${c.nome}</option>
	    		</c:forEach>
	  		</select>
  		</c:if>
    </div>
    
    
    <c:if test="${empty cliente}">
      <label >Não existem clientes cadastrados!</label>
      <c:set var="ativaBotao" value="disabled" ></c:set>
  	</c:if>
   
    
   <div class="mb-3 mt-3">
   <c:if test="${not empty produtos}">
      <label >Produtos:</label>
     	 <c:forEach var="p" items="${produtos}">
     	 	<div class="checkbox">
  				<label><input type="checkbox" name="produtoLista" value="${p.id}"> ${p.nome}</label>
			</div>
     	 </c:forEach>
		</c:if>
    </div>
    
    
   <c:if test="${empty produtos}">
      <label >Não existem produtos cadastrados!</label>
     	<c:set var="ativaBotao" value="disabled" ></c:set>
	</c:if>
    
    
    <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>