package com.thanos.app.architecture.component;

public class InputPassword extends Componente {

	private final String tipo = "password";

	private String placeholder = "";

	public InputPassword(String label, String id, String valor) {

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
