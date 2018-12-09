package com.thanos.run.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.thanos.app.architecture.component.Componente;
import com.thanos.app.architecture.component.InputText;
import com.thanos.app.architecture.component.Option;
import com.thanos.app.architecture.component.Select;
import com.thanos.run.Formulario;

@RestController
@CrossOrigin(origins="*")
public class GreetingController {
	
	@RequestMapping("/greeting")
    public Formulario greeting() {
		
		List<Componente> formulario = new ArrayList<>();
		
		Select select = new Select("01","Selecione alguma coisa");
		List<Option> options = new ArrayList<>();
		options.add(new Option("1", "A"));
		options.add(new Option("2", "B"));
		options.add(new Option("3", "C"));
		select.setOptions(options);
		
		formulario.add(new InputText("Digite seu nome","01",""));
		formulario.add(new InputText("Digite seu telefone","02",""));
		formulario.add(select);
		
		Formulario form = new Formulario();
		form.setFormulario(formulario);
		
		return form;
    }

}
