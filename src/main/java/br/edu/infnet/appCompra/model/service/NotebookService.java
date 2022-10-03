package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Notebook;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.NotebookRepository;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class NotebookService {
	
	@Autowired
	private NotebookRepository notebookRepository;
	
//	private static Map<Integer, Notebook> mapaNotebook = new HashMap<Integer, Notebook>();
//
//	private static Integer id = 1;
		
		public  void incluir(Notebook notebook) {
			
			notebookRepository.save(notebook);
			
//			notebook.setId(id++);
//			mapaNotebook.put(notebook.getId(), notebook);
			
			AppImpressao.relatorio("Inclusao do Notebook " + notebook.getNome() + " realizada com sucesso!",notebook);
		}
		
		public  Collection<Notebook> obterLista(){
			return (Collection<Notebook>) notebookRepository.findAll();
//			return mapaNotebook.values();
		}
		
		public  Collection<Notebook> obterLista(Usuario usuario){
			return (Collection<Notebook>) notebookRepository.findAll(usuario.getId());

		}
		
		public  void excluir(Integer id){
			
			notebookRepository.deleteById(id);
			
//			mapaNotebook.remove(id);
		}
}
