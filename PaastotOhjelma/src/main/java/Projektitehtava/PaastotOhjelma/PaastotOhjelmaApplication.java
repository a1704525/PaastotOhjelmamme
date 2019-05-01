package Projektitehtava.PaastotOhjelma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Projektitehtava.PaastotOhjelma.domain.CSVLukija;

@SpringBootApplication
public class PaastotOhjelmaApplication {

	public static void main(String[] args) { 
		SpringApplication.run(PaastotOhjelmaApplication.class, args);
		
		// Käynnistetään CSVLukija
		CSVLukija.main(args);	
	}	
}