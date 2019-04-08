package br.usjt.previsaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaoTempo.model.Tempo;

public interface previsaoRepository extends JpaRepository<Tempo, Long>{

}
