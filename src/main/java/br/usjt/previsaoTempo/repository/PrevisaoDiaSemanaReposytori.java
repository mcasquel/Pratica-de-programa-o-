package br.usjt.previsaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.previsaoTempo.model.PrevisaoDiaSemana;

@Repository
public interface PrevisaoDiaSemanaReposytori extends JpaRepository<PrevisaoDiaSemana, Long> {

}