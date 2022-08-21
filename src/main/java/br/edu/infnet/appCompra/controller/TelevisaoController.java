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

//import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Televisao;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class TelevisaoController {
	
//private static List<Televisao> televisoes = new ArrayList<Televisao>();

private static Map<Integer, Televisao> mapaTelevisao = new HashMap<Integer, Televisao>();

private static Integer id = 1;
	
	public static void incluir(Televisao televisao) {
//		televisoes.add(televisao);
		
		televisao.setId(id++);
		
		mapaTelevisao.put(televisao.getId(), televisao);
		
		AppImpressao.relatorio("Inclusao da TV "+ televisao.getNome() + "realizada com sucesso!", televisao);
	}
	
	public static Collection<Televisao> obterLista(){
		return mapaTelevisao.values();
	}
	
	public static void excluir(Integer id){
		mapaTelevisao.remove(id);
	}
	
	//rota
			@GetMapping(value = "/televisao/lista")
			public String telaLista(Model model) {
				
				model.addAttribute("listagem", obterLista());
				
				//tela
				return "televisao/lista";
			}
			
			@GetMapping(value = "/televisao/{id}/excluir")
			public String exclusao(@PathVariable Integer id) {
				
				excluir(id);
				
				return "redirect:/televisao/lista";
			}
}
