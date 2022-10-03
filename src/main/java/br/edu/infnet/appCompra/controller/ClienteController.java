package br.edu.infnet.appCompra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.ClienteService;

@Controller
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService; 
	
	
	private String mensagem;
	private String tipo;
//	= new ClienteService();
	
	//rota
			@GetMapping(value = "/cliente/lista")
			public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
				
				model.addAttribute("listagem", clienteService.obterLista(user));
				
				model.addAttribute("mensagem", mensagem);
				model.addAttribute("tipo", tipo);
				
				//tela
				return "cliente/lista";
			}
			
			@GetMapping(value = "/cliente")
			public String telaCadastro() {
				
				clienteService.obterLista();
				
				
				return "cliente/cadastro";
			}
			
			@PostMapping(value = "/cliente/incluir")
			public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
				
				cliente.setUsuario(usuario);
				
				clienteService.incluir(cliente);
				
				mensagem = "Inclusão do Cliente " + cliente.getNome() + " realizada com sucesso!!";
				tipo = "alert-success";
				
				return "redirect:/cliente/lista";
			}

			@GetMapping(value = "/cliente/{id}/excluir")
			public String excluir(@PathVariable Integer id) {
				
				try {
					clienteService.excluir(id);
					
					mensagem = "Exclusão do Cliente " + id + " realizada com sucesso!!";
					tipo = "alert-success";
				} catch ( Exception e) {
					System.out.println("[ERRO]" + e.getMessage());
					mensagem = "Impossivel realizar a exclusão do Cliente " + id + "!!";
					tipo = "alert-danger";

				}
				return "redirect:/cliente/lista";
			}
			
}


