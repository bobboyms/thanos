package com.thanos.run.model;

import com.thanos.app.architecture.annotations.Component;
import com.thanos.app.architecture.annotations.HtmlForm;

@HtmlForm
public class Cliente {

	private String outro;
	
	@Component(type="text", label="Digite seu nome")
	private String nome;
	
	@Component(type="text", label="Digite sua idade")
	private Long idade;
	

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

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

}
