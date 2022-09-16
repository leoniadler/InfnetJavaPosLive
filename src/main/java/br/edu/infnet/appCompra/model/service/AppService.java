package br.edu.infnet.appCompra.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.app.Projeto;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
@ComponentScan
public class AppService {

	@Autowired(required = false)
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibiçao do Projeto" + projeto.getNome() + " realizada com sucesso!", projeto);
	}
	
	public Projeto obterProjeto() {
		return projeto;
	}
	
}
