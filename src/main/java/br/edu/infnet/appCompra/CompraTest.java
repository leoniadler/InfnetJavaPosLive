package br.edu.infnet.appCompra;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.test.AppImpressao;

@Component
@Order(1)
public class CompraTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("#compra");
		System.out.println();
		
		Compra compra1 = new Compra();
		compra1.setDescricao("Compra 1");
		compra1.setData(LocalDateTime.now());
		compra1.setWeb(false);
		System.out.println(compra1.toString());
		
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra1);
		
		Compra compra2 = new Compra();
		compra2.setDescricao("Compra 2");
		compra2.setData(LocalDateTime.now());		
		compra2.setWeb(true);
		System.out.println(compra2.toString());
		
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra2);
		
		Compra compra3 = new Compra();
		compra3.setDescricao("Compra 3");
		compra3.setData(LocalDateTime.now());
		compra3.setWeb(false);
		System.out.println(compra3.toString());	
		
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra3);
	}

}
