package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;

public class CSVLukija {

	public static List<MaaVakiluku> main(String[] args) {
		 	
		// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
		List<MaaVakiluku> maidenVakiluvut = lueCsvTiedosto("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv");
	
		return maidenVakiluvut;
		
	}
			
	private static List<MaaVakiluku> lueCsvTiedosto(String csvTiedosto) {
		List<MaaVakiluku> maidenVakiluvut = new ArrayList<>();
		Path polku = Paths.get(csvTiedosto);
		
		try (BufferedReader buf = Files.newBufferedReader(polku, StandardCharsets.US_ASCII)) {
			
			String rivi = buf.readLine();
			
			while (rivi != null) {
				
				// Poistetaan lainausmerkit
				rivi = rivi.replace("\"", "");
				
				// Korvataan asioiden sisällä olevat pilkut välilyönnillä
				rivi = rivi.replace(", ", " ");
				
				// Erotellaan tiedot
				String[] arvot = rivi.split(",");
				
				MaaVakiluku uusiMaa = new MaaVakiluku();
				
				String nimi = arvot[0];
				int vuosi1960 = Integer.parseInt(arvot[4]);
				
				uusiMaa.setNimi(nimi);
				uusiMaa.setVuosi1960(vuosi1960);
				
				System.out.println("Uuden maan nimi: " + uusiMaa.getNimi());
				
				maidenVakiluvut.add(uusiMaa);
				
				rivi = buf.readLine();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return maidenVakiluvut;
	}
}