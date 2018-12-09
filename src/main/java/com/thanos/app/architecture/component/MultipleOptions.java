package com.thanos.app.architecture.component;

import java.util.List;

public interface MultipleOptions {
//	public String index = "";
//	public String idDetail = "";
//	public List<Option> options = new ArrayList<>();
	
	public void setIndex(String index);
	public void setIdDetail(String idDetail);
	
	public String getIndex();
	public String getIdDetail();
	
	public List<Option> getOptions();
	public void setOptions(List<Option> options);


	
}

//"options":[{"valor":"01","id":"opt1"},{"valor":"02","id":"opt2"}