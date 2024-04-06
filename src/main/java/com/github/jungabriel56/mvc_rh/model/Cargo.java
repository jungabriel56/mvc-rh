package com.github.jungabriel56.mvc_rh.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo extends AbstractEntity<Long>{
	
	
	@Column(nullable = false, length = 50, unique = true)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
