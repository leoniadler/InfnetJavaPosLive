package br.edu.infnet.appCompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appCompra.model.domain.Compra;
import br.edu.infnet.appCompra.model.service.ClienteService;
import br.edu.infnet.appCompra.model.service.CompraService;
import br.edu.infnet.appCompra.model.service.ProdutoService;

@Controller
public class CompraController {

//	private CompraService compraService = new CompraService();
	
	@Autowired
	private CompraService compraService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ProdutoService produtoService;
	
	//rota
	@GetMapping(value = "/compra")
	public String telaCadastro(Model model) {
		
		model.addAttribute("cliente", clienteService.obterLista());
		model.addAttribute("produtos", produtoService.obterLista());
		
		//tela
		return "compra/cadastro";
	}
	
	@GetMapping(value = "/compra/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", compraService.obterLista());
		
		//tela
		return "compra/lista";
	}
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		compraService.excluir(id);
		
		return "redirect:/compra/lista";
	}
	
	@PostMapping(value = "/compra/incluir")
	public String incluir() {
		
//		compraService.incluir(compra);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/compra/lista";
	}
}
