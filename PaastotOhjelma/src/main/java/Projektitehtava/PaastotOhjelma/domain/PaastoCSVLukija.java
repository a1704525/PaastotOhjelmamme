package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class PaastoCSVLukija {
					
		public static List<Paasto> main(String[] args) {
			
			int bufferkoko = 16 * 1024;
			
			List<Paasto> paastot = new ArrayList<>();

			try (BufferedReader bufferedlukija = new BufferedReader(new FileReader("data/API_EN.ATM.CO2E.KT_DS2_en_csv_v2_10576625.csv"), bufferkoko)){
				
				String rivi = bufferedlukija.readLine();
			
				while (rivi != null) {
					
					// Muuetaan tyhjät tiedot 
					rivi = rivi.replace("\"\"", "\"0\"");
					
					rivi = rivi.replace("\",", "\";");
					
					// Korvataan asioiden sisällä olevat pilkut välilyönnillä
					//rivi = rivi.replace(", ", " ");
					
					// Poistetaan lainausmerkit
					rivi = rivi.replace("\"", "");
					
					rivi = rivi.replace("Country Name", "Maat");
					
					//rivi = rivi.replace(";;", ";0;");
				//	rivi = rivi.replace(";;", ";0;");
					
					//System.out.println("Päästös nimi: " + rivi);
					
				
					// Erotellaan tiedot
					String[] arvot = rivi.split(";");
					
					Paasto uusiPaasto = new Paasto();
					
					String paastonimi = arvot[0];
					int vuosi1960 = (int) Double.parseDouble(arvot[4]);
					int vuosi1961 = (int) Double.parseDouble(arvot[5]);
					int vuosi1962 = (int) Double.parseDouble(arvot[6]);
					int vuosi1963 = (int) Double.parseDouble(arvot[7]);
					int vuosi1964 = (int) Double.parseDouble(arvot[8]);
					int vuosi1965 = (int) Double.parseDouble(arvot[9]);
					int vuosi1966 = (int) Double.parseDouble(arvot[10]);
					int vuosi1967 = (int) Double.parseDouble(arvot[11]);
					int vuosi1968 = (int) Double.parseDouble(arvot[12]);
					int vuosi1969 = (int) Double.parseDouble(arvot[13]);
					int vuosi1970 = (int) Double.parseDouble(arvot[14]);
					int vuosi1971 = (int) Double.parseDouble(arvot[15]);
					int vuosi1972 = (int) Double.parseDouble(arvot[16]);
					int vuosi1973 = (int) Double.parseDouble(arvot[17]);
					int vuosi1974 = (int) Double.parseDouble(arvot[18]);
					int vuosi1975 = (int) Double.parseDouble(arvot[19]);
					int vuosi1976 = (int) Double.parseDouble(arvot[20]);
					int vuosi1977 = (int) Double.parseDouble(arvot[21]);
					int vuosi1978 = (int) Double.parseDouble(arvot[22]);
					int vuosi1979 = (int) Double.parseDouble(arvot[23]);
					int vuosi1980 = (int) Double.parseDouble(arvot[24]);
					int vuosi1981 = (int) Double.parseDouble(arvot[25]);
					int vuosi1982 = (int) Double.parseDouble(arvot[26]);
					int vuosi1983 = (int) Double.parseDouble(arvot[27]);
					int vuosi1984 = (int) Double.parseDouble(arvot[28]);
					int vuosi1985 = (int) Double.parseDouble(arvot[29]);
					int vuosi1986 = (int) Double.parseDouble(arvot[30]);
					int vuosi1987 = (int) Double.parseDouble(arvot[31]);
					int vuosi1988 = (int) Double.parseDouble(arvot[32]);
					int vuosi1989 = (int) Double.parseDouble(arvot[33]);
					int vuosi1990 = (int) Double.parseDouble(arvot[34]);
					int vuosi1991 = (int) Double.parseDouble(arvot[35]);
					int vuosi1992 = (int) Double.parseDouble(arvot[36]);
					int vuosi1993 = (int) Double.parseDouble(arvot[37]);
					int vuosi1994 = (int) Double.parseDouble(arvot[38]);
					int vuosi1995 = (int) Double.parseDouble(arvot[39]);
					int vuosi1996 = (int) Double.parseDouble(arvot[40]);
					int vuosi1997 = (int) Double.parseDouble(arvot[41]);
					int vuosi1998 = (int) Double.parseDouble(arvot[42]);
					int vuosi1999 = (int) Double.parseDouble(arvot[43]);
					int vuosi2000 = (int) Double.parseDouble(arvot[44]);
					int vuosi2001 = (int) Double.parseDouble(arvot[45]);
					int vuosi2002 = (int) Double.parseDouble(arvot[46]);
					int vuosi2003 = (int) Double.parseDouble(arvot[47]);
					int vuosi2004 = (int) Double.parseDouble(arvot[48]);
					int vuosi2005 = (int) Double.parseDouble(arvot[49]);
					int vuosi2006 = (int) Double.parseDouble(arvot[50]);
					int vuosi2007 = (int) Double.parseDouble(arvot[51]);
					int vuosi2008 = (int) Double.parseDouble(arvot[52]);
					int vuosi2009 = (int) Double.parseDouble(arvot[53]);
					int vuosi2010 = (int) Double.parseDouble(arvot[54]);
					int vuosi2011 = (int) Double.parseDouble(arvot[55]);
					int vuosi2012 = (int) Double.parseDouble(arvot[56]);
					int vuosi2013 = (int) Double.parseDouble(arvot[57]);
					int vuosi2014 = (int) Double.parseDouble(arvot[58]);
					int vuosi2015 = (int) Double.parseDouble(arvot[59]);
					int vuosi2016 = (int) Double.parseDouble(arvot[60]);
					int vuosi2017 = (int) Double.parseDouble(arvot[61]);
					int vuosi2018 = (int) Double.parseDouble(arvot[62]);
					
					
					uusiPaasto.setPaastonimi(paastonimi);
					uusiPaasto.setVuosi1960(vuosi1960);
					uusiPaasto.setVuosi1961(vuosi1961);
					uusiPaasto.setVuosi1962(vuosi1962);
					uusiPaasto.setVuosi1963(vuosi1963);
					uusiPaasto.setVuosi1964(vuosi1964);
					uusiPaasto.setVuosi1965(vuosi1965);
					uusiPaasto.setVuosi1966(vuosi1966);
					uusiPaasto.setVuosi1967(vuosi1967);
					uusiPaasto.setVuosi1968(vuosi1968);
					uusiPaasto.setVuosi1969(vuosi1969);
					uusiPaasto.setVuosi1970(vuosi1970);
					uusiPaasto.setVuosi1971(vuosi1971);
					uusiPaasto.setVuosi1972(vuosi1972);
					uusiPaasto.setVuosi1973(vuosi1973);
					uusiPaasto.setVuosi1974(vuosi1974);
					uusiPaasto.setVuosi1975(vuosi1975);
					uusiPaasto.setVuosi1976(vuosi1976);
					uusiPaasto.setVuosi1977(vuosi1977);
					uusiPaasto.setVuosi1978(vuosi1978);
					uusiPaasto.setVuosi1979(vuosi1979);
					uusiPaasto.setVuosi1980(vuosi1980);
					uusiPaasto.setVuosi1981(vuosi1981);
					uusiPaasto.setVuosi1982(vuosi1982);
					uusiPaasto.setVuosi1983(vuosi1983);
					uusiPaasto.setVuosi1984(vuosi1984);
					uusiPaasto.setVuosi1985(vuosi1985);
					uusiPaasto.setVuosi1986(vuosi1986);
					uusiPaasto.setVuosi1987(vuosi1987);
					uusiPaasto.setVuosi1988(vuosi1988);
					uusiPaasto.setVuosi1989(vuosi1989);
					uusiPaasto.setVuosi1990(vuosi1990);
					uusiPaasto.setVuosi1991(vuosi1991);
					uusiPaasto.setVuosi1992(vuosi1992);
					uusiPaasto.setVuosi1993(vuosi1993);
					uusiPaasto.setVuosi1994(vuosi1994);
					uusiPaasto.setVuosi1995(vuosi1995);
					uusiPaasto.setVuosi1996(vuosi1996);
					uusiPaasto.setVuosi1997(vuosi1997);
					uusiPaasto.setVuosi1998(vuosi1998);
					uusiPaasto.setVuosi1999(vuosi1999);
					uusiPaasto.setVuosi2000(vuosi2000);
					uusiPaasto.setVuosi2001(vuosi2001);
					uusiPaasto.setVuosi2002(vuosi2002);
					uusiPaasto.setVuosi2003(vuosi2003);
					uusiPaasto.setVuosi2004(vuosi2004);
					uusiPaasto.setVuosi2005(vuosi2005);
					uusiPaasto.setVuosi2006(vuosi2006);
					uusiPaasto.setVuosi2007(vuosi2007);
					uusiPaasto.setVuosi2008(vuosi2008);
					uusiPaasto.setVuosi2009(vuosi2009);
					uusiPaasto.setVuosi2010(vuosi2010);
					uusiPaasto.setVuosi2011(vuosi2011);
					uusiPaasto.setVuosi2012(vuosi2012);
					uusiPaasto.setVuosi2013(vuosi2013);
					uusiPaasto.setVuosi2014(vuosi2014);
					uusiPaasto.setVuosi2015(vuosi2015);
					uusiPaasto.setVuosi2016(vuosi2016);
					uusiPaasto.setVuosi2017(vuosi2017);
					uusiPaasto.setVuosi2018(vuosi2018);
				
					
					
					System.out.println("Päästös nimi: " + uusiPaasto.getPaastonimi());
					
					paastot.add(uusiPaasto);
					
					rivi = bufferedlukija.readLine();

				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return paastot;
		}
	

}
