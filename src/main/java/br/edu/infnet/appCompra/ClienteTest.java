package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Cliente;

@Component
@Order(3)
public class ClienteTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#cliente");
		
		Cliente cliente1 = new Cliente("123123123", "leoni@gmail.com", "cliente 1");
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente("234234234", "adler@gmail.com", "cliente 2");
		System.out.println(cliente2.toString());
		
		Cliente cliente3 = new Cliente("345345345","leoni@leoni.com", "cliente 3");
		System.out.println(cliente3.toString());		
	}

}
