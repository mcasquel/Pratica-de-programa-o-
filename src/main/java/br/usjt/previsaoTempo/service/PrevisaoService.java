	package br.usjt.previsaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaoTempo.model.Tempo;
import br.usjt.previsaoTempo.repository.previsaoRepository;

//Classe resposavel por realizar a interacao com o banco
@Service
public class PrevisaoService {

	// Injecao de dependencia
		@Autowired
		private previsaoRepository previsaoRepo;

		public void salvar(Tempo tempo) {
			previsaoRepo.save(tempo);
		}

		public List<Tempo> listarTodos() {
			// Retorna uma lista de Tempos
			return previsaoRepo.findAll();
		}	

}