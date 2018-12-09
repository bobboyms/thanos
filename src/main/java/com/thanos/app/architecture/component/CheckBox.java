package com.thanos.app.architecture.component;

import java.util.ArrayList;
import java.util.List;

public class CheckBox extends Select implements MultipleOptions {	

	private final String tipo = "checkbox";
	
	private List<Option> valores = new ArrayList<>();

	public CheckBox(String id, String label) {
		super(id, label);
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}

	public List<Option> getValores() {
		return valores;
	}

	public void setValores(List<Option> valores) {
		this.valores = valores;
	}




}
