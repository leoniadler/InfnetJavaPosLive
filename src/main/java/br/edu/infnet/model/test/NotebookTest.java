package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Notebook;

public class NotebookTest {

	public static void main(String[] args) {
		
		Notebook notebook1 = new Notebook();
		notebook1.marca = "Samsung";
		notebook1.informacoes = "Técnologia 4k";
		notebook1.valor = 2000.0;
		notebook1.placaDeVideo = true;
		System.out.println(notebook1.toString());
		
		Notebook notebook2 = new Notebook();
		notebook2.marca = "Philco";
		notebook2.informacoes = "Técnologia Full-HD";
		notebook2.valor = 1000.0;
		notebook1.placaDeVideo = false;
		System.out.println(notebook2.toString());
		
		Notebook notebook3 = new Notebook();
		notebook3.marca = "LG";
		notebook3.informacoes = "4k Técnology";
		notebook3.valor = 3000.0;
		notebook1.placaDeVideo = true;
		System.out.println(notebook3.toString());
	}

}
