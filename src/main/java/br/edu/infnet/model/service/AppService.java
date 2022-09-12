package br.edu.infnet.model.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.app.Projeto;
import br.edu.infnet.model.test.AppImpressao;

@Component
@Service
public class AppService {

	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibiçao do Projeto" + projeto.getNome() + " realizada com sucesso!", projeto);
	}
	
	public Projeto obterProjeto() {
		return projeto;
	}
	
}
