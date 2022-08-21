package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//import br.edu.infnet.appCompra.controller.CelularController;
import br.edu.infnet.appCompra.controller.ClienteController;
import br.edu.infnet.model.domain.Cliente;
//import br.edu.infnet.model.test.AppImpressao;

@Component
@Order(3)
public class ClienteTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("#cliente");
		System.out.println();
		
		Cliente cliente1 = new Cliente("123123123", "ana@gmail.com", "cliente 1");
//		AppImpressao.relatorio("Inclusão cliente 1 ", cliente1);
		
		ClienteController.incluir(cliente1);
		
//		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente("234234234", "joao@gmail.com", "cliente 2");
//		AppImpressao.relatorio("Inclusão cliente 2 ", cliente2);
//		System.out.println(cliente2.toString());
		
		ClienteController.incluir(cliente2);
		
		Cliente cliente3 = new Cliente("345345345","maria@maria.com", "cliente 3");
//		AppImpressao.relatorio("Inclusão cliente 3 ", cliente3);
//		System.out.println(cliente3.toString());
		
		ClienteController.incluir(cliente3);
	}
	
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}

}
