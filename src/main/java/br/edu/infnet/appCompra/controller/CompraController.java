package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.service.CompraService;

@Controller
public class CompraController {

	private CompraService compraService = new CompraService();
	
	//rota
	@GetMapping(value = "/compra/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", compraService.obterLista());
		
		//tela
		return "compra/lista";
	}
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		compraService.excluir(id);
		
		return "redirect:/compra/lista";
	}
	
	@PostMapping(value = "/compra/incluir")
	public String inclusao(Compra compra) {
		
		compraService.incluir(compra);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/";
	}
}
