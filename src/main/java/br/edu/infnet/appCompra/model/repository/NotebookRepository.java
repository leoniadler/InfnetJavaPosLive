package br.edu.infnet.appCompra.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.edu.infnet.appCompra.model.domain.Notebook;

public interface NotebookRepository extends CrudRepository<Notebook, Integer>{

	@Query("from Notebook c where c.usuario.id = :idUsuario")
	Collection<Notebook> findAll(Integer idUsuario);
	
}
