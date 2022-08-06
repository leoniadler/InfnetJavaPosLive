package br.edu.infnet.model.domain;

public class Celular {
	public String marca; 
	public String modelo;
	public Double valor;
	public boolean carregador;
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + modelo + " - " + "Valor: " + valor + " - " + carregador;
	}
}
