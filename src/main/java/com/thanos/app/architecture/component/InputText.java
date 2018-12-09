package com.thanos.app.architecture.component;

public class InputText extends Componente {
	
//	{tipo:"password", id:3, valor:"", placeholder:"", label: "Digite sua senha"},
	
	
	private final String tipo = "text";
	
	private String placeholder = "";
	
	public InputText(String label, String id, String valor) {
	
		super(id, label, valor);
		
	}

	public String getTipo() {
		return tipo;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	
	
	
}
