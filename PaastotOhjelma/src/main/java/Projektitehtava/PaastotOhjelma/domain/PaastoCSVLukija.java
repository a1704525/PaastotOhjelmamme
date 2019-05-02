package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class PaastoCSVLukija {
	
		public static List<Paasto> main(String[] args) {
			 	
			// Luodaan lista, johon luetaan kaikki csv-tiedoston rivit
			List<Paasto> paastot = luePaastoCsvTiedosto("data/API_EN.ATM.CO2E.KT_DS2_en_csv_v2_10576625.csv");
		
			return paastot;
			
			
			
		}
				
		private static List<Paasto> luePaastoCsvTiedosto(String PaastoCsvTiedosto) {
			List<Paasto> paastot = new ArrayList<>();
			Path tamapolku = Paths.get(PaastoCsvTiedosto);
			
			try (BufferedReader buf = Files.newBufferedReader(tamapolku, StandardCharsets.US_ASCII)) {
				
				String rivi = buf.readLine();
				
				while (rivi != null) {
					
					// Poistetaan lainausmerkit
					rivi = rivi.replace("\"", "");
					
					// Korvataan asioiden sisällä olevat pilkut välilyönnillä
					rivi = rivi.replace(", ", " ");
					
					// Erotellaan tiedot
					String[] arvot = rivi.split(",");
					
					Paasto uusiPaasto = new Paasto();
					
					String paastonimi = arvot[0];
					int vuosi2008 = (int) Double.parseDouble(arvot[52]);
					
					uusiPaasto.setPaastonimi(paastonimi);
					uusiPaasto.setVuosi2008(vuosi2008);
					
					
					System.out.println("Päästös nimi: " + uusiPaasto.getPaastonimi());
					
					paastot.add(uusiPaasto);
					
					rivi = buf.readLine();
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return paastot;
		}
	

}
