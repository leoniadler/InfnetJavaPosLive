package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.model.domain.Notebook;
import br.edu.infnet.model.test.AppImpressao;

public class NotebookService {
	private static Map<Integer, Notebook> mapaNotebook = new HashMap<Integer, Notebook>();

	private static Integer id = 1;
		
		public  void incluir(Notebook notebook) {
			
			notebook.setId(id++);
			
			mapaNotebook.put(notebook.getId(), notebook);
			
			AppImpressao.relatorio("Inclusao do Notebook " + notebook.getNome() + " realizada com sucesso!",notebook);
		}
		
		public  Collection<Notebook> obterLista(){
			return mapaNotebook.values();
		}
		
		public  void excluir(Integer id){
			mapaNotebook.remove(id);
		}
}
