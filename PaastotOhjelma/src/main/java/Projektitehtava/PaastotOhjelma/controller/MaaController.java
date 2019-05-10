package Projektitehtava.PaastotOhjelma.controller;

import javax.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import Projektitehtava.PaastotOhjelma.domain.Maa;
import Projektitehtava.PaastotOhjelma.domain.MaaVakilukuRepository;
import Projektitehtava.PaastotOhjelma.domain.Paasto;
import Projektitehtava.PaastotOhjelma.domain.MaaRepository;
import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;
import Projektitehtava.PaastotOhjelma.domain.PaastoRepository;

@Controller
public class MaaController {
	
	@Autowired
	private MaaVakilukuRepository maaVakilukuRepository;
	
	@Autowired
	private MaaRepository maaRepository;
	
	@Autowired
	private PaastoRepository paastoRepository;
	
	
	@RequestMapping("/")
	public String avaaIndexSivu() {
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("maa", new Maa());
		model.addAttribute("maat", maaVakilukuRepository.findAll());
				
		return "index";
	} 
	 
	@PostMapping("/lisaamaa")
	public String lisaaMaa(@Valid Maa maa, BindingResult bindresult, Model model) { 
		maaRepository.save(maa);
		
		// Olio, jolla luetaan listan olioita
		MaaVakiluku vakiluku = new MaaVakiluku();
		
		List<MaaVakiluku> vakiluvut = (List<MaaVakiluku>) maaVakilukuRepository.findAll();
		
		// Olio, jolla poimitaan halutun maan tiedot
		MaaVakiluku maanvakiluku = new MaaVakiluku();
		
		// Käydään lista läpi
		for (int i = 0; i < vakiluvut.size(); i++) {
			vakiluku = vakiluvut.get(i);
			if (maa.getNimi().equals(vakiluku.getNimi())) {
				maanvakiluku = vakiluvut.get(i);
			} 
		}
		
		// Tallennetaan Maa-oliolle vuoteen perustuva väkiluku
		if (maa.getVuosi() == 1960) {
			maa.setVakiluku(maanvakiluku.getVuosi1960());
		} else if (maa.getVuosi() == 1961) {
			maa.setVakiluku(maanvakiluku.getVuosi1961());
		} else if (maa.getVuosi() == 1962) {
			maa.setVakiluku(maanvakiluku.getVuosi1962());
		} else if (maa.getVuosi() == 1963) {
			maa.setVakiluku(maanvakiluku.getVuosi1963());
		} else if (maa.getVuosi() == 1964) {
			maa.setVakiluku(maanvakiluku.getVuosi1964());
		} else if (maa.getVuosi() == 1965) {
			maa.setVakiluku(maanvakiluku.getVuosi1965());
		} else if (maa.getVuosi() == 1966) {
			maa.setVakiluku(maanvakiluku.getVuosi1966());
		} else if (maa.getVuosi() == 1967) {
			maa.setVakiluku(maanvakiluku.getVuosi1967());
		} else if (maa.getVuosi() == 1968) {
			maa.setVakiluku(maanvakiluku.getVuosi1968());
		} else if (maa.getVuosi() == 1969) {
			maa.setVakiluku(maanvakiluku.getVuosi1969());
		} else if (maa.getVuosi() == 1970) {
			maa.setVakiluku(maanvakiluku.getVuosi1970());
		} else if (maa.getVuosi() == 1971) {
			maa.setVakiluku(maanvakiluku.getVuosi1971());
		} else if (maa.getVuosi() == 1972) {
			maa.setVakiluku(maanvakiluku.getVuosi1972());
		} else if (maa.getVuosi() == 1973) {
			maa.setVakiluku(maanvakiluku.getVuosi1973());
		} else if (maa.getVuosi() == 1974) {
			maa.setVakiluku(maanvakiluku.getVuosi1974());
		} else if (maa.getVuosi() == 1975) {
			maa.setVakiluku(maanvakiluku.getVuosi1975());
		} else if (maa.getVuosi() == 1976) {
			maa.setVakiluku(maanvakiluku.getVuosi1976());
		} else if (maa.getVuosi() == 1977) {
			maa.setVakiluku(maanvakiluku.getVuosi1977());
		} else if (maa.getVuosi() == 1978) {
			maa.setVakiluku(maanvakiluku.getVuosi1978());
		} else if (maa.getVuosi() == 1979) {
			maa.setVakiluku(maanvakiluku.getVuosi1979());
		} else if (maa.getVuosi() == 1980) {
			maa.setVakiluku(maanvakiluku.getVuosi1980());
		} else if (maa.getVuosi() == 1981) {
			maa.setVakiluku(maanvakiluku.getVuosi1981());
		} else if (maa.getVuosi() == 1982) {
			maa.setVakiluku(maanvakiluku.getVuosi1982());
		} else if (maa.getVuosi() == 1983) {
			maa.setVakiluku(maanvakiluku.getVuosi1983());
		} else if (maa.getVuosi() == 1984) {
			maa.setVakiluku(maanvakiluku.getVuosi1984());
		} else if (maa.getVuosi() == 1985) {
			maa.setVakiluku(maanvakiluku.getVuosi1985());
		} else if (maa.getVuosi() == 1986) {
			maa.setVakiluku(maanvakiluku.getVuosi1986());
		} else if (maa.getVuosi() == 1987) {
			maa.setVakiluku(maanvakiluku.getVuosi1987());
		} else if (maa.getVuosi() == 1988) {
			maa.setVakiluku(maanvakiluku.getVuosi1988());
		} else if (maa.getVuosi() == 1989) {
			maa.setVakiluku(maanvakiluku.getVuosi1989());
		} else if (maa.getVuosi() == 1990) {
			maa.setVakiluku(maanvakiluku.getVuosi1990());
		} else if (maa.getVuosi() == 1991) {
			maa.setVakiluku(maanvakiluku.getVuosi1991());
		} else if (maa.getVuosi() == 1992) {
			maa.setVakiluku(maanvakiluku.getVuosi1992());
		} else if (maa.getVuosi() == 1993) {
			maa.setVakiluku(maanvakiluku.getVuosi1993());
		} else if (maa.getVuosi() == 1994) {
			maa.setVakiluku(maanvakiluku.getVuosi1994());
		} else if (maa.getVuosi() == 1995) {
			maa.setVakiluku(maanvakiluku.getVuosi1995());
		} else if (maa.getVuosi() == 1996) {
			maa.setVakiluku(maanvakiluku.getVuosi1996());
		} else if (maa.getVuosi() == 1997) {
			maa.setVakiluku(maanvakiluku.getVuosi1997());
		} else if (maa.getVuosi() == 1998) {
			maa.setVakiluku(maanvakiluku.getVuosi1998());
		} else if (maa.getVuosi() == 1999) {
			maa.setVakiluku(maanvakiluku.getVuosi1999());
		} else if (maa.getVuosi() == 2000) {
			maa.setVakiluku(maanvakiluku.getVuosi2000());
		} else if (maa.getVuosi() == 2001) {
			maa.setVakiluku(maanvakiluku.getVuosi2001());
		} else if (maa.getVuosi() == 2002) {
			maa.setVakiluku(maanvakiluku.getVuosi2002());
		} else if (maa.getVuosi() == 2003) {
			maa.setVakiluku(maanvakiluku.getVuosi2003());
		} else if (maa.getVuosi() == 2004) {
			maa.setVakiluku(maanvakiluku.getVuosi2004());
		} else if (maa.getVuosi() == 2005) {
			maa.setVakiluku(maanvakiluku.getVuosi2005());
		} else if (maa.getVuosi() == 2006) {
			maa.setVakiluku(maanvakiluku.getVuosi2006());
		} else if (maa.getVuosi() == 2007) {
			maa.setVakiluku(maanvakiluku.getVuosi2007());
		} else if (maa.getVuosi() == 2008) {
			maa.setVakiluku(maanvakiluku.getVuosi2008());
		} else if (maa.getVuosi() == 2009) {
			maa.setVakiluku(maanvakiluku.getVuosi2009());
		} else if (maa.getVuosi() == 2010) {
			maa.setVakiluku(maanvakiluku.getVuosi2010());
		} else if (maa.getVuosi() == 2011) {
			maa.setVakiluku(maanvakiluku.getVuosi2011());
		} else if (maa.getVuosi() == 2012) {
			maa.setVakiluku(maanvakiluku.getVuosi2012());
		} else if (maa.getVuosi() == 2013) {
			maa.setVakiluku(maanvakiluku.getVuosi2013());
		} else if (maa.getVuosi() == 2014) {
			maa.setVakiluku(maanvakiluku.getVuosi2014());
		} else if (maa.getVuosi() == 2015) {
			maa.setVakiluku(maanvakiluku.getVuosi2015());
		} else if (maa.getVuosi() == 2016) {
			maa.setVakiluku(maanvakiluku.getVuosi2016());
		} else if (maa.getVuosi() == 2017) {
			maa.setVakiluku(maanvakiluku.getVuosi2017());
		} else if (maa.getVuosi() == 2018) {
			maa.setVakiluku(maanvakiluku.getVuosi2018());
		} 
		  
	
		System.out.println("Maa-olioon tallennettu nimi " + maa.getNimi() + ", vuosi " + maa.getVuosi() + " ja väkiluku " + maa.getVakiluku() );
		
		return "redirect:index";	
	}
	
	@RequestMapping(value = "/maat")
	public String maat(Model model) {
		model.addAttribute("maat", maaVakilukuRepository.findAll());
		//System.out.println("controller: " + maaVakilukuRepository.findAll());
		
		return "maat";
	}

}
 
