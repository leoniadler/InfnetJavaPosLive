package br.edu.infnet.model.domain.exceptions;

public class ValorCelularInvalidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ValorCelularInvalidoException(String mensagem) {
		super(mensagem);
	}
}
