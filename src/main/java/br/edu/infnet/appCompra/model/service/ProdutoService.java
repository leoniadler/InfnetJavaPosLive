package br.edu.infnet.appCompra.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Produto;

@Service
public class ProdutoService {
	
	@Autowired
	private CelularService celularService;
	@Autowired
	private NotebookService notebookService;
	@Autowired
	private TelevisaoService televisaoService;
	
	public List<Produto> obterLista(){
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.addAll(celularService.obterLista());
		produtos.addAll(televisaoService.obterLista());
		produtos.addAll(notebookService.obterLista());

		
		return produtos;
	}
	
	
	private static Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();
//
	private static Integer id = 1;
		
		public  void incluir(Produto produto) {
			
			produto.setId(id++);
			
			mapaProduto.put(produto.getId(), produto);
		}
		
//		public  Collection<Produto> obterLista(){
//			return mapaProduto.values();
//		}
		
		public  void excluir(Integer id){
			mapaProduto.remove(id);
		}
}
