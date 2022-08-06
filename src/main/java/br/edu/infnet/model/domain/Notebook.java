package br.edu.infnet.model.domain;

public class Notebook {
	public String marca; 
	public String informacoes;
	public Double valor;
	public boolean placaDeVideo;
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + informacoes + " - " + "Valor: " + valor + " - " + placaDeVideo;
	}
}
