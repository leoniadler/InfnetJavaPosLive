package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelevisaoController {
	//rota
			@GetMapping(value = "/televisao/lista")
			public String telaLista() {
				//tela
				return "televisao/lista";
			}
}
