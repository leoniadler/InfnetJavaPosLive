package br.edu.infnet.model.test;

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
	
	
}
