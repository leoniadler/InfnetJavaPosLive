package br.edu.infnet.appCompra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appCompra.model.domain.Produto;
import br.edu.infnet.appCompra.model.service.ProdutoService;

@Controller
public class ProdutoController {

	private ProdutoService produtoService = new ProdutoService();
	
	//rota
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", produtoService.obterLista());
		
		//tela
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		produtoService.excluir(id);
		
		return "redirect:/produto/lista";
	}
	
	@PostMapping(value = "/produto/incluir")
	public String inclusao(Produto produto) {
		
		produtoService.incluir(produto);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/";
	}
}
