package br.edu.infnet.appCompra.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appCompra.model.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	@Query("from Produto c where c.usuario.id = :idUsuario")
	Collection<Produto> findAll(Integer idUsuario);
	
}
