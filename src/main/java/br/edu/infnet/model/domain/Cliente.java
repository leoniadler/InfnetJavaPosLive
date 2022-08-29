package br.edu.infnet.model.domain;

import br.edu.infnet.appCompra.interfaces.IPrinter;
import br.edu.infnet.model.domain.exceptions.CpfInvalidoException;

public class Cliente implements IPrinter {
	
	private Integer id;
	private String nome; 
	private String cpf;
	private String email;
	
	
	public Cliente (String cpf, String email, String nome) throws CpfInvalidoException {
		
		if(cpf == null) {
			throw new CpfInvalidoException("Não é possível aceitar CPF nulo!");
		}
		
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException("Não é possivel aceitar CPF sem preenchimento");
		}
		
		this.cpf = cpf;
		this.email = email;
		this.nome= nome;
	}
	
	
	@Override
	public void impressao() {
		System.out.println("#Cliente");
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return nome + " - " + " CPF: " + cpf + " - " + "E-mail: " + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
}
