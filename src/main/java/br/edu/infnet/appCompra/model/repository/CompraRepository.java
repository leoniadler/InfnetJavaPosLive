package br.edu.infnet.appCompra.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appCompra.model.domain.Celular;
import br.edu.infnet.appCompra.model.domain.Compra;

public interface CompraRepository extends CrudRepository<Compra, Integer>{

	@Query("from Compra c where c.usuario.id = :idUsuario")
	Collection<Compra> findAll(Integer idUsuario);
	
}
