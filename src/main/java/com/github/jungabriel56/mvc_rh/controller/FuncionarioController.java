package com.github.jungabriel56.mvc_rh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {

	@GetMapping()
	public String list() {
		return "funcionario/list";
	}
	
	@GetMapping("form")
	public String form() {
		return "funcionario/form";
	}
	
}
