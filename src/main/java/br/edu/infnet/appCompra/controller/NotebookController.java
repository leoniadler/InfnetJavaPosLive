package br.edu.infnet.appCompra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appCompra.model.domain.Notebook;
import br.edu.infnet.appCompra.model.service.NotebookService;

@Controller
public class NotebookController {

private NotebookService notebookService = new NotebookService();
	
	//rota
		@GetMapping(value = "/notebook/lista")
		public String telaLista(Model model) {
			
			model.addAttribute("listagem", notebookService.obterLista());
			
			//tela
			return "notebook/lista";
		}
		
		@GetMapping(value = "/notebook/{id}/excluir")
		public String excluir(@PathVariable Integer id) {
			
			notebookService.excluir(id);
			
			return "redirect:/notebook/lista";
		}
		
		@PostMapping(value = "/notebook/incluir")
		public String incluir(Notebook notebook) {
			
			notebookService.incluir(notebook);
			
			//inclusao do usuario
//			System.out.println("[" + usuario.getNome()+ "]");
			
			return "redirect:/notebook/lista";
		}
		
		@GetMapping(value = "/notebook")
		public String telaCadastro() {
			
			notebookService.obterLista();
			
			return "notebook/cadastro";
		}
}
