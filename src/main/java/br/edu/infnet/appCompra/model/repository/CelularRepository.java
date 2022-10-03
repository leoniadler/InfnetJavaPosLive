package br.edu.infnet.appCompra.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appCompra.model.domain.Celular;

public interface CelularRepository extends CrudRepository<Celular, Integer>{

	@Query("from Celular c where c.usuario.id = :idUsuario")
	Collection<Celular> findAll(Integer idUsuario);
	
}
