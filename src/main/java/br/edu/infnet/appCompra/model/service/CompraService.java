package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Compra;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.CompraRepository;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class CompraService {
	
	@Autowired
	private CompraRepository compraRepository;
	
//	private static Map<Integer, Compra> mapaCompra = new HashMap<Integer, Compra>();
//
//	private static Integer id = 1;
		
		public  void incluir(Compra compra) {
			
			compraRepository.save(compra);
			
//			compra.setId(id++);
//			mapaCompra.put(compra.getId(), compra);
			
			AppImpressao.relatorio("Inclusao do Aparelho " + compra.getDescricao() + "realizada com sucesso!", compra);
			
		}
		
		public  Collection<Compra> obterLista(){
			
			return (Collection<Compra>) compraRepository.findAll();
			
//			return mapaCompra.values();
		}
		
		public  Collection<Compra> obterLista(Usuario usuario){
			
			return (Collection<Compra>) compraRepository.findAll(usuario.getId());
		
		}
		public void excluir(Integer id){
			compraRepository.deleteById(id);
			
//			mapaCompra.remove(id);
		}
}
