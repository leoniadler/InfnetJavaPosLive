package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.model.domain.Compra;
import br.edu.infnet.model.test.AppImpressao;

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
		
		public  void excluir(Integer id){
			mapaCompra.remove(id);
		}
}
