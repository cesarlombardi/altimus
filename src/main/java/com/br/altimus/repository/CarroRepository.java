package com.br.altimus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.altimus.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {
	
	public Carro findByPlaca(String placa);

	public Carro findByRenavam(String renavam);

}
