package Projektitehtava.PaastotOhjelma;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Projektitehtava.PaastotOhjelma.domain.MaaRepository;

@SpringBootApplication
public class PaastotOhjelmaApplication {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(PaastotOhjelmaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PaastotOhjelmaApplication.class, args);
		
	try {
		// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
		List<String> rivit = Files.readAllLines(Paths.get("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv"));
		
		// Käydään läpi listan kaikki rivit
		for (String rivi : rivit) {

				// Poistetaan lainausmerkit
				rivi = rivi.replace("\"", "");
				
				// Korvataan asioiden sisällä olevat pilkut pisteellä
				rivi = rivi.replace(", ", " ");
				
				// Erotellaan tiedot
				String[] arvot = rivi.split(",");
				
				String maat = arvot[0];
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}	
	
	@Bean
	public CommandLineRunner Maidenhaku(MaaRepository maaRepository) {
				return (args) -> {
				log.info("käsittelee maiden tiedot");	

				try {
					// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
					List<String> rivit = Files.readAllLines(Paths.get("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv"));
					
					log.info("listaa maat");
					// Käydään läpi listan kaikki rivit
					for (String rivi : rivit) {

							// Poistetaan lainausmerkit
							rivi = rivi.replace("\"", "");
							
							// Korvataan asioiden sisällä olevat pilkut pisteellä
							rivi = rivi.replace(", ", " ");
							
							// Erotellaan tiedot
							String[] arvot = rivi.split(",");
							
							String maat = arvot[0];
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				};
	}
	
	}