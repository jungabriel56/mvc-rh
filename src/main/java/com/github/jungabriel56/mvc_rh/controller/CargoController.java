package com.github.jungabriel56.mvc_rh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jungabriel56.mvc_rh.controller.dto.FormCargo;
import com.github.jungabriel56.mvc_rh.model.Cargo;
import com.github.jungabriel56.mvc_rh.model.Departamento;
import com.github.jungabriel56.mvc_rh.repository.CargoRepository;
import com.github.jungabriel56.mvc_rh.repository.DepartamentoRepository;

@Controller
@RequestMapping("cargos")
public class CargoController {

	@Autowired
	public CargoRepository cargoRepository;
	
	@Autowired
	public DepartamentoRepository departamentoRepository;
	
	@GetMapping()
	public String list(Model model) {
		List<Cargo> cargos = cargoRepository.findAll(Sort.by(Sort.Direction.ASC, "nome" ));
		model.addAttribute("cargos", cargos);
		return "cargo/list";
	}	

	@GetMapping("add")
	public String create(Model model) {
		model.addAttribute("cargo",  new FormCargo());	
		return "cargo/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormCargo cargo) {
		
		Departamento departamento = Optional.ofNullable(cargo.getIdDepartamento()).map(id -> departamentoRepository.getReferenceById(id))
				.orElse(null);
		
		Cargo entity = cargo.toModel(departamento);
		
		cargoRepository.save(entity);
		return "redirect:/cargos";
	}
	
	
	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Cargo entity = cargoRepository.findById(id).orElse(new Cargo());
		
		FormCargo cargo = new FormCargo().toForm(entity);

		model.addAttribute("cargo",  cargo);
		return "cargo/form";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		cargoRepository.deleteById(id);				
		return "redirect:/funcionarios";
	}
	
	
	
	
}
