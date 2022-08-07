package br.edu.infnet.model.domain;

public class Celular extends Produto{
	private String marca; 
	private String modelo;
	private Double valor;
	private boolean carregador;
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + modelo + " - " + "Valor: " + valor + " - " + carregador + super.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isCarregador() {
		return carregador;
	}

	public void setCarregador(boolean carregador) {
		this.carregador = carregador;
	}
	
	
}
