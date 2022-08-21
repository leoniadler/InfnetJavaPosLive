package br.edu.infnet.appCompra.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Produto;

@Controller
public class ProdutoController {

private static Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();

private static Integer id = 1;
	
	public static void incluir(Produto produto) {
		
		produto.setId(id++);
		
		mapaProduto.put(produto.getId(), produto);
	}
	
	public static Collection<Produto> obterLista(){
		return mapaProduto.values();
	}
	
	public static void excluir(Integer id){
		mapaProduto.remove(id);
	}
	
	//rota
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		//tela
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/produto/lista";
	}
}
