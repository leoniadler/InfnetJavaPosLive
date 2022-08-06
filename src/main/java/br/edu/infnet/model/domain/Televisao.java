package br.edu.infnet.model.domain;

public class Televisao {
	public String marca; 
	public String tamanho;
	public Double valor;
	public boolean definicao;
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Modelo: " + tamanho + " - " + "Valor: " + valor + " - " + definicao;
	}
}
