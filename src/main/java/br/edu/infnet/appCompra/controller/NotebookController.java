package br.edu.infnet.appCompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotebookController {
	//rota
		@GetMapping(value = "/notebook/lista")
		public String telaLista() {
			//tela
			return "notebook/lista";
		}
}
