package br.edu.infnet.appCompra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.service.TelevisaoService;

@Controller
public class TelevisaoController {

	private TelevisaoService televisaoService = new TelevisaoService();
	
	//rota
			@GetMapping(value = "/televisao/lista")
			public String telaLista(Model model) {
				
				model.addAttribute("listagem", televisaoService.obterLista());
				
				//tela
				return "televisao/lista";
			}
			
			@GetMapping(value = "/televisao/{id}/excluir")
			public String excluir(@PathVariable Integer id) {
				
				televisaoService.excluir(id);
				
				return "redirect:/televisao/lista";
			}
			@PostMapping(value = "/televisao/incluir")
			public String incluir(Televisao televisao) {
				
				televisaoService.incluir(televisao);
				
				//inclusao do usuario
//				System.out.println("[" + usuario.getNome()+ "]");
				
				return "redirect:/televisao/lista";
			}
			
			@GetMapping(value = "/televisao")
			public String telaCadastro() {
				
				televisaoService.obterLista();
				
				return "televisao/cadastro";
			}
}
