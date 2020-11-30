package com.br.altimus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.altimus.model.Modelo;
import com.br.altimus.repository.ModeloRepository;

@RestController
@RequestMapping("/modelo")
@CrossOrigin
public class ModeloResource {

	@Autowired
	private ModeloRepository modeloRepository;
	
	@GetMapping
	public ResponseEntity<List<Modelo>> getAll() {
		return ResponseEntity.ok(modeloRepository.findAll());
	}
	
}
