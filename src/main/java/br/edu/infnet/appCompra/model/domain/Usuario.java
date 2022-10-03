package br.edu.infnet.appCompra.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import br.edu.infnet.appCompra.interfaces.IPrinter;

@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true )
	@JoinColumn(name = "idUsuario")
	private List<Cliente> clientes;
	
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true )
	@JoinColumn(name = "idUsuario")
	private List<Produto> produtos;
	
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true )
	@JoinColumn(name = "idUsuario")
	private List<Compra> compras;

	@Override
	public void impressao() {
		System.out.println("#Usuario");
		System.out.println(this);	
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " - " + " E-mail: " + email + " - " + "Senha: " + senha;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	
	
	
	
}
