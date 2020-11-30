package com.br.altimus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.altimus.model.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {
	
}
