package com.br.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.algamoney.model.Pessoa;
import com.br.algamoney.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
