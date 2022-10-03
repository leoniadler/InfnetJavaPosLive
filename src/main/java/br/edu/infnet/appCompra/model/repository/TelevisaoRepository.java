package br.edu.infnet.appCompra.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appCompra.model.domain.Televisao;

public interface TelevisaoRepository extends CrudRepository<Televisao, Integer>{

	@Query("from Televisao c where c.usuario.id = :idUsuario")
	Collection<Televisao> findAll(Integer idUsuario);
	
}
