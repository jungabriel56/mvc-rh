package com.github.jungabriel56.mvc_rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long>{
	
	
	@Column(nullable = true, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	@Column(name = "nome_funcionario", nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = true, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal salario;

	@ManyToOne
	@JoinColumn(name = "cargo_id_fk", nullable = true)
	private Cargo cargo;
	
	@OneToOne
	@JoinColumn(name = "endereco_id_fk", nullable = true)
	private Endereco endereco;

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
}

