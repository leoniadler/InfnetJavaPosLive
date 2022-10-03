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
import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appCompra.model.domain.exceptions.ValorCelularInvalidoException;
import br.edu.infnet.appCompra.model.service.CelularService;

@Component
@Order(3)
public class CelularTest implements ApplicationRunner {
	
	@Autowired
	private CelularService celularService;

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println();
		System.out.println("#celular");
		System.out.println();
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "produtos.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("B".equalsIgnoreCase(campos[0])) {
						try {
							Celular celular1 = new Celular();
							
							celular1.setCodigo(Integer.valueOf(campos[1])); 
							celular1.setNome(campos[2]);
							celular1.setPreco(Double.valueOf(campos[3]));
								
							celular1.setMarca(campos[4]);
							celular1.setModelo(campos[5]);
							celular1.setValor(Double.valueOf(campos[6]));
							celular1.setCarregador(Boolean.valueOf(campos[7]));
							celular1.setUsuario(usuario);
//							System.out.println();
							System.out.println("Calculo de Venda: " + celular1.calcularVenda());
							celularService.incluir(celular1);
//							new CelularService().incluir(celular1);
						} catch (ValorCelularInvalidoException e) {
							System.out.println("[ERROR - CELULAR]" + e.getMessage());
						}
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
		
//		
//		try {
//			Celular celular1 = new Celular();
//			
//			celular1.setCodigo(123); 
//			celular1.setNome("Cel 1");
//			celular1.setPreco((double) 10);
//				
//			celular1.setMarca("Motorola");
//			celular1.setModelo("Galaxy");
//			celular1.setValor(1000.0);
//			celular1.setCarregador(true);
//			System.out.println();
//			System.out.println("Calculo de Venda: " + celular1.calcularVenda());
//			celularService.incluir(celular1);
////			new CelularService().incluir(celular1);
//		} catch (ValorCelularInvalidoException e) {
//			System.out.println("[ERROR - CELULAR]" + e.getMessage());
//		}
//		
//		
//		System.out.println();
		
		
		
//		try {
//			Celular celular2 = new Celular();
//			
//			celular2.setCodigo(234);
//			celular2.setNome("Cel 2");
//			celular2.setPreco((double) 20);
//			
//			celular2.setMarca("Apple");
//			celular2.setModelo("11");
//			celular2.setValor(2000.0);
//			celular2.setCarregador(false);
//			System.out.println();
//			System.out.println("Calculo de Venda: " + celular2.calcularVenda());
//			celularService.incluir(celular2);
////			new CelularService().incluir(celular2);
//		} catch (ValorCelularInvalidoException e) {
//			System.out.println("[ERROR - CELULAR]" + e.getMessage());
//		}
//		
//
//		
//		System.out.println();
//		
//		
//			
//		try {
//			Celular celular3 = new Celular();
//			
//			celular3.setCodigo(345);
//			celular3.setNome("Cel 3");
//			celular3.setPreco((double) 30);
//			
//			celular3.setMarca("LG");
//			celular3.setModelo("NX 10");
//			celular3.setValor(3000.0);
//			celular3.setCarregador(true);
//			System.out.println("Calculo de Venda: " + celular3.calcularVenda());
//			celularService.incluir(celular3);
////			new CelularService().incluir(celular3);
//		} catch (ValorCelularInvalidoException e) {
//			System.out.println("[ERROR - CELULAR]" + e.getMessage());
//		}
//		
//		System.out.println();
//		
//		
//		
//		try {
//			Celular celular4 = new Celular();
//			
//			celular4.setCodigo(345);
//			celular4.setNome("Cel 3");
//			celular4.setPreco((double) 30);
//			
//			celular4.setMarca("LG");
//			celular4.setModelo("NX 10");
//			celular4.setValor(400.0);
//			celular4.setCarregador(true);
//			System.out.println("Calculo de Venda: " + celular4.calcularVenda());
//			celularService.incluir(celular4);
////			new CelularService().incluir(celular4);
//		} catch (ValorCelularInvalidoException e) {
//			System.out.println("[ERROR - CELULAR]" + e.getMessage());
//		}
//		
	}

}
