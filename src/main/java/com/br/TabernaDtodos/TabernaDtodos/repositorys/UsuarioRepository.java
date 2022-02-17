package com.br.TabernaDtodos.TabernaDtodos.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.br.TabernaDtodos.TabernaDtodos.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findById(long idUsuario);
	
	List<Usuario> findByNomeUsuario(String nomeUsuario);
	
	@Query(value = "select u from Usuario u where u.nome like %?1%")
	List<Usuario> findByNomeUsuraio(String nomeUsuario);
}
