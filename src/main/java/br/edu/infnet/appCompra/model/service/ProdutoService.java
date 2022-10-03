package br.edu.infnet.appCompra.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Produto;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
//	@Autowired
//	private CelularService celularService;
//	@Autowired
//	private NotebookService notebookService;
//	@Autowired
//	private TelevisaoService televisaoService;
	
//	public List<Produto> obterLista(){
//		
//		List<Produto> produtos = new ArrayList<Produto>();
//		
//		produtos.addAll(celularService.obterLista());
//		produtos.addAll(televisaoService.obterLista());
//		produtos.addAll(notebookService.obterLista());
//
//		
//		return produtos;
//	}
	
	public List<Produto> obterLista(){
		
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public List<Produto> obterLista(Usuario usuario){

		
		return (List<Produto>) produtoRepository.findAll(usuario.getId());
	}
		
	public  void excluir(Integer id){
			
		produtoRepository.deleteById(id);
	}
}
