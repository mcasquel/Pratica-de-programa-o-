package br.usjt.previsaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaoTempo.model.Tempo;
import br.usjt.previsaoTempo.repository.previsaoRepository;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private previsaoRepository prevRepo;
	
	@GetMapping ("/previsaotempo")
	public ModelAndView mostrarPrevisao () {
		//Nome da pagina HTML para renderizao
		ModelAndView mv = new ModelAndView("mostrar_previsao");
		
		//Cria uma lista com os valores coletados do banco utilizando a interface implementada o JPA
		List <Tempo> previsao = prevRepo.findAll();
		
		mv.addObject("previsoes", previsao);
		
		return mv;
	}
}
