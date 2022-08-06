package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Celular;

public class CelularTest {

	public static void main(String[] args) {
		
		Celular celular1 = new Celular();
		celular1.marca = "Motorola";
		celular1.modelo = "Galaxy";
		celular1.valor = 1000.0;
		celular1.carregador = true;
		System.out.println(celular1.toString());
		
		Celular celular2 = new Celular();
		celular2.marca = "Apple";
		celular2.modelo = "11";
		celular2.valor = 2000.0;
		celular1.carregador = false;
		System.out.println(celular2.toString());
		
		Celular celular3 = new Celular();
		celular3.marca = "LG";
		celular3.modelo = "NX 10";
		celular3.valor = 3000.0;
		celular1.carregador = true;
		System.out.println(celular3.toString());
	}

}
