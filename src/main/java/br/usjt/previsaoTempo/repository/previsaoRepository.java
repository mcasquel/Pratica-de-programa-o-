package br.usjt.previsaoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.previsaoTempo.model.Tempo;

@Repository
public interface previsaoRepository extends JpaRepository<Tempo, Long>{

}
