package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.model.domain.Televisao;
import br.edu.infnet.model.test.AppImpressao;

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
