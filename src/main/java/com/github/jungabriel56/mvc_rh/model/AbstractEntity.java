package com.github.jungabriel56.mvc_rh.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
}
