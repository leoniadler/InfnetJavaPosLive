package br.edu.infnet.appCompra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.service.ClienteService;

@Controller
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService; 
	
//	= new ClienteService();
	
	//rota
			@GetMapping(value = "/cliente/lista")
			public String telaLista(Model model) {
				
				model.addAttribute("listagem", clienteService.obterLista());
				
				//tela
				return "cliente/lista";
			}
			
//			@GetMapping(value = "/cliente/{id}/excluir")
//			public String exclusao(@PathVariable Integer id) {
//				
//				clienteService.excluir(id);
//				
//				return "redirect:/cliente/lista";
//			}
			
//			@PostMapping(value = "/cliente/incluir")
//			public String inclusao(Cliente cliente) {
//				
//				clienteService.incluir(cliente);
//				
//				//inclusao do usuario
////				System.out.println("[" + usuario.getNome()+ "]");
//				
//				return "redirect:/";
//			}
			
			@GetMapping(value = "/cliente")
			public String telaCadastro() {
				
				clienteService.obterLista();
				
				return "cliente/cadastro";
			}
			
			@PostMapping(value = "/cliente/incluir")
			public String incluir(Cliente cliente) {
				
				clienteService.incluir(cliente);
				
				return "redirect:/cliente/lista";
			}

			@GetMapping(value = "/cliente/{id}/excluir")
			public String excluir(@PathVariable Integer id) {
				
				clienteService.excluir(id);
				
				return "redirect:/cliente/lista";
			}
			
}


