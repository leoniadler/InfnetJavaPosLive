package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Televisao;

public class TelevisaoTest {

	public static void main(String[] args) {
		
		Televisao televisao1 = new Televisao();
		televisao1.marca = "Samsung";
		televisao1.tamanho = "45";
		televisao1.valor = 1000.0;
		televisao1.definicao = true;
		System.out.println(televisao1.toString());
		
		Televisao televisao2 = new Televisao();
		televisao2.marca = "Philco";
		televisao2.tamanho = "55";
		televisao2.valor = 2000.0;
		televisao1.definicao = false;
		System.out.println(televisao2.toString());
		
		Televisao televisao3 = new Televisao();
		televisao3.marca = "LG";
		televisao3.tamanho = "65";
		televisao3.valor = 3000.0;
		televisao1.definicao = true;
		System.out.println(televisao3.toString());
	}

}
