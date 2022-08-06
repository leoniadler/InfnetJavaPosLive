package br.edu.infnet.model.test;



import br.edu.infnet.model.domain.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Produto 1";
		produto1.valor = 500.0;
		produto1.codigo = 10;
		System.out.println(produto1.toString());
		
		Produto produto2 = new Produto();
		produto2.nome = "Produto 2";
		produto2.valor = 800.0;
		produto2.codigo = 11;
		System.out.println(produto2.toString());
		
		Produto Produto3 = new Produto();
		Produto3.nome = "Produto 3";
		Produto3.valor = 1000.0;
		Produto3.codigo = 12;
		System.out.println(Produto3.toString());
	}

}
