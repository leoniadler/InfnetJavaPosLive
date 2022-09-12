package br.edu.infnet.appCompra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;

@Component
public class UsuarioTest implements ApplicationRunner{
	
//	@Autowired
//	private UsuarioService usuarioService;
	
	private Usuario usuario;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		
		usuario = new Usuario();
		usuario.setEmail("admin@admin.com");
		usuario.setNome("Administrador");
		usuario.setSenha("123");
		
//		UsuarioService usuarioService = new UsuarioService();
//		usuarioService.incluir(usuario);
		
		new UsuarioService().incluir(usuario);
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "usuario.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					usuario = new Usuario();
					usuario.setEmail(campos[0]);
					usuario.setNome(campos[1]);
					usuario.setSenha(campos[2]);
					
					new UsuarioService().incluir(usuario);
					
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
		
	}
}
