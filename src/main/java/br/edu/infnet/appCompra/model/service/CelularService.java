package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.CelularRepository;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class CelularService {
	
	@Autowired
	private CelularRepository celularRepository;
	
	public  void incluir(Celular celular) {
		
		celularRepository.save(celular);
		
		AppImpressao.relatorio("Inclusao do Aparelho " + celular.getNome() + "realizada com sucesso!", celular);
	}

	public Collection<Celular> obterLista(){
		return (Collection<Celular>) celularRepository.findAll();
	}
	
	public Collection<Celular> obterLista(Usuario usuario){
		return (Collection<Celular>) celularRepository.findAll(usuario.getId());
		
	}
	
	public  void excluir(Integer id){
		
		celularRepository.deleteById(id);
	}
}
