package com.thanos.run;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.UUID;

import com.google.gson.Gson;
import com.thanos.app.architecture.annotations.Component;
import com.thanos.app.architecture.annotations.HtmlForm;
import com.thanos.app.architecture.component.InputPassword;
import com.thanos.app.architecture.component.InputText;
import com.thanos.run.model.Cliente;

public class Teste {
	
	public static Formulario fitTransform(Class classe) {
		
		HtmlForm htmlForm = (HtmlForm) classe.getAnnotation(HtmlForm.class);
		
		if (htmlForm == null) {
			return null;
		}
		
		Formulario formulario = new Formulario();
		formulario.setFormulario(new ArrayList<>());
		
		for (Field fild : classe.getDeclaredFields()) {
			
			Component component = fild.getAnnotation(Component.class);
			
			if (component == null) {
				continue;
			}
			
			String id = UUID.randomUUID().toString();
			
			if (component.type().equals("text")) {
				
				System.out.println(component.type());
				
				InputText inputText = new InputText(component.label(), id, component.defaultValue());
				formulario.getFormulario().add(inputText);
			}
			
			if (component.type().equals("password")) {
				
				System.out.println(component.type());
				
				InputPassword password = new InputPassword(component.label(), id, component.defaultValue());
				formulario.getFormulario().add(password);
			}
			
		}
		return formulario;
	}
	
	public static void main(String[] args) {
		
		
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(fitTransform(Cliente.class)));
		
//		for (AnnotatedType anotation : classe.getAnnotatedInterfaces()) {
//			System.out.println(anotation.getType());
//		}

//		List<Componente> formulario = new ArrayList<>();
//		
//		Select select = new Select("Selecione alguma coisa","01");
//		List<Option> options = new ArrayList<>();
//		options.add(new Option("1", "A"));
//		options.add(new Option("2", "B"));
//		options.add(new Option("3", "C"));
//		select.setOptions(options);
//		
//		formulario.add(new InputText("Digite seu nome","01",""));
//		formulario.add(new InputText("Digite seu telefone","02",""));
//		formulario.add(select);
//		
//		Gson gson = new Gson();
//		
//		Formulario form = new Formulario();
//		form.setFormulario(formulario);
//		
//		System.out.println(gson.toJson(form));
		
	}

}
