package com.br.altimus.resource;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.altimus.model.Carro;
import com.br.altimus.repository.CarroRepository;
import com.br.altimus.service.CarroService;

@RestController
@RequestMapping("/carro")
@CrossOrigin
public class CarroResource {

	@Autowired
	private CarroRepository carroRepository;
	
	@Autowired
	private CarroService carroService;
	
	@GetMapping
	public ResponseEntity<List<Carro>> getAll() {
		return ResponseEntity.ok(carroRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Carro> getById(@PathVariable int id) {
		return ResponseEntity.ok(carroRepository.findOne(id));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		carroRepository.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<Carro> save(@Valid @RequestBody Carro carro) {
		if (carroService.isCarroSalvo(carro)) {
			return ResponseEntity.badRequest().body(null);
		}
		
		carro.setDtCadastro(LocalDateTime.now());
		Carro carroSalvo = carroRepository.save(carro);
		return ResponseEntity.ok(carroSalvo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Carro> update(@PathVariable int codigo, @Valid @RequestBody Carro carro) {
		Carro carroSalvo = carroService.atualizar(codigo, carro);
		return ResponseEntity.ok(carroSalvo);
	}
}
