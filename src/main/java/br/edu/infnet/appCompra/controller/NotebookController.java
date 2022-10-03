package br.edu.infnet.appCompra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Notebook;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.NotebookService;

@Controller
public class NotebookController {

//private NotebookService notebookService = new NotebookService();
	
	@Autowired
	private NotebookService notebookService;
	
	private String mensagem;
	private String tipo;
	
	//rota
		@GetMapping(value = "/notebook/lista")
		public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
			
			model.addAttribute("listagem", notebookService.obterLista(usuario));
			
			model.addAttribute("mensagem", mensagem);
			model.addAttribute("tipo", tipo);
			
			//tela
			return "notebook/lista";
		}
		
		@GetMapping(value = "/notebook/{id}/excluir")
		public String excluir(@PathVariable Integer id) {
			
			
			
			try {
				notebookService.excluir(id);
				
				mensagem = "Exclusão do Notebook " + id + " realizada com sucesso!!";
				tipo = "alert-success";
			} catch ( Exception e) {
				System.out.println("[ERRO]" + e.getMessage());
				mensagem = "Impossivel realizar a exclusão do Notebook " + id + "!!";
				tipo = "alert-danger";

			}
			
			return "redirect:/notebook/lista";
		}
		
		@PostMapping(value = "/notebook/incluir")
		public String incluir(Notebook notebook,  @SessionAttribute("user") Usuario usuario) {
			
			notebook.setUsuario(usuario);
			
			notebookService.incluir(notebook);
			
			mensagem = "Inclusão do Notebook " + notebook.getNome() + " realizada com sucesso!!";
			tipo = "alert-success";
			
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
