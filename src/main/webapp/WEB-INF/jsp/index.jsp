<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AppCompra</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	
		<div class="container">
	  <h2>AppCompra</h2>
	  <p>Gestão de Cadastro de Compras</p>
	  
	  <h3>Classe: Compra</h3>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrisão</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Descrisão</td>
	        <td>String</td>
	        <td>Descrisão da Compra</td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDateTime</td>
	        <td>Data de realização da Compra</td>
	      </tr>
	      <tr>
	        <td>web</td>
	        <td>boolean</td>
	        <td>Indicativo para um pedido online ou presencial</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
</body>
</html>