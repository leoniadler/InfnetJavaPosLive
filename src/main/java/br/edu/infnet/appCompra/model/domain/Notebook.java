package br.edu.infnet.appCompra.model.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appCompra.model.domain.exceptions.ValorNotebookInvalidoException;

//@Entity
//@Table(name = "TNotebook")
public class Notebook extends Produto{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String marca; 
	private String informacoes;
	private Double valor;
	private boolean placaDeVideo;

	
	@Override
	public Double calcularVenda() throws ValorNotebookInvalidoException {	
		
		if(valor < 800) {
			throw new ValorNotebookInvalidoException(" Impossivel preencher o tamanho: (" + valor + ") com valor menor que 20");
		}
		
		return getValor() * 2;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + informacoes + " - " + "Valor: " + valor + " - " + placaDeVideo + super.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(boolean placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	@Override
	public void impressao() {
		System.out.println("#Notebbok");
		System.out.println(this);
		
	}

	
	
	
}
