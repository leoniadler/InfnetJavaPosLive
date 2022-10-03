package br.edu.infnet.appCompra.model.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appCompra.model.domain.exceptions.ValorCelularInvalidoException;

@Entity
@Table(name = "TCelular")
public class Celular extends Produto{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String marca; 
	private String modelo;
	private Double valor;
	private boolean carregador;
	
	@Override
	public Double calcularVenda() throws ValorCelularInvalidoException {
		
		if(valor < 500) {
			throw new ValorCelularInvalidoException(" Impossivel preencher o tamanho: (" + valor + ") com valor menor que 500");
		}
		
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
