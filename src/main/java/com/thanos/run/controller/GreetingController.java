package com.thanos.run.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thanos.app.architecture.component.CheckBox;
import com.thanos.app.architecture.component.Componente;
import com.thanos.app.architecture.component.InputPassword;
import com.thanos.app.architecture.component.InputText;
import com.thanos.app.architecture.component.Option;
import com.thanos.app.architecture.component.Radio;
import com.thanos.app.architecture.component.Select;
import com.thanos.run.Formulario;
import com.thanos.run.Teste;
import com.thanos.run.model.Cliente;

@RestController
@CrossOrigin(origins="*")
public class GreetingController {
	
	@RequestMapping("/greeting")
    public Formulario greeting() {
		
//		List<Componente> formulario = new ArrayList<>();
//		
//		Select select = new Select("04","Selecione alguma coisa");
//		List<Option> options = new ArrayList<>();
//		select.getOptions().add(new Option("1", "A"));
//		select.getOptions().add(new Option("2", "B"));
//		select.getOptions().add(new Option("3", "C"));
//		//select.setOptions(options);
//		
//		
//		
//		Radio radio = new Radio("03","Selecione alguma RADIO");
//		List<Option> options2 = new ArrayList<>();
//		options2.add(new Option("1", "Treta"));
//		options2.add(new Option("2", "Trota"));
//		options2.add(new Option("3", "Truta"));
//		radio.setOptions(options2);
//		
//		formulario.add(new InputText("Digite seu nome","01",""));
//		formulario.add(radio);
//		formulario.add(new InputText("Digite seu telefone","02",""));
//		formulario.add(select);
//		formulario.add(new InputPassword("Digite sua senha","01",""));
//		
//		CheckBox check = new CheckBox("04","Selecione alguma coisa");
//		List<Option> options3 = new ArrayList<>();
//		options3.add(new Option("1", "Thiago"));
//		options3.add(new Option("2", "Isabela"));
//		options3.add(new Option("3", "Tatiane"));
//		check.setOptions(options3);
//		
//		formulario.add(check);
//		
//		Formulario form = new Formulario();
//		form.setFormulario(formulario);
		
		return Teste.fitTransform(Cliente.class);
    }
	
	@PostMapping("/submeter")
	public void submeterFormulario(@RequestBody Formulario formulario) {
		System.out.println(formulario == null);
	}


}
