//package br.edu.infnet.appCompra;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import br.edu.infnet.model.domain.Produto;
//import br.edu.infnet.model.domain.Usuario;
//import br.edu.infnet.model.domain.exceptions.ValorNotebookInvalidoException;
//import br.edu.infnet.model.service.ProdutoService;
//import br.edu.infnet.model.service.UsuarioService;
//
//@Component
//@Order(2)
//public class ProdutoTest implements ApplicationRunner {
//
//
//	@Override
//	public void run(ApplicationArguments args)  {
//		System.out.println("#produto");
//		
//		Produto produto1 = null;
//		produto1 = new Produto();
//		produto1.setNome("Produto 1");
//		produto1.setPreco(500.0);
//		produto1.setCodigo(10);
//		System.out.println(produto1.toString());
//		
//		Produto produto2 = new Produto();
//		produto2.setNome("Produto 2");
//		produto2.setPreco(800.0);
//		produto2.setCodigo(11);
//		System.out.println(produto2.toString());
//		
//		Produto produto3 = new Produto();
//		produto3.setNome("Produto 3");
//		produto3.setPreco(800.0);
//		produto3.setCodigo(12);
//		System.out.println(produto3.toString());
//		
//		
//		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
//		String arq = "usuario.txt";
//		
//		try{
//			try {
//				FileReader fileReader = new FileReader(dir+arq);
//				
//				BufferedReader leitura = new BufferedReader(fileReader);
//				
//				
//				String linha = leitura.readLine();
//				while(linha != null) {
//					
//					produto1 = new Produto();
//					produto1.setNome("Produto 1");
//					produto1.setPreco(500.0);
//					produto1.setCodigo(10);
//					System.out.println(produto1.toString());
//					
//					linha = leitura.readLine();
//				}
//				
//				leitura.close();
//				
//				fileReader.close();
//			} catch (FileNotFoundException e) {
//				System.out.println("[ERRO] O Arquivo não existe!!");
//			} catch (IOException e) {
//				System.out.println("[ERRO] Problema no fechamento do arquivo!!");
//
//			}	
//		}finally {
//			System.out.println("Terminou!!");
//		}
//		
//		System.out.println(dir+arq);
//		
//	}
//	
//}
//
//// new ProdutoService
////try {
////	Produto produto1 = new Produto();
////	
////	produto1.setCodigo(10);
////	produto1.setNome("Produto 1");
////	produto1.setPreco(500.0);
////	
////	System.out.println("Calculo de Venda: " + produto1.calcularVenda());
////	new ProdutoService().incluir(produto1);
////} catch (ValorNotebookInvalidoException e) {
////	System.out.println("[ERROR - NOTEBOOK]" + e.getMessage());
////}
