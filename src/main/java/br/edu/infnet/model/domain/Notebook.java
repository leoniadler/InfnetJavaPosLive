package br.edu.infnet.model.domain;

public class Notebook extends Produto{
	private String marca; 
	private String informacoes;
	private Double valor;
	private boolean placaDeVideo;
	
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
	
	
}
