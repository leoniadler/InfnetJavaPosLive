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
	  
	  <h3>Classe: Produto</h3>            
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
	        <td>nome</td>
	        <td>String</td>
	        <td>Descrisão do produto</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>Double</td>
	        <td>Preço do produto</td>
	      </tr>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>Indicativo para o código do produto</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Cliente</h3>            
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
	        <td>nome</td>
	        <td>String</td>
	        <td>Descrisão do cliente</td>
	      </tr>
	      <tr>
	        <td>cpf</td>
	        <td>String</td>
	        <td>Indicativo para o CPF do cliente</td>
	      </tr>
	      <tr>
	        <td>email</td>
	        <td>String</td>
	        <td>Indicativo para o email do cliente</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Celular</h3>            
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
	        <td>marca</td>
	        <td>String</td>
	        <td>Descrição da marca</td>
	      </tr>
	      <tr>
	        <td>modelo</td>
	        <td>String</td>
	        <td>Descrição do modelo do celular</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>Double</td>
	        <td>Preço do aparelho</td>
	      </tr>
	      <tr>
	        <td>carregador</td>
	        <td>boolean</td>
	        <td>Opcional</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Televisão</h3>            
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
	        <td>marca</td>
	        <td>String</td>
	        <td>Descrição da marca</td>
	      </tr>
	      <tr>
	        <td>tamanho</td>
	        <td>String</td>
	        <td>Indicativo do tamanho da televisão</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>Double</td>
	        <td>Preço do produto</td>
	      </tr>
	      <tr>
	        <td>definição</td>
	        <td>boolean</td>
	        <td>Opcional</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Notebook</h3>            
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
	        <td>marca</td>
	        <td>String</td>
	        <td>Descrição da marca</td>
	      </tr>
	      <tr>
	        <td>informacoes</td>
	        <td>String</td>
	        <td>Informações do produto</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>Double</td>
	        <td>Preço do produto</td>
	      </tr>
	      <tr>
	        <td>placa de video</td>
	        <td>boolean</td>
	        <td>Opcional</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
</body>
</html>