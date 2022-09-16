package br.edu.infnet.appCompra.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appCompra.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
