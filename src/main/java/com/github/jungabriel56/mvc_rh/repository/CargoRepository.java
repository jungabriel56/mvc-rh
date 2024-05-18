package com.github.jungabriel56.mvc_rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.jungabriel56.mvc_rh.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

}
