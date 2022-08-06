package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Compra {
	public String descricao; 
	public LocalDateTime data;
	public boolean web;
	
	@Override
	public String toString() {
		return descricao + " - " + "Data: " + data + " - " + web;
	}
}
