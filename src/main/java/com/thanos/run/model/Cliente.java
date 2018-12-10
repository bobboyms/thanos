package com.thanos.run.model;

import com.thanos.app.architecture.annotations.Component;
import com.thanos.app.architecture.annotations.HtmlForm;

@HtmlForm
public class Cliente {

	@Component(type="password", label="Digite seu senha")
	private String senha;
	
	@Component(type="text", label="Digite seu nome")
	private String nome;
	
	@Component(type="text", label="Digite sua idade")
	private Long idade;
	
	@Component(type="text", label="Digite sua treta do dia")
	private Long treta;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getTreta() {
		return treta;
	}

	public void setTreta(Long treta) {
		this.treta = treta;
	}

}
