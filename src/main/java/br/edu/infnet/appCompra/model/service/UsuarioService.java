package br.edu.infnet.appCompra.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appCompra.model.domain.Usuario;
import br.edu.infnet.appCompra.model.test.AppImpressao;

	@Service
	public class UsuarioService {
	
	private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
	
	
	public Usuario validar(String email, String senha) {
		
		Usuario usuario = mapaUsuario.get(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		} 
		return null;
		
	}
	
	public void incluir(Usuario usuario) {
		
		mapaUsuario.put(usuario.getEmail(), usuario);
		
		AppImpressao.relatorio("Inclusao do Usúario " + usuario.getNome() + "realizada com sucesso!", usuario);
	}

	public void excluir(String email) {
		mapaUsuario.remove(email);
	}
	
	public Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
	
}
