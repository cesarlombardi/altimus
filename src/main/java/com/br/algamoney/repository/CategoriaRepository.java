package com.br.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.algamoney.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
		
}
