package br.usjt.previsaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.previsaoTempo.model.Cidade;
import br.usjt.previsaoTempo.repository.CidadeReposytori;

public class CidadeService {

	@Autowired
	private CidadeReposytori cidadeRepo;
	
	public void save(Cidade cidade) {
		
		cidadeRepo.save(cidade);
		
	}
	
	public List<Cidade>listarCidade(){
		return cidadeRepo.findAll();
	}
	
	public void delete(Cidade cidade) {
		cidadeRepo.delete(cidade);
	}
	
}