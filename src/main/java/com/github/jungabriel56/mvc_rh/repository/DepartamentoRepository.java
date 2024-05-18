package com.github.jungabriel56.mvc_rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.jungabriel56.mvc_rh.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
