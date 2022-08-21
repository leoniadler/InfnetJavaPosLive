package br.edu.infnet.appCompra.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Celular;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class CelularController { 
	
	private static Map<Integer, Celular> mapaCelular = new HashMap<Integer, Celular>();
	
	private static Integer id = 1;
	
	public static void incluir(Celular celular) {
		
		celular.setId(id++);
		
		mapaCelular.put(celular.getId(), celular);
		
		AppImpressao.relatorio("Inclusao do Aparelho " + celular.getNome() + "realizada com sucesso!", celular);
	}

	public static Collection<Celular> obterLista(){
		return mapaCelular.values();
	}
	
	public static void excluir(Integer id){
		mapaCelular.remove(id);
	}
	
	//rota
	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model) {
		
	
		model.addAttribute("listagem", obterLista());
		
		//tela
		return "celular/lista";
	}
	
	@GetMapping(value = "/celular/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/celular/lista";
	}
}
