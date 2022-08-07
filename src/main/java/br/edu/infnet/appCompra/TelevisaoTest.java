package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;

import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Televisao;

@Component
@Order(6)
public class TelevisaoTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#televisao");
		
		Televisao televisao1 = new Televisao();
		
		televisao1.setCodigo(555);
		televisao1.setNome("TV 1");
		televisao1.setPreco((double) 15);
		
		televisao1.setMarca("Samsung");
		televisao1.setTamanho("45");
		televisao1.setValor(1000.0);
		televisao1.setDefinicao(true);
		System.out.println(televisao1.toString());
		
		Televisao televisao2 = new Televisao();
		
		televisao2.setCodigo(666);
		televisao2.setNome("TV 2");
		televisao2.setPreco((double) 16);
		
		televisao2.setMarca("Philco");
		televisao2.setTamanho("55");
		televisao2.setValor(2000.0);
		televisao2.setDefinicao(false);
		System.out.println(televisao2.toString());
		
		Televisao televisao3 = new Televisao();
		
		televisao3.setCodigo(777);
		televisao3.setNome("TV 3");
		televisao3.setPreco((double) 17);
		
		televisao3.setMarca("LG");
		televisao3.setTamanho("65");
		televisao3.setValor(3000.0);
		televisao3.setDefinicao(true);
		System.out.println(televisao3.toString());		
	}

}
