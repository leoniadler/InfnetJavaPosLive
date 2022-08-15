package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Notebook;
import br.edu.infnet.model.test.AppImpressao;

@Component
@Order(5)
public class NotebookTest implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("#notebook");
		System.out.println();
		
		Notebook notebook1 = new Notebook();
		
		notebook1.setCodigo(222);
		notebook1.setNome("Note 1");
		notebook1.setPreco((double) 7);
		
		notebook1.setMarca("Samsung");
		notebook1.setInformacoes("Técnologia 4k");
		notebook1.setValor(2000.0);
		notebook1.setPlacaDeVideo(true);
		System.out.println(notebook1.toString());
		
		System.out.println();
		
		AppImpressao.relatorio("Inclusao do Notebook Samsung",notebook1);
		
		System.out.println();
		
//		AppProduto app = new AppProduto("Inclusao do Notebook Lançados");
//		app.relatorio(notebook1);
		
		Notebook notebook2 = new Notebook();
		
		notebook2.setCodigo(333);
		notebook2.setNome("Note 2");
		notebook2.setPreco((double) 8);
		
		notebook2.setMarca("Macbook");
		notebook2.setInformacoes("Técnologia Full-HD");
		notebook2.setValor(1000.0);
		notebook1.setPlacaDeVideo(false);
		System.out.println(notebook2.toString());
		
		System.out.println();
		
		AppImpressao.relatorio("Inclusao do Notebook Macbook", notebook2);
		
		System.out.println();
		
		Notebook notebook3 = new Notebook();
		
		notebook3.setCodigo(444);
		notebook3.setNome("Note 3");
		notebook3.setPreco((double) 9);
		
		notebook3.setMarca("Vaio");
		notebook3.setInformacoes("4k Técnology");
		notebook3.setValor(3000.0);
		notebook1.setPlacaDeVideo(true);
		System.out.println(notebook3.toString());	
		
		System.out.println();
		
		AppImpressao.relatorio("Inclusao do Notebook Vaio", notebook3);
		
		System.out.println();
	}

}
