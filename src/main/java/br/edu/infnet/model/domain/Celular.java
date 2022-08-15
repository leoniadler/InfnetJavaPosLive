package br.edu.infnet.model.domain;

public class Celular extends Produto{
	private String marca; 
	private String modelo;
	private Double valor;
	private boolean carregador;
	
	@Override
	public Double calcularVenda() {
			System.out.println("Calcular venda - Celular");
			Double valorCarregador = (double) (carregador ? 10 : 5);// se o atributo carregador for verdadeiro sera 10 senao 5
			
			Double valorValor =  valor * 2;
		
		return getValor() * 2 + valorCarregador + valorValor;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + modelo + " - " + "Valor: " + valor + " - " + carregador + super.toString();
	}
	
	@Override
	public void impressao() {
		System.out.println("#Celular");
		System.out.println(this);
		
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
