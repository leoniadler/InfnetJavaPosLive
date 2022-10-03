package br.edu.infnet.appCompra.model.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import java.util.Objects;

import br.edu.infnet.appCompra.interfaces.IPrinter;
import br.edu.infnet.appCompra.model.domain.exceptions.TamanhoTelevisaoInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.ValorCelularInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.ValorNotebookInvalidoException;


@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto implements IPrinter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome; 
	private Double preco;
	private Integer codigo;
	
	@ManyToMany(mappedBy = "produtoLista")
	private List<Compra> compras;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public abstract Double calcularVenda() throws TamanhoTelevisaoInvalidoException, ValorCelularInvalidoException, ValorNotebookInvalidoException;


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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	
	

	
	
	
}
