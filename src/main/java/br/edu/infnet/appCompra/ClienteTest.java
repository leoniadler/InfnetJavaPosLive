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

import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appCompra.model.service.ClienteService;
import br.edu.infnet.appCompra.model.service.UsuarioService;


@Component
@Order(2)
public class ClienteTest implements ApplicationRunner{
	
	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args)  {
		
		System.out.println();
		System.out.println("#cliente");
		System.out.println();
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "clientes.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Cliente cliente1 = new Cliente(campos[0], campos[1], campos[2]);
						cliente1.setUsuario(usuario);
						clienteService.incluir(cliente1);
//						new ClienteService().incluir(cliente1);
					} catch (CpfInvalidoException e) {
						System.out.println("[ERROR] - CLIENTE" + e.getMessage());
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
		
		
		
		
//		try {
//			Cliente cliente1 = new Cliente("123123123", "ana@gmail.com", "cliente 1");
//			clienteService.incluir(cliente1);
////			new ClienteService().incluir(cliente1);
//		} catch (CpfInvalidoException e) {
//			System.out.println("[ERROR] - CLIENTE" + e.getMessage());
//		}
//		
//		
//		
//		
//		try {
//			Cliente cliente2 = new Cliente("234234234", "joao@gmail.com", "cliente 2");
//			clienteService.incluir(cliente2);
////			new ClienteService().incluir(cliente2);
//		} catch (CpfInvalidoException e) {
//			System.out.println("[ERROR] - CLIENTE" + e.getMessage());	
//		}
//		
//		
//		
//		
//		try {
//			Cliente cliente3 = new Cliente("345345345","maria@maria.com", "cliente 3");
//			clienteService.incluir(cliente3);
////			new ClienteService().incluir(cliente3);
//		} catch (CpfInvalidoException e) {
//			System.out.println("[ERROR] - CLIENTE" + e.getMessage());	
//		}
//		
//		
//		
//		
//		try {
//			Cliente cliente4 = new Cliente(null,"maria@maria.com", "cliente 3");
//			clienteService.incluir(cliente4);
////			new ClienteService().incluir(cliente4);
//		} catch (CpfInvalidoException e) {
//			System.out.println("Erro!!!");
//		}
		
		
	}
	
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}

}

