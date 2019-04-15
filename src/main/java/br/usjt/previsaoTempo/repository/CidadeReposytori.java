package br.usjt.previsaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaoTempo.model.Cidade;

public interface CidadeReposytori extends JpaRepository<Cidade,Long> {

}