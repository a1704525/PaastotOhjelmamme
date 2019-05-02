package Projektitehtava.PaastotOhjelma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Projektitehtava.PaastotOhjelma.domain.PaastoRepository;

@Controller
public class PaastoController {
	
	@Autowired
	private PaastoRepository paastoRepository;
	
	@RequestMapping(value = "/paasto")
	public String index(Model model) {
		model.addAttribute("paastot", paastoRepository.findAll());

		
		return "paasto";
	} 

}
