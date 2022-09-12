package br.edu.infnet.model.domain;


//import java.util.Objects;

import br.edu.infnet.appCompra.interfaces.IPrinter;
import br.edu.infnet.model.domain.exceptions.TamanhoTelevisaoInvalidoException;
import br.edu.infnet.model.domain.exceptions.ValorCelularInvalidoException;
import br.edu.infnet.model.domain.exceptions.ValorNotebookInvalidoException;


public abstract class Produto implements IPrinter{
	private Integer id;
	private String nome; 
	private Double preco;
	private Integer codigo;
	private Produto produto;

	
//	public abstract void impressao();
	
	// int float string data
//	public Double calcularVenda() {
////		System.out.println("Calcular venda - Mae");
//		return preco * 2;
//	}
	
	
	
	public abstract Double calcularVenda() throws TamanhoTelevisaoInvalidoException, ValorCelularInvalidoException, ValorNotebookInvalidoException;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public void impressao() {
		System.out.println("#Pedido");
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return " Nome: " + nome + " - " + " Preço: " + preco + " - " + " Código: " + codigo + super.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	

	
	
	
}
