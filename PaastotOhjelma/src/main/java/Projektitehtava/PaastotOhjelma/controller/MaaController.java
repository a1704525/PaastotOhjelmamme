package Projektitehtava.PaastotOhjelma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

//import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;
import Projektitehtava.PaastotOhjelma.domain.MaaVakilukuRepository;

@Controller
public class MaaController {
	
	@Autowired
	private MaaVakilukuRepository maaVakilukuRepository;
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		
		model.addAttribute("maat", maaVakilukuRepository.findAll());
		
		System.out.println("controller: " + maaVakilukuRepository.findAll());
		
		return "index";
	} 
	 
}
 
