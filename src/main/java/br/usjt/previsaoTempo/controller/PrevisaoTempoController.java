package br.usjt.previsaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaoTempo.model.Tempo;
import br.usjt.previsaoTempo.service.PrevisaoService;
import br.usjt.previsaoTempo.service.PrevisaoDiaSemanaService;
import br.usjt.previsaoTempo.model.PrevisaoDiaSemana;

@Controller
public class PrevisaoTempoController {

		@Autowired
		private PrevisaoService prevServ;
		@Autowired
		private PrevisaoDiaSemanaService diaServ;
		

		@GetMapping("/previsao/")
		public ModelAndView mostrarPrevisao() {
		
			ModelAndView mv = new ModelAndView("mostrar_previsao");

			List<Tempo> previsao = prevServ.listarTodos();
			List<PrevisaoDiaSemana> diasSemana = diaServ.listar();
			
			mv.addObject(new Tempo());
			
			mv.addObject("diasSemana", diasSemana);
			mv.addObject("previsoes", previsao);
			return mv;
		}

		
		@PostMapping
		public String salvarPrevisao(Tempo tempo) {
			System.out.println(tempo.getDiaDaSemana());
			prevServ.salvar(tempo);
			return "redirect:/previsao/";

		}

	}