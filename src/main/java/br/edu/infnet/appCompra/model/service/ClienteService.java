package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Cliente;
import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.repository.ClienteRepository;
import br.edu.infnet.appCompra.model.test.AppImpressao;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
//	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
//
//	private static Integer id = 1;
		
		public  void incluir(Cliente cliente) {
			
			clienteRepository.save(cliente);
			
//			cliente.setId(id++);
//			mapaCliente.put(cliente.getId(), cliente);
			
			AppImpressao.relatorio("Inclusão do cliente " + cliente.getNome()+ " realizada com sucesso!", cliente);
		}
		
		public  Collection<Cliente> obterLista(){
			return (Collection<Cliente>) clienteRepository.findAll();
//			return mapaCliente.values();
		}
		
		public  void excluir(Integer id){
			clienteRepository.deleteById(id);
			
//			mapaCliente.remove(id);
		}
		
		public  Collection<Cliente> obterLista(Usuario usuario){
			return clienteRepository.obterLista(usuario.getId());
		}
}
