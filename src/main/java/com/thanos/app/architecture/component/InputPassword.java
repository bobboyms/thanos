package com.thanos.app.architecture.component;

public class InputPassword extends InputText {
	
	private final String tipo = "password";
	
	public InputPassword(String label, String id, String valor) {
		super(label ,id, valor);
	}

	@Override
	public String getTipo() {
		return tipo;
	}
	
	
	
}
