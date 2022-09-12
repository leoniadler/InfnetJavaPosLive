package br.edu.infnet.appCompra.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;

@Controller
public class UsuarioController {

	private UsuarioService usuarioService = new UsuarioService();
	
		//rota
		@GetMapping(value = "/usuario/lista")
		public String telaLista(Model model) {
			

		
			model.addAttribute("listagem", usuarioService.obterLista());
			
			//tela
			return "usuario/lista";
		}
		
		@GetMapping(value = "/usuario")
		public String telaCadastro() {
			return "usuario/cadastro";
		}
		
		@PostMapping(value = "/usuario/incluir")
		public String incluir(Usuario usuario) {
			
			usuarioService.incluir(usuario);
			
			//inclusao do usuario
//			System.out.println("[" + usuario.getNome()+ "]");
			
			return "redirect:/";
		}
		
		@GetMapping (value = "/usuario/{email}/excluir") 
		public String excluir(@PathVariable String email) {
			
			// exclusao pelo email
				usuarioService.excluir(email);
			
			return "redirect:/usuario/lista";
		}
}
