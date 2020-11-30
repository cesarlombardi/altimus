package com.br.altimus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.altimus.model.Opcional;
import com.br.altimus.repository.OpcionalRepository;

@RestController
@RequestMapping("/opcional")
@CrossOrigin
public class OpcionalResource {

	@Autowired
	private OpcionalRepository opcionalRepository;
	
	@GetMapping
	public ResponseEntity<List<Opcional>> getAll() {
		return ResponseEntity.ok(opcionalRepository.findAll());
	}
	
}
