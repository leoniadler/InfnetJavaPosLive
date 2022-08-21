package br.edu.infnet.appCompra.controller;

import java.util.Collection;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.domain.Notebook;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class NotebookController {
	
//private static List<Notebook> notebooks = new ArrayList<Notebook>();

private static Map<Integer, Notebook> mapaNotebook = new HashMap<Integer, Notebook>();

private static Integer id = 1;
	
	public static void incluir(Notebook notebook) {
//		notebooks.add(notebook);
		
		notebook.setId(id++);
		
		mapaNotebook.put(notebook.getId(), notebook);
		
		AppImpressao.relatorio("Inclusao do Notebook " + notebook.getNome() + " realizada com sucesso!",notebook);
	}
	
	public static Collection<Notebook> obterLista(){
		return mapaNotebook.values();
	}
	
	public static void excluir(Integer id){
		mapaNotebook.remove(id);
	}
	
	//rota
		@GetMapping(value = "/notebook/lista")
		public String telaLista(Model model) {
			
			model.addAttribute("listagem", obterLista());
			
			//tela
			return "notebook/lista";
		}
		
		@GetMapping(value = "/notebook/{id}/excluir")
		public String exclusao(@PathVariable Integer id) {
			
			excluir(id);
			
			return "redirect:/notebook/lista";
		}
}
