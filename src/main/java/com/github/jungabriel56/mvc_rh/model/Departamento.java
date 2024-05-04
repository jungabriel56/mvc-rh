package com.github.jungabriel56.mvc_rh.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento extends AbstractEntity<Long>{
	

	
	@Column(nullable = false, length = 60, unique = true)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
