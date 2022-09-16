package br.edu.infnet.appCompra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

//import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appCompra.controller.CompraController;
import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Compra;
import br.edu.infnet.appCompra.model.domain.Notebook;
import br.edu.infnet.appCompra.model.domain.Produto;
import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appCompra.model.domain.exceptions.CompraSemProdutoException;
import br.edu.infnet.appCompra.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.TamanhoTelevisaoInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.ValorCelularInvalidoException;
import br.edu.infnet.appCompra.model.service.CompraService;

@Component
@Order(1)
public class CompraTest implements ApplicationRunner{
	
	@Autowired
	private CompraService compraService;

	@Override
	public void run(ApplicationArguments args)  {
		System.out.println();
		System.out.println("#compra");
		System.out.println();
		
//		Celular celular1 = new Celular();
//		
//		celular1.setCodigo(123); 
//		celular1.setNome("Cel 1");
//		celular1.setPreco((double) 10);
//			
//		celular1.setMarca("Motorola");
//		celular1.setModelo("Galaxy");
//		celular1.setValor(1000.0);
//		celular1.setCarregador(true);
//		
//		Celular celular2 = new Celular();
//		
//		celular1.setCodigo(234); 
//		celular1.setNome("Cel 1");
//		celular1.setPreco((double) 10);
//			
//		celular1.setMarca("Motorola");
//		celular1.setModelo("Galaxy");
//		celular1.setValor(1000.0);
//		celular1.setCarregador(true);
		
//		Televisao televisao1 = new Televisao();
//		
//		televisao1.setCodigo(345);
//		televisao1.setNome("TV 1");
//		televisao1.setPreco((double) 15);
//		
//		televisao1.setMarca("Samsung");
//		televisao1.setTamanho((double) 45);
//		televisao1.setValor(1000.0);
//		televisao1.setDefinicao(true);
//		
//		Notebook notebook1 = new Notebook();
//		
//		notebook1.setCodigo(456);
//		notebook1.setNome("Note 1");
//		notebook1.setPreco((double) 7);
//		
//		notebook1.setMarca("Samsung");
//		notebook1.setInformacoes("Técnologia 4k");
//		notebook1.setValor(2000.0);
//		notebook1.setPlacaDeVideo(true);
		
		
		//----------------------------------------
		
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "compras.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Set<Produto> produtos = null;
				List<Compra> compras = new ArrayList<Compra>();
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "P":
						
						try {
							
//							compras = new HashSet<Produto>();
							
							Cliente cliente1 = new Cliente(campos[3], campos[4], campos[5]);
							
							Compra compra1 = new Compra(cliente1, produtos);
							compra1.setDescricao(campos[1]);
							compra1.setWeb(Boolean.valueOf(campos[2]));
//							CompraController.incluir(compra1);
							
							compras.add(compra1);
						} catch (CpfInvalidoException | ClienteNuloException | CompraSemProdutoException e) {
							System.out.println("[ERROR] - COMPRA: " + e.getMessage());
						} 
						
						break;
					case "B":
						try {
							Celular celular1 = new Celular();
							
							celular1.setCodigo(Integer.valueOf(campos[1])); 
							celular1.setNome(campos[2]);
							celular1.setPreco(Double.valueOf(campos[3]));
								
							celular1.setMarca(campos[4]);
							celular1.setModelo(campos[5]);
							celular1.setValor(Double.valueOf(campos[6]));
							celular1.setCarregador(Boolean.valueOf(campos[7]));
							System.out.println("Calculo de Venda: " + celular1.calcularVenda());
//							celularService.incluir(celular1);
//							new CelularService().incluir(celular1);
							produtos.add(celular1);
						} catch (ValorCelularInvalidoException e) {
							System.out.println("[ERROR - CELULAR]" + e.getMessage());
						}
						
						
						
						break;	
					case "C":
						try {
						Televisao televisao1 = new Televisao();
						
						televisao1.setCodigo(Integer.valueOf(campos[1]));
						televisao1.setNome(campos[2]);
						televisao1.setPreco(Double.valueOf(campos[3]));
						
						televisao1.setMarca(campos[4]);
						televisao1.setTamanho(Double.valueOf(campos[5]));
						televisao1.setValor(Double.valueOf(campos[6]));
						televisao1.setDefinicao(Boolean.valueOf(campos[7]));
						System.out.println("Calculo de Venda: " + televisao1.calcularVenda());
//						televisaoService.incluir(televisao1);
//						new TelevisaoService().incluir(televisao1);
						produtos.add(televisao1);
					} catch (TamanhoTelevisaoInvalidoException e) {
						System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
					}
						
						
						break;
					case "D":
//						produtos.add(notebook1);
						break;

					default:
						break;
					}
					
					
					linha = leitura.readLine();
				}
				
				//
				for(Compra c : compras) {
					System.out.println(">>>>>>>>>>>>>>> " + c.getId());
					System.out.println(">>>>>>>>>>>>> " + c.getCliente().getNome());
					System.out.println(">>>>>>>>>>> " + c.getProdutoLista().size());
					CompraController compraController = new CompraController();
					//					new CompraService().incluir(c);
					compraService.incluir(c);
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
