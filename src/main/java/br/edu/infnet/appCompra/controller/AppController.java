package br.edu.infnet.appCompra.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.domain.app.Projeto;
import br.edu.infnet.model.service.AppService;
import br.edu.infnet.model.service.UsuarioService;
import br.edu.infnet.model.test.AppImpressao;

@SessionAttributes("user")
@Controller
@Component
public class AppController {
	
	
//	@Autowired
//	private UsuarioService usuarioService;
	
	@Autowired
	private AppService appService;
	
	
	@GetMapping(value = "/")
	public String telaHome(Model model) {
		
		model.addAttribute("projeto", appService.obterProjeto());
		
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
//		System.out.println("[email" + email + "] ");
//		System.out.println("[senha" + senha + "] ");
		
		// Outra forma
//		UsuarioService usuarioService = new UsuarioService();
//		Usuario usuario = usuarioService.validar(email, senha);
		
		Usuario usuario = new UsuarioService().validar(email, senha);
		
		if(usuario != null) {
			
			String nome = "Admin";
			
			model.addAttribute("user", usuario);
			
			return "home";
//			return "redirect:/";
		}
		
		return "login";
//		return "redirect:/login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
//		model.addAttribute("user", "");
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}
}
