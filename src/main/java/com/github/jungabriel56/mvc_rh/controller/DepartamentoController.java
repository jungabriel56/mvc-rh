package com.github.jungabriel56.mvc_rh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

	@GetMapping("list")
	public String list() {
		return "departamento/list";
	}
	
	@GetMapping("form")
	public String form() {
		return "departamento/form";
	}
	
}
