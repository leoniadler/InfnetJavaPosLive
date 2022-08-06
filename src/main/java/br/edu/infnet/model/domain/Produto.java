package br.edu.infnet.model.domain;



public class Produto {
	public String nome; 
	public Double valor;
	public Integer codigo;
	
	@Override
	public String toString() {
		return nome + " ; " + valor + " ; " + codigo;
	}
}
