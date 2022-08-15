package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompraController {
	//rota
	@GetMapping(value = "/compra/lista")
	public String telaLista() {
		//tela
		return "compra/lista";
	}
}
