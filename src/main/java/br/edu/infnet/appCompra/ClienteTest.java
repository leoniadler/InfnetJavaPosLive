package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.appCompra.controller.ClienteController;
import br.edu.infnet.model.domain.Cliente;


@Component
@Order(3)
public class ClienteTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("#cliente");
		System.out.println();
		
		Cliente cliente1 = new Cliente("123123123", "ana@gmail.com", "cliente 1");
		
		ClienteController.incluir(cliente1);
		
		Cliente cliente2 = new Cliente("234234234", "joao@gmail.com", "cliente 2");
		
		ClienteController.incluir(cliente2);
		
		Cliente cliente3 = new Cliente("345345345","maria@maria.com", "cliente 3");
		
		ClienteController.incluir(cliente3);
	}
	
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}

}
