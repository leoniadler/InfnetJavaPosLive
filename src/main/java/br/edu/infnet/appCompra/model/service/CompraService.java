package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Compra;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class CompraService {
	private static Map<Integer, Compra> mapaCompra = new HashMap<Integer, Compra>();

	private static Integer id = 1;
		
		public  void incluir(Compra compra) {
			
			compra.setId(id++);
			
			mapaCompra.put(compra.getId(), compra);
			
			AppImpressao.relatorio("Inclusao do Aparelho " + compra.getDescricao() + "realizada com sucesso!", compra);
			
		}
		
		public  Collection<Compra> obterLista(){
			return mapaCompra.values();
		}
		
		public void excluir(Integer id){
			mapaCompra.remove(id);
		}
}
