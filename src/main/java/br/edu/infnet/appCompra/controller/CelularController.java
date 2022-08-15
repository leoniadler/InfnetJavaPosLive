package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CelularController {

	//rota
	@GetMapping(value = "/celular/lista")
	public String telaLista() {
		//tela
		return "celular/lista";
	}
}
