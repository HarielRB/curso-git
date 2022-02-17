package com.br.TabernaDtodos.TabernaDtodos.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.OneToMany;
import java.util.List;*/

import javax.validation.constraints.NotEmpty;

@Entity
//Criando o model que enviará os valores ao BD
public class Mesa implements Serializable {
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMesa;
	
	@NotEmpty
	private String nomeMesa;
	
	@NotEmpty
	private String descricaoMesa;
	
	@NotEmpty
	private String tipoMesa;
	
	@NotEmpty
	private int qtdJogadores;
	
	//como pegar o id do Jogador que criou?S
	
	@NotEmpty
	private long idCriador;
	
}
