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
				
				rivi = rivi.replace(",,", ",0,");
				
				// Erotellaan tiedot
				String[] arvot = rivi.split(",");
				
				MaaVakiluku uusiMaa = new MaaVakiluku();
				
				String nimi = arvot[0];
				int vuosi1960 = Integer.parseInt(arvot[4]);
				int vuosi1961 = Integer.parseInt(arvot[5]);
				int vuosi1962 = Integer.parseInt(arvot[6]);
				int vuosi1963 = Integer.parseInt(arvot[7]);
				int vuosi1964 = Integer.parseInt(arvot[8]);
				int vuosi1965 = Integer.parseInt(arvot[9]);
				int vuosi1966 = Integer.parseInt(arvot[10]);
				int vuosi1967 = Integer.parseInt(arvot[11]);
				int vuosi1968 = Integer.parseInt(arvot[12]);
				int vuosi1969 = Integer.parseInt(arvot[13]);
				int vuosi1970 = Integer.parseInt(arvot[14]);
				int vuosi1971 = Integer.parseInt(arvot[15]);
				int vuosi1972 = Integer.parseInt(arvot[16]);
				int vuosi1973 = Integer.parseInt(arvot[17]);
				int vuosi1974 = Integer.parseInt(arvot[18]);
				int vuosi1975 = Integer.parseInt(arvot[19]);
				int vuosi1976 = Integer.parseInt(arvot[20]);
				int vuosi1977 = Integer.parseInt(arvot[21]);
				int vuosi1978 = Integer.parseInt(arvot[22]);
				int vuosi1979 = Integer.parseInt(arvot[23]);
				int vuosi1980 = Integer.parseInt(arvot[24]);
				int vuosi1981 = Integer.parseInt(arvot[25]);
				int vuosi1982 = Integer.parseInt(arvot[26]);
				int vuosi1983 = Integer.parseInt(arvot[27]);
				int vuosi1984 = Integer.parseInt(arvot[28]);
				int vuosi1985 = Integer.parseInt(arvot[29]);
				int vuosi1986 = Integer.parseInt(arvot[30]);
				int vuosi1987 = Integer.parseInt(arvot[31]);
				int vuosi1988 = Integer.parseInt(arvot[32]);
				int vuosi1989 = Integer.parseInt(arvot[33]);
				int vuosi1990 = Integer.parseInt(arvot[34]);
				int vuosi1991 = Integer.parseInt(arvot[35]);
				int vuosi1992 = Integer.parseInt(arvot[36]);
				int vuosi1993 = Integer.parseInt(arvot[37]);
				int vuosi1994 = Integer.parseInt(arvot[38]);
				int vuosi1995 = Integer.parseInt(arvot[39]);
				int vuosi1996 = Integer.parseInt(arvot[40]);
				int vuosi1997 = Integer.parseInt(arvot[41]);
				int vuosi1998 = Integer.parseInt(arvot[42]);
				int vuosi1999 = Integer.parseInt(arvot[43]);
				int vuosi2000 = Integer.parseInt(arvot[44]);
				int vuosi2001 = Integer.parseInt(arvot[45]);
				int vuosi2002 = Integer.parseInt(arvot[46]);
				int vuosi2003 = Integer.parseInt(arvot[47]);
				int vuosi2004 = Integer.parseInt(arvot[48]);
				int vuosi2005 = Integer.parseInt(arvot[49]);
				int vuosi2006 = Integer.parseInt(arvot[50]);
				int vuosi2007 = Integer.parseInt(arvot[51]);
				int vuosi2008 = Integer.parseInt(arvot[52]);
				int vuosi2009 = Integer.parseInt(arvot[53]);
				int vuosi2010 = Integer.parseInt(arvot[54]);
				int vuosi2011 = Integer.parseInt(arvot[55]);
				int vuosi2012 = Integer.parseInt(arvot[56]);
				int vuosi2013 = Integer.parseInt(arvot[57]);
				int vuosi2014 = Integer.parseInt(arvot[58]);
				int vuosi2015 = Integer.parseInt(arvot[59]);
				int vuosi2016 = Integer.parseInt(arvot[60]);
				int vuosi2017 = Integer.parseInt(arvot[61]);
				int vuosi2018 = Integer.parseInt(arvot[62]);
				
				uusiMaa.setNimi(nimi);
				uusiMaa.setVuosi1960(vuosi1960);
				uusiMaa.setVuosi1961(vuosi1961);
				uusiMaa.setVuosi1962(vuosi1962);
				uusiMaa.setVuosi1963(vuosi1963);
				uusiMaa.setVuosi1964(vuosi1964);
				uusiMaa.setVuosi1965(vuosi1965);
				uusiMaa.setVuosi1966(vuosi1966);
				uusiMaa.setVuosi1967(vuosi1967);
				uusiMaa.setVuosi1968(vuosi1968);
				uusiMaa.setVuosi1969(vuosi1969);
				uusiMaa.setVuosi1970(vuosi1970);
				uusiMaa.setVuosi1971(vuosi1971);
				uusiMaa.setVuosi1972(vuosi1972);
				uusiMaa.setVuosi1973(vuosi1973);
				uusiMaa.setVuosi1974(vuosi1974);
				uusiMaa.setVuosi1975(vuosi1975);
				uusiMaa.setVuosi1976(vuosi1976);
				uusiMaa.setVuosi1977(vuosi1977);
				uusiMaa.setVuosi1978(vuosi1978);
				uusiMaa.setVuosi1979(vuosi1979);
				uusiMaa.setVuosi1980(vuosi1980);
				uusiMaa.setVuosi1981(vuosi1981);
				uusiMaa.setVuosi1982(vuosi1982);
				uusiMaa.setVuosi1983(vuosi1983);
				uusiMaa.setVuosi1984(vuosi1984);
				uusiMaa.setVuosi1985(vuosi1985);
				uusiMaa.setVuosi1986(vuosi1986);
				uusiMaa.setVuosi1987(vuosi1987);
				uusiMaa.setVuosi1988(vuosi1988);
				uusiMaa.setVuosi1989(vuosi1989);
				uusiMaa.setVuosi1990(vuosi1990);
				uusiMaa.setVuosi1991(vuosi1991);
				uusiMaa.setVuosi1992(vuosi1992);
				uusiMaa.setVuosi1993(vuosi1993);
				uusiMaa.setVuosi1994(vuosi1994);
				uusiMaa.setVuosi1995(vuosi1995);
				uusiMaa.setVuosi1996(vuosi1996);
				uusiMaa.setVuosi1997(vuosi1997);
				uusiMaa.setVuosi1998(vuosi1998);
				uusiMaa.setVuosi1999(vuosi1999);
				uusiMaa.setVuosi2000(vuosi2000);
				uusiMaa.setVuosi2001(vuosi2001);
				uusiMaa.setVuosi2002(vuosi2002);
				uusiMaa.setVuosi2003(vuosi2003);
				uusiMaa.setVuosi2004(vuosi2004);
				uusiMaa.setVuosi2005(vuosi2005);
				uusiMaa.setVuosi2006(vuosi2006);
				uusiMaa.setVuosi2007(vuosi2007);
				uusiMaa.setVuosi2008(vuosi2008);
				uusiMaa.setVuosi2009(vuosi2009);
				uusiMaa.setVuosi2010(vuosi2010);
				uusiMaa.setVuosi2011(vuosi2011);
				uusiMaa.setVuosi2012(vuosi2012);
				uusiMaa.setVuosi2013(vuosi2013);
				uusiMaa.setVuosi2014(vuosi2014);
				uusiMaa.setVuosi2015(vuosi2015);
				uusiMaa.setVuosi2016(vuosi2016);
				uusiMaa.setVuosi2017(vuosi2017);
				uusiMaa.setVuosi2018(vuosi2018);
				
				
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