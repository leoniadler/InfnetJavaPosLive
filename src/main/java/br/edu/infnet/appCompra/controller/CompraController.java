package br.edu.infnet.appCompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Compra;
import br.edu.infnet.appCompra.model.domain.Usuario;
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
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("cliente", clienteService.obterLista(usuario));
		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		//tela
		return "compra/cadastro";
	}
	
	@GetMapping(value = "/compra/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", compraService.obterLista(usuario));
		
		//tela
		return "compra/lista";
	}
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		compraService.excluir(id);
		
		return "redirect:/compra/lista";
	}
	
	@PostMapping(value = "/compra/incluir")
	public String incluir(Compra compra, @SessionAttribute("user") Usuario usuario) {
		
		compra.setUsuario(usuario);
		
		compraService.incluir(compra);
		
//		compraService.incluir(compra);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/compra/lista";
	}
}
