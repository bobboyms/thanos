package com.thanos.app.architecture.component;

import java.util.ArrayList;
import java.util.List;

public class Select extends Componente implements MultipleOptions {	
	
	private final String tipo = "select";
	
	private String index = "";
	private String idDetail = "";
	private List<Option> options = new ArrayList<>();
	
	public Select(String id, String label) {
		super(id, label, "");
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void setIndex(String index) {
		this.index = index;
	}

	@Override
	public void setIdDetail(String idDetail) {
		this.idDetail = idDetail;
	}

	@Override
	public String getIndex() {
		return this.index;
	}

	@Override
	public String getIdDetail() {
		return this.idDetail;
	}

	@Override
	public List<Option> getOptions() {
		return this.options;
	}

	@Override
	public void setOptions(List<Option> options) {
		this.options = options;
	}

	


}
