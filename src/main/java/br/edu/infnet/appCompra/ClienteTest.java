package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.model.service.ClienteService;


@Component
@Order(3)
public class ClienteTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args)  {
		System.out.println();
		System.out.println("#cliente");
		System.out.println();
		
		
		try {
			Cliente cliente1 = new Cliente("123123123", "ana@gmail.com", "cliente 1");
			new ClienteService().incluir(cliente1);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] - CLIENTE" + e.getMessage());
		}
		
		
		
		
		try {
			Cliente cliente2 = new Cliente("234234234", "joao@gmail.com", "cliente 2");
			new ClienteService().incluir(cliente2);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] - CLIENTE" + e.getMessage());	
		}
		
		
		
		
		try {
			Cliente cliente3 = new Cliente("345345345","maria@maria.com", "cliente 3");
			new ClienteService().incluir(cliente3);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] - CLIENTE" + e.getMessage());	
		}
		
		
		
		
		try {
			Cliente cliente4 = new Cliente(null,"maria@maria.com", "cliente 3");
			new ClienteService().incluir(cliente4);
		} catch (CpfInvalidoException e) {
			System.out.println("Erro!!!");
		}
		
		
	}
	
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}

}
