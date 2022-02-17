package com.br.TabernaDtodos.TabernaDtodos.models;

import java.io.Serializable;

//model do usuario

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;



@Entity
//Criando o model que enviará os valores ao BD
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long idUsuario;
	
	@NotEmpty
	private String nomeUsuario;
	
	@NotEmpty
	private String senhaUsuario;
	
	@NotEmpty
	private String emailUsuario;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	

}
