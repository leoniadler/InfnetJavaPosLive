package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Produto;

@Component
@Order(2)
public class ProdutoTest implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#produto");
		
		Produto produto1 = new Produto();
		produto1.setNome("Produto 1");
		produto1.setPreco(500.0);
		produto1.setCodigo(10);
		System.out.println(produto1.toString());
		
		Produto produto2 = new Produto();
		produto2.setNome("Produto 2");
		produto2.setPreco(800.0);
		produto2.setCodigo(11);
		System.out.println(produto2.toString());
		
		Produto produto3 = new Produto();
		produto3.setNome("Produto 3");
		produto3.setPreco(800.0);
		produto3.setCodigo(12);
		System.out.println(produto3.toString());
		
	}

}
