package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Hello world!!!" + "/nMentalidades:" + "/nOrientação ao Futuro" + "/nResponsabilidade pessoal" + "/nMentalidade de crescimento" + "/nPersistência"
	+ "/nHabilidades:" + "/nTrabalho em equipe" + "/nOrientação ao detalhe" + "/nProatividade" + "/nComunicação"
				+ "/nObjetivos de aprendizagem: quero aprender e entender o ecosistema Spring, Spring Boot e suas funcionalidades.";
		 
	}
}
