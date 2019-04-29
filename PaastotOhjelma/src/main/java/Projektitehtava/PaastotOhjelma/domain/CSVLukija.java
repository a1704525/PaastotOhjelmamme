package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVLukija {

	public static void main(String[] args) {
		
		try {
			// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
			List<String> rivit = Files.readAllLines(Paths.get("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv"));
			
			// Käydään läpi listan kaikki rivit
			for (String rivi : rivit) {

					// Poistetaan lainausmerkit
					rivi = rivi.replace("\"", "");
					
					// Korvataan asioiden sisällä olevat pilkut pisteellä
					rivi = rivi.replace(", ", ".");
					
					// Erotellaan tiedot
					String[] arvot = rivi.split(",");

					String maanNimi = "Sweden";
					
					// Tulostetaan halutun maan tiedot
					if (arvot[0].equals(maanNimi)) {
						System.out.println("Maa: " + arvot[0] + "\nMaakoodi: " + arvot[1] + "\nVäkiluku 1999: " + arvot[44] + "\nVäkiluku 2009: " + arvot[54]);
					}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}
