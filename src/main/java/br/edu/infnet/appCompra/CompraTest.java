package br.edu.infnet.appCompra;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Compra;

@Component
public class CompraTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("#compra");
		
		Compra compra1 = new Compra();
		compra1.descricao = "Compra 1";
		compra1.data = LocalDateTime.now();
		compra1.web = false;
		System.out.println(compra1.toString());
		
		Compra compra2 = new Compra();
		compra2.descricao = "Compra 2";
		compra2.data = LocalDateTime.now();
		compra2.web = true;
		System.out.println(compra2.toString());
		
		Compra compra3 = new Compra();
		compra3.descricao = "Compra 3";
		compra3.data = LocalDateTime.now();
		compra3.web = false;
		System.out.println(compra3.toString());		
	}

}
