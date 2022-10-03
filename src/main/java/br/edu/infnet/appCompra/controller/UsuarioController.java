package br.edu.infnet.appCompra.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.UsuarioService;

@Controller
public class UsuarioController {

//	private UsuarioService usuarioService = new UsuarioService();
	
	@Autowired
	private UsuarioService usuarioService;
	
	private String mensagem;
	private String tipo;
	
		//rota
		@GetMapping(value = "/usuario/lista")
		public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
			

		
			model.addAttribute("listagem", usuarioService.obterLista());
			
			model.addAttribute("mensagem", mensagem);
			model.addAttribute("tipo", tipo);
			
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
			
			mensagem = "Inclusão do Usuario " + usuario.getNome() + " realizada com sucesso!!";
			tipo = "alert-success";
			
			//inclusao do usuario
//			System.out.println("[" + usuario.getNome()+ "]");
			
			return "redirect:/";
		}
		
		@GetMapping (value = "/usuario/{email}/excluir") 
		public String excluir(@PathVariable String email) {
			
			// exclusao pelo email
				
				
				try {
					usuarioService.excluir(email);
					
					mensagem = "Exclusão do Cliente " + email + " realizada com sucesso!!";
					tipo = "alert-success";
				} catch ( Exception e) {
					System.out.println("[ERRO]" + e.getMessage());
					mensagem = "Impossivel realizar a exclusão do Cliente " + email + "!!";
					tipo = "alert-danger";

				}
			
			return "redirect:/usuario/lista";
		}
}
