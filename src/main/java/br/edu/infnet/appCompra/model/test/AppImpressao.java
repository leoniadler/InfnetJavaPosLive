package br.edu.infnet.appCompra.model.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.appCompra.interfaces.IPrinter;
//import br.edu.infnet.model.domain.Produto;

public class AppImpressao {
	
//	private  String mensagem;
	
//	public AppProduto(String mensagem) {
//		this.mensagem = mensagem;
//	}
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		
		printer.impressao();
		
//		produto.impressao();
	}
	
	public static void main(String[] args) {
		String dir = "/Users/leoniadler/ProjTxtInfnet/dois/";
		String arq = "compras.txt";
		
		try{
			try {
				FileReader fileReader = new FileReader(dir+arq);
				
				BufferedReader leitura = new BufferedReader(fileReader);
				
//				Runtime.getRuntime().exec("notepad /Users/leoniadler/ProjTxtInfnet/pedido.rtf");
				
				System.out.println(leitura.readLine());
				System.out.println(leitura.readLine());
				System.out.println(leitura.readLine());
				
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
