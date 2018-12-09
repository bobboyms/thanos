package com.thanos.app.architecture.component;

import java.util.UUID;

public class Componente {
	
	private String id = "";
	
	private String valor = "";
	
	private String label = "";

	public Componente(String id, String label, String valor) {
		this.id = UUID.randomUUID() + "-" + id;
		this.label = label;
		this.valor = valor;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
