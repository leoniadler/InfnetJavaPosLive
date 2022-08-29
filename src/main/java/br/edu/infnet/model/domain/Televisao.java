package br.edu.infnet.model.domain;

import br.edu.infnet.model.domain.exceptions.TamanhoTelevisaoInvalidoException;

public class Televisao extends Produto{
	private String marca; 
	private Double tamanho;
	private Double valor;
	private boolean definicao;
	
//	@Override
	public Double calcularVenda() throws TamanhoTelevisaoInvalidoException{
		
		if(tamanho < 20) {
			throw new TamanhoTelevisaoInvalidoException(" Impossivel preencher o tamanho: (" + tamanho + ") com valor menor que 20");
		}
		
		Double valorValor =  valor * 2;
		
		Double valorDefinicao = (double) (definicao ? 5 : 2);
		
		return getValor() + valorValor + valorDefinicao;
	}
	
	
	
	@Override
	public String toString() {
		return "Marca: " + marca + " - " + " Tamanho: " + tamanho + " - " + "Valor: " + valor + " - " + definicao + super.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public Double getTamanho() {
		return tamanho;
	}



	public void setTamanho(Double tamanho) {
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

	@Override
	public void impressao() {
		System.out.println("#Televisao");
		System.out.println(this);
	}

	
	
	
}
