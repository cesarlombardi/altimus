package com.br.altimus.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.altimus.model.Carro;
import com.br.altimus.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;
	
	public Carro atualizar(int id, Carro carro) {
		Carro carroSalvo = carroRepository.findOne(id);
		LocalDateTime dtCadastro = carroSalvo.getDtCadastro();
		BeanUtils.copyProperties(carro, carroSalvo, "id");
		carroSalvo.setDtCadastro(dtCadastro);
		return carroRepository.save(carroSalvo);
	}
	
	public boolean isCarroSalvo(Carro carro) {
		Carro salvo = carroRepository.findByRenavam(carro.getRenavam());
		if (salvo != null) {
			return true;
		}
		salvo = carroRepository.findByRenavam(carro.getRenavam());
		if (salvo != null) {
			return true;
		}
		return false;
	}
}
