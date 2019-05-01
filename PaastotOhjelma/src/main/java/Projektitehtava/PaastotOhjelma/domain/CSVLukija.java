package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;
//import Projektitehtava.PaastotOhjelma.domain.MaaVakilukuRepository;

public class CSVLukija {

	//@Autowired
	//private static MaaVakilukuRepository maavakilukurepository;
	
	public static void main(String[] args) {
		 	
		// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
		List<MaaVakiluku> maidenVakiluvut = lueCsvTiedosto("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv");
			
		System.out.println(maidenVakiluvut);
		
		// Käydään läpi listan maa-oliot
		for (MaaVakiluku maa: maidenVakiluvut) {
			
			// Tallennetaan maa-olio repositoryyn
			//maavakilukurepository.save(maa);
			
			System.out.println("Application main -metodi: " + maa);
		}
		
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