package com.thanos.app.architecture.component;

public class Radio extends Select implements MultipleOptions {	

	private final String tipo = "radio";
	
	public Radio(String id, String label) {
		super(id, label);
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}



}
