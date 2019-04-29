package Projektitehtava.PaastotOhjelma.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import Projektitehtava.PaastotOhjelma.domain.MaaRepository;

public class MaaController {
	
	private MaaRepository maaRepository;
	
	@RequestMapping(value = "/index")
	public String maa(Model model) {
		model.addAttribute("maat", maaRepository.findAll());
		return "index";
	}
	

}

