package br.edu.infnet.appCompra;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Celular;
import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.domain.Notebook;
import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Televisao;
import br.edu.infnet.model.test.AppImpressao;

@Component
@Order(1)
public class CompraTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("#compra");
		System.out.println();
		
		Celular celular1 = new Celular();
		
		celular1.setCodigo(123); 
		celular1.setNome("Cel 1");
		celular1.setPreco((double) 10);
			
		celular1.setMarca("Motorola");
		celular1.setModelo("Galaxy");
		celular1.setValor(1000.0);
		celular1.setCarregador(true);
		
		
		
		
		Celular celular2 = new Celular();
		
		celular1.setCodigo(234); 
		celular1.setNome("Cel 1");
		celular1.setPreco((double) 10);
			
		celular1.setMarca("Motorola");
		celular1.setModelo("Galaxy");
		celular1.setValor(1000.0);
		celular1.setCarregador(true);
		
		Televisao televisao1 = new Televisao();
		
		televisao1.setCodigo(345);
		televisao1.setNome("TV 1");
		televisao1.setPreco((double) 15);
		
		televisao1.setMarca("Samsung");
		televisao1.setTamanho("45");
		televisao1.setValor(1000.0);
		televisao1.setDefinicao(true);
		
		Notebook notebook1 = new Notebook();
		
		notebook1.setCodigo(456);
		notebook1.setNome("Note 1");
		notebook1.setPreco((double) 7);
		
		notebook1.setMarca("Samsung");
		notebook1.setInformacoes("Técnologia 4k");
		notebook1.setValor(2000.0);
		notebook1.setPlacaDeVideo(true);
		
		Set<Produto> listaCompraCompra1 = new HashSet<Produto>();
		
		listaCompraCompra1.add(celular1);
		listaCompraCompra1.add(celular2);
		listaCompraCompra1.add(celular2);
		listaCompraCompra1.add(televisao1);
	
		 
		
		Cliente cliente1 = new Cliente("12312312312", "ana@ana.com", "ana"); 
		
		Compra compra1 = new Compra(cliente1);
		compra1.setDescricao("Compra 1");
		compra1.setWeb(false);
		compra1.setProdutoLista(listaCompraCompra1);
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra1);
		
		Set<Produto> listaCompraCompra2 = new HashSet<Produto>();
		
		listaCompraCompra2.add(celular1);
		listaCompraCompra2.add(notebook1);
		
		
		
		Cliente cliente2 = new Cliente("23423423423", "joao@joao.com", "joao");
		
		Compra compra2 = new Compra(cliente2);
		compra2.setDescricao("Compra 2");		
		compra2.setWeb(true);
		compra2.setProdutoLista(listaCompraCompra2);
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra2);
		
		
		Set<Produto> listaCompraCompra3 = new HashSet<Produto>();
		
		listaCompraCompra3.add(celular1);
		listaCompraCompra3.add(televisao1);

		
		
		Cliente cliente3 = new Cliente("22222222222", "maria@maria.com", "maria");
		
		Compra compra3 = new Compra(cliente3);
		compra3.setDescricao("Compra 3");
		compra3.setWeb(false);
		compra3.setProdutoLista(listaCompraCompra3);
		AppImpressao.relatorio("Inclusão do Pedido 1!", compra3);
		
		
		
		
	}

}
