package br.edu.infnet.model.domain;

public class Televisao extends Produto{
	private String marca; 
	private String tamanho;
	private Double valor;
	private boolean definicao;
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + tamanho + " - " + "Valor: " + valor + " - " + definicao + super.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isDefinicao() {
		return definicao;
	}

	public void setDefinicao(boolean definicao) {
		this.definicao = definicao;
	}
	
	
}
