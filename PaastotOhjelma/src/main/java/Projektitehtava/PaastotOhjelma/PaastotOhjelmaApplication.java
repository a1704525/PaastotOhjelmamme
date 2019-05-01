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



@SpringBootApplication
public class PaastotOhjelmaApplication {

	private static final Logger log = LoggerFactory.getLogger(PaastotOhjelmaApplication.class);
	
	public static void main(String[] args) { 
		SpringApplication.run(PaastotOhjelmaApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner maidenNimetJaVakiluvut(MaaVakilukuRepository maavakilukurepository) {
		return (args) -> {
			
			// Käynnistetään CSVLukija
	    	List<MaaVakiluku> maidenVakiluvut = CSVLukija.main(args);
	   
	    	// Käydään läpi listan maa-oliot
	    	for (MaaVakiluku maa: maidenVakiluvut) {
	    		
	    		log.info("Tallennetaan maiden nimiä ja väkilukuja");
	    		maavakilukurepository.save(maa);
	    
	    	}	
		};
	}
}