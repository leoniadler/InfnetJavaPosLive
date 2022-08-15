package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appCompra.interfaces.IPrinter;

public class Compra implements IPrinter {
	private String descricao;  // get recuperar - set preencher
	private LocalDateTime data;
	private boolean web;
	
	@Override
	public void impressao() {
		System.out.println("#Pedido");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return descricao + " - " + "Data: " + data + " - " + web;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}
	
}
