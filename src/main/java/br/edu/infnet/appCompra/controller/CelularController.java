package br.edu.infnet.appCompra.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.CelularService;

@Controller
public class CelularController { 
	
//	private CelularService celularService = new CelularService();
	
	private String mensagem;
	private String tipo;
	
	@Autowired
	private CelularService celularService;
	
	//rota
	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
	
		model.addAttribute("listagem", celularService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipo", tipo);
		
		//tela
		return "celular/lista";
	}
	
	@PostMapping(value = "/celular/incluir")
	public String incluir(Celular celular, @SessionAttribute("user") Usuario usuario) {
		
		celular.setUsuario(usuario);
		
		celularService.incluir(celular);
		
		mensagem = "Inclusão do Celular " + celular.getNome() + " realizada com sucesso!!";
		tipo = "alert-success";
		
		return "redirect:/celular/lista";
	}

	@GetMapping(value = "/celular/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		
		
		try {
			celularService.excluir(id);
			
			mensagem = "Exclusão do Celular " + id + " realizada com sucesso!!";
			tipo = "alert-success";
		} catch ( Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
			mensagem = "Impossivel realizar a exclusão do Celular " + id + "!!";
			tipo = "alert-danger";

		}
		
		return "redirect:/celular/lista";
	}
	
	@GetMapping(value = "/celular")
	public String telaCadastro() {
		
		celularService.obterLista();
		
		return "celular/cadastro";
	}
	
//	@GetMapping(value = "/celular/{id}/excluir")
//	public String exclusao(@PathVariable Integer id) {
//		
//		celularService.excluir(id);
//		
//		return "redirect:/celular/lista";
//	}
//	
//	@PostMapping(value = "/celular/incluir")
//	public String inclusao(Celular celular) {
//		
//		celularService.incluir(celular);
//		
//		//inclusao do usuario
////		System.out.println("[" + usuario.getNome()+ "]");
//		
//		return "redirect:/celular/lista";
//	}
}
