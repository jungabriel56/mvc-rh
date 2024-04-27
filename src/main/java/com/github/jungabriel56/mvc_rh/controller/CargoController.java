package com.github.jungabriel56.mvc_rh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cargos")
public class CargoController {

	@GetMapping("list")
	public String list() {
		return "cargo/list";
	}
	
	@GetMapping("form")
	public String form() {
		return "cargo/form";
	}
	
}
