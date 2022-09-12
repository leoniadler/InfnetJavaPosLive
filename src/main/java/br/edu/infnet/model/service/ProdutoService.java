package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.model.domain.Produto;

public class ProdutoService {
	private static Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();

	private static Integer id = 1;
		
		public  void incluir(Produto produto) {
			
			produto.setId(id++);
			
			mapaProduto.put(produto.getId(), produto);
		}
		
		public  Collection<Produto> obterLista(){
			return mapaProduto.values();
		}
		
		public  void excluir(Integer id){
			mapaProduto.remove(id);
		}
}
