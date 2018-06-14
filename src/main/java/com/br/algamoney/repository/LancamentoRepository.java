package com.br.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.algamoney.model.Lancamento;
import com.br.algamoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	
}
