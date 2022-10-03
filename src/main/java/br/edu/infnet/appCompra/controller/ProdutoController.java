package br.edu.infnet.appCompra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.ProdutoService;

@Controller
public class ProdutoController {

//	private ProdutoService produtoService = new ProdutoService();
	
	@Autowired
	private ProdutoService produtoService;
	
	private String mensagem;
	private String tipo;
	
	//rota
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", produtoService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipo", tipo);
		
		//tela
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		
		
		try {
			produtoService.excluir(id);
			
			mensagem = "Exclusão do Produto " + id + " realizada com sucesso!!";
			tipo = "alert-success";
		} catch ( Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
			mensagem = "Impossivel realizar a exclusão do Produto " + id + "!!";
			tipo = "alert-danger";

		}
		
		return "redirect:/produto/lista";
	}
}
