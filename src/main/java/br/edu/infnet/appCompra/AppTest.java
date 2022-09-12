package br.edu.infnet.appCompra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.app.Atributo;
import br.edu.infnet.model.domain.app.Classe;
import br.edu.infnet.model.domain.app.Projeto;
import br.edu.infnet.model.service.AppService;

@Service
@Component
public class AppTest implements ApplicationRunner{
	
	@Autowired
	private AppService appService;
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "app.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Projeto projeto = null;
				List<Classe> classes = null;
				List<Atributo> atributos = null;
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()){
						case "P":
							classes =  new ArrayList<Classe>();
							
							projeto =  new Projeto();
							projeto.setNome(campos[1]);
							projeto.setDescricao(campos[2]);
							projeto.setClasses(classes);
							
							
//							System.out.println("Projeto");
//							System.out.println("Nome: " + campos[1]);
//							System.out.println("Descrição: " + campos[2]);
							break;
						case "C":
							atributos =  new ArrayList<Atributo>();
							
							Classe classe = new Classe();
							classe.setNome(campos[1]);
							classe.setAtributos(atributos);
							
							classes.add(classe);
							
//							System.out.println("Classe");
//							System.out.println("Nome: " + campos[1]);
							break;
						case "A":
							Atributo atributo =  new Atributo(campos[1], campos[2], campos[3]);
							
							atributos.add(atributo);
//							System.out.println("Atributo");
//							System.out.println("Nome: " + campos[1]);
//							System.out.println("Tipo: " + campos[2]);
//							System.out.println("Descrição: " + campos[3]);
							break;
							
						default:
							System.out.println("Opção Inválida!!");
							break;
					}
					
//					System.out.println(">>>>>>" + linha);
//					System.out.println(">>>>>>" + Arrays.toString(campos));
					
					linha = leitura.readLine();
				}
				
				
				appService.incluir(projeto);
				
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
		
//		Atributo modelo =  new Atributo("modelo", "String", "Indicativo do Modelo do aparelho");
//		Atributo valor =  new Atributo("valor", "Double", "Indicativo de Preço");
//		Atributo carregador =  new Atributo("carregador", "boolean", "Indicativo se tem carregador");
		
//		
//		atributos.add(marca);
//		atributos.add(modelo);
//		atributos.add(valor);
//		atributos.add(carregador);
		
//		classes.add(celular);
//		classes.add(notebook);
//		classes.add(televisao);
//		classes.add(compra);
//		classes.add(produto);
//		classes.add(cliente);
//		classes.add(usuario);
		
		
		
//		Classe notebook = new Classe();
//		notebook.setNome("Notebook");
//		notebook.setAtributos(
//				Arrays.asList(
//						new Atributo("marca", "String", "Indicativo da marca"),
//						new Atributo("informacoes", "String", "Indicativo de Informações"),
//						new Atributo("valor", "Double", "Indicativo de Preço"),
//						new Atributo("placaDeVideo", "boolean", "Indicativo se tem placa de video")
//						)
//				);
//		
//		Classe televisao = new Classe();
//		televisao.setNome("Televisao");
//		televisao.setAtributos(
//				Arrays.asList(
//						new Atributo("marca", "String", "Indicativo da marca"),
//						new Atributo("tamanho", "Double", "Indicativo do tamanho"),
//						new Atributo("valor", "Double", "Indicativo de Preço"),
//						new Atributo("definiçao", "boolean", "Indicativo da definiçao")
//						)
//				);
//		
//		Classe compra = new Classe();
//		compra.setNome("Compra");
//		compra.setAtributos(
//				Arrays.asList(
//						new Atributo("id", "Integer", "Indicativo do ID"),
//						new Atributo("descricao", "String", "Indicativo de descricao"),
//						new Atributo("data", "LocalDateTime", "Indicativo da data"),
//						new Atributo("web", "boolean", "Indicativo")
//						)
//				);
//		
//		Classe produto = new Classe();
//		produto.setNome("Produto");
//		produto.setAtributos(
//				Arrays.asList(
//						new Atributo("id", "Integer", "Indicativo do ID"),
//						new Atributo("nome", "String", "Indicativo do nome"),
//						new Atributo("preço", "Double", "Indicativo de Preço"),
//						new Atributo("codigo", "Integer", "Indicativo de código")
//						)
//				);
//		
//		Classe cliente = new Classe();
//		cliente.setNome("Cliente");
//		cliente.setAtributos(
//				Arrays.asList(
//						new Atributo("id", "Integer", "Indicativo do ID"),
//						new Atributo("nome", "String", "Indicativo do nome"),
//						new Atributo("cpf", "String", "Indicativo do cpf"),
//						new Atributo("email", "String", "Indicativo do email")
//						)
//				);
//		
//		Classe usuario = new Classe();
//		usuario.setNome("Usuario");
//		usuario.setAtributos(
//				Arrays.asList(
//						new Atributo("nome", "String", "Indicativo do nome"),
//						new Atributo("email", "String", "Indicativo do email"),
//						new Atributo("senha", "String", "Indicativo da senha")
//						)
//				);
//		
		
		
		
		
		
//		for(Classe c : projeto.getClasses()) {
//			System.out.println("- - - " + c.getNome() + " || " + c.getAtributos().size());
//		}
		
//		System.out.println(projeto.getClasses().size());
	}
}
