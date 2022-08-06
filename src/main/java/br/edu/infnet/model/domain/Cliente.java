package br.edu.infnet.model.domain;

public class Cliente {
	
	public String nome; 
	public String cpf;
	public String email;
	
	@Override
	public String toString() {
		return nome + " - " + " CPF: " + cpf + " - " + "E-mail: " + email;
	}

}
