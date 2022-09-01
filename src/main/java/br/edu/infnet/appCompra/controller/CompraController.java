package br.edu.infnet.appCompra.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Celular;
import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class CompraController {

private static Map<Integer, Compra> mapaCompra = new HashMap<Integer, Compra>();

private static Integer id = 1;
	
	public static void incluir(Compra compra) {
		
		compra.setId(id++);
		
		mapaCompra.put(compra.getId(), compra);
		
		AppImpressao.relatorio("Inclusao do Aparelho " + compra.getDescricao() + "realizada com sucesso!", compra);
		
	}
	
	public static Collection<Compra> obterLista(){
		return mapaCompra.values();
	}
	
	public static void excluir(Integer id){
		mapaCompra.remove(id);
	}
	
	//rota
	@GetMapping(value = "/compra/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		//tela
		return "compra/lista";
	}
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/compra/lista";
	}
	
	@PostMapping(value = "/compra/incluir")
	public String inclusao(Compra compra) {
		
		incluir(compra);
		
		//inclusao do usuario
//		System.out.println("[" + usuario.getNome()+ "]");
		
		return "redirect:/";
	}
}
