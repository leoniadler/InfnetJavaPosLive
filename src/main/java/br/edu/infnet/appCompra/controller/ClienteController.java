package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	//rota
			@GetMapping(value = "/cliente/lista")
			public String telaLista() {
				//tela
				return "cliente/lista";
			}
}
