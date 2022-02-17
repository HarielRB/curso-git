package com.br.TabernaDtodos.TabernaDtodos.repositorys;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.br.TabernaDtodos.TabernaDtodos.models.Mesa;

public interface MesaRepository extends CrudRepository<Mesa, Long> {

	Mesa findByIdMesa(long idMesa);
	
	List<Mesa> findByNomeMesa(String nomeMesa);
	

	// Query para a busca
	@Query(value = "select u from Mesa u where u.nome like %?1%")
	List<Mesa> findByNomesMesa(String nomeMesa);
}
