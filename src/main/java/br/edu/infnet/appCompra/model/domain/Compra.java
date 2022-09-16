package br.edu.infnet.appCompra.model.domain;

import java.time.LocalDateTime;
//import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appCompra.interfaces.IPrinter;
import br.edu.infnet.appCompra.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appCompra.model.domain.exceptions.CompraSemProdutoException;

//@Entity
//@Table(name = "TCompra")
public class Compra implements IPrinter {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;  // get recuperar - set preencher
	private LocalDateTime data;
	private boolean web;
	private Cliente cliente;
	private Set<Produto> produtoLista;
	
	public Compra(Cliente cliente, Set<Produto> produtoLista) throws ClienteNuloException, CompraSemProdutoException {
		
		// Cliente
		if(cliente == null) {
			throw new ClienteNuloException("Impossivel efetuar uma compra sem um cliente!");
		}
		
		// Produto
		if(produtoLista == null) {
			throw new CompraSemProdutoException("Impossivel criar um pedido sem uma lista de produtos!");
		}
		
		// Produto
		if(produtoLista.size() < 1) {
			throw new CompraSemProdutoException("Impossivel efetuar um pedido sem produtos!");
		}
		
		this.data = LocalDateTime.now();
		this.cliente = cliente;
		this.produtoLista = produtoLista;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Set<Produto> getProdutoLista() {
		return produtoLista;
	}


	public void setProdutoLista(Set<Produto> produtoLista) {
		this.produtoLista = produtoLista;
	}


	public LocalDateTime getData() {
		return data;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}


	@Override
	public void impressao() {
		System.out.println("#Pedido");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return descricao + " - " + "Data: " + data + " - " + web + " - " + "Cliente: " + cliente + " - " + " Produto: " + produtoLista.size();
	}
	


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
