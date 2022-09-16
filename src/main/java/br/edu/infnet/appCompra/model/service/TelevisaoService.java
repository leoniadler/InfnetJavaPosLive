package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class TelevisaoService {
	private static Map<Integer, Televisao> mapaTelevisao = new HashMap<Integer, Televisao>();

	private static Integer id = 1;
		
		public  void incluir(Televisao televisao) {
			
			televisao.setId(id++);
			
			mapaTelevisao.put(televisao.getId(), televisao);
			
			AppImpressao.relatorio("Inclusao da "+ televisao.getNome() + " realizada com sucesso!", televisao);
		}
		
		public  Collection<Televisao> obterLista(){
			return mapaTelevisao.values();
		}
		
		public  void excluir(Integer id){
			mapaTelevisao.remove(id);
		}
}
