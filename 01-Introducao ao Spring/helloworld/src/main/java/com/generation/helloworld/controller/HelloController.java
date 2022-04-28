package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() { 
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento e Persistência";                                                   
	}
	
	@GetMapping("/objetivos")
	public String objetivos() { 
		return "Revisar MySQL, avançar no PI e praticar o SpringBoot";
	}
}
