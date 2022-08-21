package br.edu.infnet.model.domain;

import java.time.LocalDateTime;
//import java.util.List;
import java.util.Set;

import br.edu.infnet.appCompra.interfaces.IPrinter;

public class Compra implements IPrinter {
	private Integer id;
	private String descricao;  // get recuperar - set preencher
	private LocalDateTime data;
	private boolean web;
	private Cliente cliente;
	private Set<Produto> produtoLista;
	
	public Compra(Cliente cliente) {
		this.data = LocalDateTime.now();;
		this.cliente = cliente;
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

//	public LocalDateTime getData() {
//		return data;
//	}
//
//	public void setData(LocalDateTime data) {
//		this.data = data;
//	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}


	public Set<Produto> getProdutoLista() {
		return produtoLista;
	}


	public void setProdutoLista(Set<Produto> produtoLista) {
		this.produtoLista = produtoLista;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
