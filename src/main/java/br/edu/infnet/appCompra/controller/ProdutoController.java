package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
	//rota
	@GetMapping(value = "/produto/lista")
	public String telaLista() {
		//tela
		return "produto/lista";
	}
}
