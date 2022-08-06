package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "cliente 1";
		cliente1.cpf = "123123123";
		cliente1.email = "leoni@gmail.com";
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "cliente 2";
		cliente2.cpf = "234234234";
		cliente2.email = "adler@gmail.com";
		System.out.println(cliente2.toString());
		
		Cliente cliente3 = new Cliente();
		cliente3.nome = "cliente 3";
		cliente3.cpf = "345345345";
		cliente3.email = "leoniadler@gmail.com";
		System.out.println(cliente3.toString());

	}

}
