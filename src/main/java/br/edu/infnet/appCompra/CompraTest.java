package br.edu.infnet.appCompra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appCompra.controller.CompraController;
import br.edu.infnet.model.domain.Celular;
import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.domain.Notebook;
import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Televisao;
import br.edu.infnet.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.model.domain.exceptions.CompraSemProdutoException;
import br.edu.infnet.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.model.test.AppImpressao;

@Component
@Order(1)
public class CompraTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args)  {
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
		televisao1.setTamanho((double) 45);
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
		
		
		//----------------------------------------
		
		
		String dir = "MacintoshHD:/Usuários/ProjTxtInfnet/";
		String arq = "compras.rft";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					try {
						
						String[] campos = linha.split(";");
						
						Set<Produto> listaCompraCompra1 = new HashSet<Produto>();
						
						listaCompraCompra1.add(celular1);
						listaCompraCompra1.add(celular2);
						listaCompraCompra1.add(celular2);
						listaCompraCompra1.add(televisao1);
						
						Cliente cliente1 = new Cliente(campos[2], campos[3], campos[4]);
						
						Compra compra1 = new Compra(cliente1, listaCompraCompra1);
						compra1.setDescricao(campos[0]);
						compra1.setWeb(Boolean.valueOf(campos[1]));
						CompraController.incluir(compra1);
					} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
						System.out.println("[ERROR] - COMPRA: " + e.getMessage());
					} 
					
					
					linha = leitura.readLine();
				}
				
				leitura.close();
				
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O Arquivo não existe!!");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo!!");

			}	
		}finally {
			System.out.println("Terminou!!");
		}
		
		System.out.println(dir+arq);
	
		
		
		
		
		//----------------------------------------
		
		
//		try {
//			Set<Produto> listaCompraCompra2 = new HashSet<Produto>();
//			
//			listaCompraCompra2.add(celular1);
//			listaCompraCompra2.add(notebook1);
//			
//			Cliente cliente2 = new Cliente("23423423423", "joao@joao.com", "joao");
//			
//			Compra compra2 = new Compra(cliente2, listaCompraCompra2);
//			compra2.setDescricao("Compra 2");		
//			compra2.setWeb(true);
////			AppImpressao.relatorio("Inclusão do Pedido 2!", compra2);
//			CompraController.incluir(compra2);
//		} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
//			System.out.println("[ERROR] - COMPRA: " + e.getMessage());
//		}
//	
//
//		//----------------------------------------
//		
//		
//		try {
//			Set<Produto> listaCompraCompra3 = new HashSet<Produto>();
//			
//			listaCompraCompra3.add(celular1);
//			listaCompraCompra3.add(televisao1);
//			
//			Cliente cliente3 = new Cliente("22222222222", "maria@maria.com", "maria");
//			
//			Compra compra3 = new Compra(cliente3, listaCompraCompra3);
//			compra3.setDescricao("Compra 3");
//			compra3.setWeb(false);
////			AppImpressao.relatorio("Inclusão do Pedido 3!", compra3);
//			CompraController.incluir(compra3);
//		} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
//			System.out.println("[ERROR] - COMPRA: " + e.getMessage());
//		}
		
		//----------------------------------------
		
		
//				try {
//					Set<Produto> listaCompraCompra4 = new HashSet<Produto>();
//					
//					listaCompraCompra4.add(celular1);
//					listaCompraCompra4.add(celular2);
//					listaCompraCompra4.add(celular2);
//					listaCompraCompra4.add(televisao1);
//					
//					Cliente cliente4 = new Cliente("12312312312", "ana@ana.com", "ana");
//					
//					Compra compra4 = new Compra(null, listaCompraCompra4);
//					compra4.setDescricao("Compra 4");
//					compra4.setWeb(false);
////					AppImpressao.relatorio("Inclusão do Pedido 4!", compra4);
//					CompraController.incluir(compra4);
//				} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
//					System.out.println("[ERROR] - COMPRA: " + e.getMessage());
//				} 
//		
//				//----------------------------------------
//				
//				
//				try {
//					Set<Produto> listaCompraCompra5 = new HashSet<Produto>();
//					
//					Cliente cliente5 = new Cliente("12312312312", "ana@ana.com", "ana");
//					
//					Compra compra5 = new Compra(cliente5, listaCompraCompra5);
//					compra5.setDescricao("Compra 5");
//					compra5.setWeb(false);
////					AppImpressao.relatorio("Inclusão do Pedido 5!", compra5);
//					CompraController.incluir(compra5);
//				} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
//					System.out.println("[ERROR] - COMPRA: " + e.getMessage());
//				} 
//				
//				//----------------------------------------
//				
//				
//				try {
//					Set<Produto> listaCompraCompra6 = null;
//					
//					Cliente cliente6 = new Cliente("12312312312", "ana@ana.com", "ana");
//					
//					Compra compra6 = new Compra(cliente6, listaCompraCompra6);
//					compra6.setDescricao("Compra 6");
//					compra6.setWeb(false);
////					AppImpressao.relatorio("Inclusão do Pedido 6!", compra6);
//					CompraController.incluir(compra6);
//				} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
//					System.out.println("[ERROR] - COMPRA: " + e.getMessage());
//				} 
		
		
	}

}
