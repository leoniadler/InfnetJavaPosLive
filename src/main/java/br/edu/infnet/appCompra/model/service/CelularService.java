package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class CelularService {
private static Map<Integer, Celular> mapaCelular = new HashMap<Integer, Celular>();
	
	private static Integer id = 1;
	
	public  void incluir(Celular celular) {
		
		celular.setId(id++);
		
		mapaCelular.put(celular.getId(), celular);
		
		AppImpressao.relatorio("Inclusao do Aparelho " + celular.getNome() + "realizada com sucesso!", celular);
	}

	public Collection<Celular> obterLista(){
		return mapaCelular.values();
	}
	
	public  void excluir(Integer id){
		mapaCelular.remove(id);
	}
}
