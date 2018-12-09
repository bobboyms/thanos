package com.thanos.run;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.thanos.app.architecture.component.Componente;
import com.thanos.app.architecture.component.InputText;
import com.thanos.app.architecture.component.Option;
import com.thanos.app.architecture.component.Select;

public class Teste {
	
	public static void main(String[] args) {

		List<Componente> formulario = new ArrayList<>();
		
		Select select = new Select("Selecione alguma coisa","01");
		List<Option> options = new ArrayList<>();
		options.add(new Option("1", "A"));
		options.add(new Option("2", "B"));
		options.add(new Option("3", "C"));
		select.setOptions(options);
		
		formulario.add(new InputText("Digite seu nome","01",""));
		formulario.add(new InputText("Digite seu telefone","02",""));
		formulario.add(select);
		
		Gson gson = new Gson();
		
		Formulario form = new Formulario();
		form.setFormulario(formulario);
		
		System.out.println(gson.toJson(form));
		
	}

}
