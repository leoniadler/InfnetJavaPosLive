package br.edu.infnet.appCompra.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appCompra.model.domain.exceptions.TamanhoTelevisaoInvalidoException;

@Entity
@Table(name = "TTelevisao")
public class Televisao extends Produto{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
