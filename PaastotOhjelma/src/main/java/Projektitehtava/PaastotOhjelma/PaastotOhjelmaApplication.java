package Projektitehtava.PaastotOhjelma;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import Projektitehtava.PaastotOhjelma.domain.CSVLukija;
import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;
import Projektitehtava.PaastotOhjelma.domain.MaaVakilukuRepository;
import Projektitehtava.PaastotOhjelma.domain.Paasto;
import Projektitehtava.PaastotOhjelma.domain.PaastoCSVLukija;
import Projektitehtava.PaastotOhjelma.domain.PaastoRepository;



@SpringBootApplication
public class PaastotOhjelmaApplication {

	private static final Logger log = LoggerFactory.getLogger(PaastotOhjelmaApplication.class);
	
	public static void main(String[] args) { 
		SpringApplication.run(PaastotOhjelmaApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner maidenNimetVakiluvutJaPaastot(MaaVakilukuRepository maavakilukurepository, PaastoRepository paastorepository) {
		return (args) -> {
			
			// Käynnistetään CSVLukija
	    	List<MaaVakiluku> maaVakiluvut = CSVLukija.main(args);
	    	List<Paasto> paastot = PaastoCSVLukija.main(args);
	   
	    	// Käydään läpi listan maa-oliot
	    	for (MaaVakiluku maaVakiluku: maaVakiluvut) {
	    		
	    		log.info("Tallennetaan maiden nimiä ja väkilukuja");
	    		maavakilukurepository.save(maaVakiluku);
	    	}	
	    	
	    	// Käydään läpi listan maa-oliot
	    	for (Paasto paasto: paastot) {
	    		
	    		log.info("Tallennetaan maiden nimiä ja päästöjä");
	    		paastorepository.save(paasto);
	    		
	    		System.out.println("controller: " + paasto);
	    		
	    	}
		};
	}
	
	/*@Bean 
	public CommandLineRunner maidenNimetJaPaastot(PaastoRepository paastorepository) {
		return (args) -> {
			
			// Käynnistetään CSVLukija
	    	List<Paasto> paastot = PaastoCSVLukija.main(args);
	   
	    	// Käydään läpi listan maa-oliot
	    	for (Paasto paasto: paastot) {
	    		
	    		log.info("Tallennetaan maiden nimiä ja päästöjä");
	    		paastorepository.save(paasto);

	    
	    	}	
		};
	}*/
}