package br.edu.infnet.appCompra.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Celular;
import br.edu.infnet.model.service.CelularService;

@Controller
public class CelularController { 
	
	private CelularService celularService = new CelularService();
	
	//rota
	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model) {
		
	
		model.addAttribute("listagem", celularService.obterLista());
		
		//tela
		return "celular/lista";
	}
	
	@GetMapping(value = "/celular/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		celularService.excluir(id);
		
		return "redirect:/celular/lista";
	}
	
	@PostMapping(value = "/celular/incluir")
	public String inclusao(Celular celular) {
		
		celularService.incluir(celular);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/";
	}
}
