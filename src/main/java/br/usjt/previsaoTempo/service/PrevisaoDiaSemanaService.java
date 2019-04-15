package br.usjt.previsaoTempo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaoTempo.model.PrevisaoDiaSemana;
import br.usjt.previsaoTempo.repository.PrevisaoDiaSemanaReposytori;

@Service
public class PrevisaoDiaSemanaService {
	
	@Autowired
	private PrevisaoDiaSemanaReposytori diaRepo;
	
	public List<PrevisaoDiaSemana> listar() {
		System.out.println("Estou buscando todos os dias da semana");
		return diaRepo.findAll();
	}
	

}