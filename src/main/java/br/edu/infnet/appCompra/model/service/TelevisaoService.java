package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Televisao;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.TelevisaoRepository;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class TelevisaoService {
	
	@Autowired
	private TelevisaoRepository televisaoRepository;
	
//	private static Map<Integer, Televisao> mapaTelevisao = new HashMap<Integer, Televisao>();
//
//	private static Integer id = 1;
		
		public  void incluir(Televisao televisao) {
			
			televisaoRepository.save(televisao);
			
//			televisao.setId(id++);
//			mapaTelevisao.put(televisao.getId(), televisao);
			
			AppImpressao.relatorio("Inclusao da "+ televisao.getNome() + " realizada com sucesso!", televisao);
		}
		
		public  Collection<Televisao> obterLista(){
			
			return (Collection<Televisao>) televisaoRepository.findAll();
			
//			return mapaTelevisao.values();
		}
		
		public  Collection<Televisao> obterLista(Usuario usuario){
			
			return (Collection<Televisao>) televisaoRepository.findAll(usuario.getId());

		}
		
		public  void excluir(Integer id){
			
			televisaoRepository.deleteById(id);
			
//			mapaTelevisao.remove(id);
		}
}
