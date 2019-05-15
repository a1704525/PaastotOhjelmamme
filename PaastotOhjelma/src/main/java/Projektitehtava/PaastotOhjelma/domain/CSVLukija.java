package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import Projektitehtava.PaastotOhjelma.domain.MaaVakiluku;

public class CSVLukija {
		
	public static List<MaaVakiluku> main(String[] args) {
		
		int bufferinkoko = 32 * 1024;
		
		List<MaaVakiluku> maaVakiluvut = new ArrayList<>();
		
		try (BufferedReader bufferedlukija = new BufferedReader(new FileReader("data/API_SP.POP.TOTL_DS2_en_csv_v2_10576638.csv"), bufferinkoko)) {
			
			String rivi = bufferedlukija.readLine();
	
			while (rivi != null) {
				
				// Muuetaan tyhjät tiedot 
				rivi = rivi.replace("\"\"", "\"0\"");
				
				rivi = rivi.replace("\",", "\";");
				
				// Korvataan asioiden sisällä olevat pilkut välilyönnillä
				//rivi = rivi.replace(", ", " ");
				
				// Poistetaan lainausmerkit
				rivi = rivi.replace("\"", "");
				
				rivi = rivi.replace("Country Name", "Valitse maa");
				
				//rivi = rivi.replace(";;", ";0;");
				//rivi = rivi.replace(";;", ";0;");
				
			//	System.out.println("Päästös nimi: " + rivi);
				
			
				// Erotellaan tiedot
				String[] arvot = rivi.split(";");
						
				MaaVakiluku uusiMaaVakiluku = new MaaVakiluku();
				
				String vakilukunimi = arvot[0];
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
				
				uusiMaaVakiluku.setVakilukunimi(vakilukunimi);
				uusiMaaVakiluku.setVuosi1960(vuosi1960);
				uusiMaaVakiluku.setVuosi1961(vuosi1961);
				uusiMaaVakiluku.setVuosi1962(vuosi1962);
				uusiMaaVakiluku.setVuosi1963(vuosi1963);
				uusiMaaVakiluku.setVuosi1964(vuosi1964);
				uusiMaaVakiluku.setVuosi1965(vuosi1965);
				uusiMaaVakiluku.setVuosi1966(vuosi1966);
				uusiMaaVakiluku.setVuosi1967(vuosi1967);
				uusiMaaVakiluku.setVuosi1968(vuosi1968);
				uusiMaaVakiluku.setVuosi1969(vuosi1969);
				uusiMaaVakiluku.setVuosi1970(vuosi1970);
				uusiMaaVakiluku.setVuosi1971(vuosi1971);
				uusiMaaVakiluku.setVuosi1972(vuosi1972);
				uusiMaaVakiluku.setVuosi1973(vuosi1973);
				uusiMaaVakiluku.setVuosi1974(vuosi1974);
				uusiMaaVakiluku.setVuosi1975(vuosi1975);
				uusiMaaVakiluku.setVuosi1976(vuosi1976);
				uusiMaaVakiluku.setVuosi1977(vuosi1977);
				uusiMaaVakiluku.setVuosi1978(vuosi1978);
				uusiMaaVakiluku.setVuosi1979(vuosi1979);
				uusiMaaVakiluku.setVuosi1980(vuosi1980);
				uusiMaaVakiluku.setVuosi1981(vuosi1981);
				uusiMaaVakiluku.setVuosi1982(vuosi1982);
				uusiMaaVakiluku.setVuosi1983(vuosi1983);
				uusiMaaVakiluku.setVuosi1984(vuosi1984);
				uusiMaaVakiluku.setVuosi1985(vuosi1985);
				uusiMaaVakiluku.setVuosi1986(vuosi1986);
				uusiMaaVakiluku.setVuosi1987(vuosi1987);
				uusiMaaVakiluku.setVuosi1988(vuosi1988);
				uusiMaaVakiluku.setVuosi1989(vuosi1989);
				uusiMaaVakiluku.setVuosi1990(vuosi1990);
				uusiMaaVakiluku.setVuosi1991(vuosi1991);
				uusiMaaVakiluku.setVuosi1992(vuosi1992);
				uusiMaaVakiluku.setVuosi1993(vuosi1993);
				uusiMaaVakiluku.setVuosi1994(vuosi1994);
				uusiMaaVakiluku.setVuosi1995(vuosi1995);
				uusiMaaVakiluku.setVuosi1996(vuosi1996);
				uusiMaaVakiluku.setVuosi1997(vuosi1997);
				uusiMaaVakiluku.setVuosi1998(vuosi1998);
				uusiMaaVakiluku.setVuosi1999(vuosi1999);
				uusiMaaVakiluku.setVuosi2000(vuosi2000);
				uusiMaaVakiluku.setVuosi2001(vuosi2001);
				uusiMaaVakiluku.setVuosi2002(vuosi2002);
				uusiMaaVakiluku.setVuosi2003(vuosi2003);
				uusiMaaVakiluku.setVuosi2004(vuosi2004);
				uusiMaaVakiluku.setVuosi2005(vuosi2005);
				uusiMaaVakiluku.setVuosi2006(vuosi2006);
				uusiMaaVakiluku.setVuosi2007(vuosi2007);
				uusiMaaVakiluku.setVuosi2008(vuosi2008);
				uusiMaaVakiluku.setVuosi2009(vuosi2009);
				uusiMaaVakiluku.setVuosi2010(vuosi2010);
				uusiMaaVakiluku.setVuosi2011(vuosi2011);
				uusiMaaVakiluku.setVuosi2012(vuosi2012);
				uusiMaaVakiluku.setVuosi2013(vuosi2013);
				uusiMaaVakiluku.setVuosi2014(vuosi2014);
				uusiMaaVakiluku.setVuosi2015(vuosi2015);
				uusiMaaVakiluku.setVuosi2016(vuosi2016);
				uusiMaaVakiluku.setVuosi2017(vuosi2017);
				uusiMaaVakiluku.setVuosi2018(vuosi2018);
				
				
				System.out.println("Uuden maan nimi: " + uusiMaaVakiluku.getVakilukunimi());
				
				maaVakiluvut.add(uusiMaaVakiluku);
				
				rivi = bufferedlukija.readLine();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return maaVakiluvut;

	}
}