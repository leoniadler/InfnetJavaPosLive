package br.edu.infnet.appCompra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.service.ClienteService;

@Controller
public class ClienteController {

	private ClienteService clienteService = new ClienteService();
	
	//rota
			@GetMapping(value = "/cliente/lista")
			public String telaLista(Model model) {
				
				model.addAttribute("listagem", clienteService.obterLista());
				
				//tela
				return "cliente/lista";
			}
			
			@GetMapping(value = "/cliente/{id}/excluir")
			public String exclusao(@PathVariable Integer id) {
				
				clienteService.excluir(id);
				
				return "redirect:/cliente/lista";
			}
			
			@PostMapping(value = "/cliente/incluir")
			public String inclusao(Cliente cliente) {
				
				clienteService.incluir(cliente);
				
				//inclusao do usuario
//				System.out.println("[" + usuario.getNome()+ "]");
				
				return "redirect:/";
			}
}
