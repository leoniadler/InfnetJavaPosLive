package br.edu.infnet.appCompra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.domain.exceptions.TamanhoTelevisaoInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.ValorCelularInvalidoException;
import br.edu.infnet.appCompra.model.service.TelevisaoService;

@Component
@Order(6)
public class TelevisaoTest implements ApplicationRunner{

	@Autowired
	private TelevisaoService televisaoService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println();
		System.out.println("#televisao");
		System.out.println();
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "produtos.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("C".equalsIgnoreCase(campos[0])) {
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
							televisaoService.incluir(televisao1);
//							new TelevisaoService().incluir(televisao1);
						} catch (TamanhoTelevisaoInvalidoException e) {
							System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
						}
						System.out.println();
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
		
//		System.out.println(televisao1.toString());
//		try {
//			Televisao televisao1 = new Televisao();
//			
//			televisao1.setCodigo(555);
//			televisao1.setNome("TV 1");
//			televisao1.setPreco((double) 15);
//			
//			televisao1.setMarca("Samsung");
//			televisao1.setTamanho((double) 45);
//			televisao1.setValor(1000.0);
//			televisao1.setDefinicao(true);
//			System.out.println("Calculo de Venda: " + televisao1.calcularVenda());
//			televisaoService.incluir(televisao1);
////			new TelevisaoService().incluir(televisao1);
//		} catch (TamanhoTelevisaoInvalidoException e) {
//			System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
//		}
//		System.out.println();
//		
//		
//		
////		AppImpressao.relatorio("Inclusao da TV Samsung", televisao1);
//		
//		System.out.println();
//		
//		
////		System.out.println(televisao2.toString());
//		try {
//			Televisao televisao2 = new Televisao();
//			
//			televisao2.setCodigo(666);
//			televisao2.setNome("TV 2");
//			televisao2.setPreco((double) 16);
//			
//			televisao2.setMarca("Philco");
//			televisao2.setTamanho((double) 55);
//			televisao2.setValor(2000.0);
//			televisao2.setDefinicao(false);
//			System.out.println("Calculo de Venda: " + televisao2.calcularVenda());
//			televisaoService.incluir(televisao2);
////			new TelevisaoService().incluir(televisao2);
//		} catch (TamanhoTelevisaoInvalidoException e) {
//			System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
//		}
//		
//		System.out.println();
//		
//		
//		
////		 AppImpressao.relatorio("Inclusao da TV Philco", televisao2);
//		
//		System.out.println();
//		
//		
////		System.out.println(televisao3.toString());	
//		try {
//			Televisao televisao3 = new Televisao();
//			
//			televisao3.setCodigo(777);
//			televisao3.setNome("TV 3");
//			televisao3.setPreco((double) 17);
//			
//			televisao3.setMarca("LG");
//			televisao3.setTamanho((double) 65);
//			televisao3.setValor(3000.0);
//			televisao3.setDefinicao(true);
//			System.out.println("Calculo de Venda: " + televisao3.calcularVenda());
//			televisaoService.incluir(televisao3);
////			new TelevisaoService().incluir(televisao3);
//		} catch (TamanhoTelevisaoInvalidoException e) {
//			System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
//		}
//		
//		System.out.println();
//		
//		try {
//			Televisao televisao4 = new Televisao();
//			
//			televisao4.setCodigo(777);
//			televisao4.setNome("TV 3");
//			televisao4.setPreco((double) 17);
//			
//			televisao4.setMarca("LG");
//			televisao4.setTamanho((double) 15);
//			televisao4.setValor(400.0);
//			televisao4.setDefinicao(true);
//			System.out.println("Calculo de Venda: " + televisao4.calcularVenda());
//			televisaoService.incluir(televisao4);
////			new TelevisaoService().incluir(televisao4);
//		} catch (TamanhoTelevisaoInvalidoException e) {
//			System.out.println("[ERROR - TELEVISÃO]" + e.getMessage());
//		}
//		
//		System.out.println();
//		
//		
////		 AppImpressao.relatorio("Inclusao da TV LG", televisao3);
//		
//		System.out.println();
	}

}
