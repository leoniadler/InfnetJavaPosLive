package br.edu.infnet.appCompra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.service.TelevisaoService;

@Controller
public class TelevisaoController {

//	private TelevisaoService televisaoService = new TelevisaoService();
	
	@Autowired
	private TelevisaoService televisaoService;
	
	private String mensagem;
	private String tipo;
	
	//rota
			@GetMapping(value = "/televisao/lista")
			public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
				
				model.addAttribute("listagem", televisaoService.obterLista(usuario));
				
				model.addAttribute("mensagem", mensagem);
				model.addAttribute("tipo", tipo);
				
				//tela
				return "televisao/lista";
			}
			
			@GetMapping(value = "/televisao/{id}/excluir")
			public String excluir(@PathVariable Integer id) {
				
				
				
				try {
					televisaoService.excluir(id);
					
					mensagem = "Exclusão da Televisão " + id + " realizada com sucesso!!";
					tipo = "alert-success";
				} catch ( Exception e) {
					System.out.println("[ERRO]" + e.getMessage());
					mensagem = "Impossivel realizar a exclusão da Televisão " + id + "!!";
					tipo = "alert-danger";

				}
				
				return "redirect:/televisao/lista";
			}
			@PostMapping(value = "/televisao/incluir")
			public String incluir(Televisao televisao,  @SessionAttribute("user") Usuario usuario) {
				
				televisao.setUsuario(usuario);
				
				televisaoService.incluir(televisao);
				
				mensagem = "Inclusão da Televisão " + televisao.getNome() + " realizada com sucesso!!";
				tipo = "alert-success";
				
				//inclusao do usuario
//				System.out.println("[" + usuario.getNome()+ "]");
				
				return "redirect:/televisao/lista";
			}
			
			@GetMapping(value = "/televisao")
			public String telaCadastro() {
				
				televisaoService.obterLista();
				
				return "televisao/cadastro";
			}
}
