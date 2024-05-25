package com.github.jungabriel56.mvc_rh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jungabriel56.mvc_rh.controller.dto.FormDepartamento;
import com.github.jungabriel56.mvc_rh.model.Departamento;
import com.github.jungabriel56.mvc_rh.repository.DepartamentoRepository;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

	@Autowired
	public DepartamentoRepository departamentoRepository;
	
	@GetMapping()
	public String list(Model model) {
		List<Departamento> departamentos = departamentoRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
		model.addAttribute("departamentos", departamentos);
		return "departamento/list";
	}
	

	@GetMapping("add")
	public String create(Model model) {
		model.addAttribute("departamento",  new FormDepartamento());	
		return "departamento/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormDepartamento departamento) {
		
		Departamento entity = departamento.toModel();
		
		departamentoRepository.save(entity);
		return "redirect:/departamentos";
	}
	
	
	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Departamento entity = departamentoRepository.findById(id).orElse(new Departamento());
		
		FormDepartamento departamento = new FormDepartamento().toForm(entity);

		model.addAttribute("departamento",  departamento);
		return "departamento/form";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		departamentoRepository.deleteById(id);				
		return "redirect:/funcionarios";
	}
	
	@GetMapping("cargos")
	public String cargosByDepartamento() {
		return "departamento/list_cargos";
	}
	
	
	
}
