package Projektitehtava.PaastotOhjelma.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paasto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long paastoid;
	private String paastonimi;
	private int vuosi1960;
	private int vuosi1961; 
	private int vuosi1962;
	private int vuosi1963; 
	private int vuosi1964;
	private int vuosi1965;
	private int vuosi1966;
	private int vuosi1967;
	private int vuosi1968;
	private int vuosi1969;
	private int vuosi1970;
	private int vuosi1971;
	private int vuosi1972;
	private int vuosi1973;
	private int vuosi1974;
	private int vuosi1975;
	private int vuosi1976;
	private int vuosi1977;
	private int vuosi1978;
	private int vuosi1979;
	private int vuosi1980;
	private int vuosi1981;
	private int vuosi1982;
	private int vuosi1983;
	private int vuosi1984;
	private int vuosi1985;
	private int vuosi1986;
	private int vuosi1987;
	private int vuosi1988;
	private int vuosi1989;
	private int vuosi1990;
	private int vuosi1991;
	private int vuosi1992;
	private int vuosi1993;
	private int vuosi1994;
	private int vuosi1995;
	private int vuosi1996;
	private int vuosi1997;
	private int vuosi1998;
	private int vuosi1999;
	private int vuosi2000;
	private int vuosi2001;
	private int vuosi2002;
	private int vuosi2003;
	private int vuosi2004;
	private int vuosi2005;
	private int vuosi2006;
	private int vuosi2007;
	private int vuosi2008;
	private int vuosi2009;
	private int vuosi2010;
	private int vuosi2011;
	private int vuosi2012;
	private int vuosi2013;
	private int vuosi2014;
	private int vuosi2015;
	private int vuosi2016;
	private int vuosi2017;
	private int vuosi2018;
	
public Paasto(){
		
	}
	
	public Paasto(String paastonimi, int vuosi1960, int vuosi1961, int vuosi1962, 
	int vuosi1963, int vuosi1964, int vuosi1965, int vuosi1966, int vuosi1967, int vuosi1968, int vuosi1969, int vuosi1970, int vuosi1971, int vuosi1972, int vuosi1973, int vuosi1974, int vuosi1975,
	 int vuosi1976, int vuosi1977, int vuosi1978, int vuosi1979, int vuosi1980, int vuosi1981, int vuosi1982, int vuosi1983, int vuosi1984, int vuosi1985, int vuosi1986, int vuosi1987, int vuosi1988,
	 int vuosi1989, int vuosi1990, int vuosi1991, int vuosi1992, int vuosi1993, int vuosi1994, int vuosi1995, int vuosi1996, int vuosi1997, int vuosi1998, int vuosi1999, int vuosi2000, int vuosi2001,
	 int vuosi2002, int vuosi2003, int vuosi2004, int vuosi2005, int vuosi2006, int vuosi2007, int vuosi2008, int vuosi2009, int vuosi2010, int vuosi2011, int vuosi2012, int vuosi2013, int vuosi2014,
	 int vuosi2015, int vuosi2016, int vuosi2017, int vuosi2018) {
		
		this.paastonimi = paastonimi;
		this.vuosi1960 = vuosi1960;
		this.vuosi1961 = vuosi1961; 
		this.vuosi1962 = vuosi1962;
		this.vuosi1963 = vuosi1963; 
		this.vuosi1964 = vuosi1964;
		this.vuosi1965 = vuosi1965;
		this.vuosi1966 = vuosi1966;
		this.vuosi1967 = vuosi1967;
		this.vuosi1968 = vuosi1968;
		this.vuosi1969 = vuosi1969;
		this.vuosi1970 = vuosi1970;
		this.vuosi1971 = vuosi1971;
		this.vuosi1972 = vuosi1972;
		this.vuosi1973 = vuosi1973;
		this.vuosi1974 = vuosi1974;
		this.vuosi1975 = vuosi1975;
		this.vuosi1976 = vuosi1976;
		this.vuosi1977 = vuosi1977;
		this.vuosi1978 = vuosi1978;
		this.vuosi1979 = vuosi1979;
		this.vuosi1980 = vuosi1980;
		this.vuosi1981 = vuosi1981;
		this.vuosi1982 = vuosi1982;
		this.vuosi1983 = vuosi1983;
		this.vuosi1984 = vuosi1984;
		this.vuosi1985 = vuosi1985;
		this.vuosi1986 = vuosi1986;
		this.vuosi1987 = vuosi1987;
		this.vuosi1988 = vuosi1988;
		this.vuosi1989 = vuosi1989;
		this.vuosi1990 = vuosi1990;
		this.vuosi1991 = vuosi1991;
		this.vuosi1992 = vuosi1992;
		this.vuosi1993 = vuosi1993;
		this.vuosi1994 = vuosi1994;
		this.vuosi1995 = vuosi1995;
		this.vuosi1996 = vuosi1996;
		this.vuosi1997 = vuosi1997;
		this.vuosi1998 = vuosi1998;
		this.vuosi1999 = vuosi1999;
		this.vuosi2000 = vuosi2000;
		this.vuosi2001 = vuosi2001;
		this.vuosi2002 = vuosi2002;
		this.vuosi2003 = vuosi2003;
		this.vuosi2004 = vuosi2004;
		this.vuosi2005 = vuosi2005;
		this.vuosi2006 = vuosi2006;
		this.vuosi2007 = vuosi2007;
		this.vuosi2008 = vuosi2008;
		this.vuosi2009 = vuosi2009;
		this.vuosi2010 = vuosi2010;
		this.vuosi2011 = vuosi2011;
		this.vuosi2012 = vuosi2012;
		this.vuosi2013 = vuosi2013;
		this.vuosi2014 = vuosi2014;
		this.vuosi2015 = vuosi2015;
		this.vuosi2016 = vuosi2016;
		this.vuosi2017 = vuosi2017;
		this.vuosi2018 = vuosi2018;
}

	public Long getPaastoid() {
		return paastoid;
	}

	public void setPaastoid(Long paastoid) {
		this.paastoid = paastoid;
	}

	public String getPaastonimi() {
		return paastonimi;
	}

	public void setPaastonimi(String paastonimi) {
		this.paastonimi = paastonimi;
	}

	public int getVuosi1960() {
		return vuosi1960;
	}

	public void setVuosi1960(int vuosi1960) {
		this.vuosi1960 = vuosi1960;
	}

	public int getVuosi1961() {
		return vuosi1961;
	}

	public void setVuosi1961(int vuosi1961) {
		this.vuosi1961 = vuosi1961;
	}

	public int getVuosi1962() {
		return vuosi1962;
	}

	public void setVuosi1962(int vuosi1962) {
		this.vuosi1962 = vuosi1962;
	}

	public int getVuosi1963() {
		return vuosi1963;
	}

	public void setVuosi1963(int vuosi1963) {
		this.vuosi1963 = vuosi1963;
	}

	public int getVuosi1964() {
		return vuosi1964;
	}

	public void setVuosi1964(int vuosi1964) {
		this.vuosi1964 = vuosi1964;
	}

	public int getVuosi1965() {
		return vuosi1965;
	}

	public void setVuosi1965(int vuosi1965) {
		this.vuosi1965 = vuosi1965;
	}

	public int getVuosi1966() {
		return vuosi1966;
	}

	public void setVuosi1966(int vuosi1966) {
		this.vuosi1966 = vuosi1966;
	}

	public int getVuosi1967() {
		return vuosi1967;
	}

	public void setVuosi1967(int vuosi1967) {
		this.vuosi1967 = vuosi1967;
	}

	public int getVuosi1968() {
		return vuosi1968;
	}

	public void setVuosi1968(int vuosi1968) {
		this.vuosi1968 = vuosi1968;
	}

	public int getVuosi1969() {
		return vuosi1969;
	}

	public void setVuosi1969(int vuosi1969) {
		this.vuosi1969 = vuosi1969;
	}

	public int getVuosi1970() {
		return vuosi1970;
	}

	public void setVuosi1970(int vuosi1970) {
		this.vuosi1970 = vuosi1970;
	}

	public int getVuosi1971() {
		return vuosi1971;
	}

	public void setVuosi1971(int vuosi1971) {
		this.vuosi1971 = vuosi1971;
	}

	public int getVuosi1972() {
		return vuosi1972;
	}

	public void setVuosi1972(int vuosi1972) {
		this.vuosi1972 = vuosi1972;
	}

	public int getVuosi1973() {
		return vuosi1973;
	}

	public void setVuosi1973(int vuosi1973) {
		this.vuosi1973 = vuosi1973;
	}

	public int getVuosi1974() {
		return vuosi1974;
	}

	public void setVuosi1974(int vuosi1974) {
		this.vuosi1974 = vuosi1974;
	}

	public int getVuosi1975() {
		return vuosi1975;
	}

	public void setVuosi1975(int vuosi1975) {
		this.vuosi1975 = vuosi1975;
	}

	public int getVuosi1976() {
		return vuosi1976;
	}

	public void setVuosi1976(int vuosi1976) {
		this.vuosi1976 = vuosi1976;
	}

	public int getVuosi1977() {
		return vuosi1977;
	}

	public void setVuosi1977(int vuosi1977) {
		this.vuosi1977 = vuosi1977;
	}

	public int getVuosi1978() {
		return vuosi1978;
	}

	public void setVuosi1978(int vuosi1978) {
		this.vuosi1978 = vuosi1978;
	}

	public int getVuosi1979() {
		return vuosi1979;
	}

	public void setVuosi1979(int vuosi1979) {
		this.vuosi1979 = vuosi1979;
	}

	public int getVuosi1980() {
		return vuosi1980;
	}

	public void setVuosi1980(int vuosi1980) {
		this.vuosi1980 = vuosi1980;
	}

	public int getVuosi1981() {
		return vuosi1981;
	}

	public void setVuosi1981(int vuosi1981) {
		this.vuosi1981 = vuosi1981;
	}

	public int getVuosi1982() {
		return vuosi1982;
	}

	public void setVuosi1982(int vuosi1982) {
		this.vuosi1982 = vuosi1982;
	}

	public int getVuosi1983() {
		return vuosi1983;
	}

	public void setVuosi1983(int vuosi1983) {
		this.vuosi1983 = vuosi1983;
	}

	public int getVuosi1984() {
		return vuosi1984;
	}

	public void setVuosi1984(int vuosi1984) {
		this.vuosi1984 = vuosi1984;
	}

	public int getVuosi1985() {
		return vuosi1985;
	}

	public void setVuosi1985(int vuosi1985) {
		this.vuosi1985 = vuosi1985;
	}

	public int getVuosi1986() {
		return vuosi1986;
	}

	public void setVuosi1986(int vuosi1986) {
		this.vuosi1986 = vuosi1986;
	}

	public int getVuosi1987() {
		return vuosi1987;
	}

	public void setVuosi1987(int vuosi1987) {
		this.vuosi1987 = vuosi1987;
	}

	public int getVuosi1988() {
		return vuosi1988;
	}

	public void setVuosi1988(int vuosi1988) {
		this.vuosi1988 = vuosi1988;
	}

	public int getVuosi1989() {
		return vuosi1989;
	}

	public void setVuosi1989(int vuosi1989) {
		this.vuosi1989 = vuosi1989;
	}

	public int getVuosi1990() {
		return vuosi1990;
	}

	public void setVuosi1990(int vuosi1990) {
		this.vuosi1990 = vuosi1990;
	}

	public int getVuosi1991() {
		return vuosi1991;
	}

	public void setVuosi1991(int vuosi1991) {
		this.vuosi1991 = vuosi1991;
	}

	public int getVuosi1992() {
		return vuosi1992;
	}

	public void setVuosi1992(int vuosi1992) {
		this.vuosi1992 = vuosi1992;
	}

	public int getVuosi1993() {
		return vuosi1993;
	}

	public void setVuosi1993(int vuosi1993) {
		this.vuosi1993 = vuosi1993;
	}

	public int getVuosi1994() {
		return vuosi1994;
	}

	public void setVuosi1994(int vuosi1994) {
		this.vuosi1994 = vuosi1994;
	}

	public int getVuosi1995() {
		return vuosi1995;
	}

	public void setVuosi1995(int vuosi1995) {
		this.vuosi1995 = vuosi1995;
	}

	public int getVuosi1996() {
		return vuosi1996;
	}

	public void setVuosi1996(int vuosi1996) {
		this.vuosi1996 = vuosi1996;
	}

	public int getVuosi1997() {
		return vuosi1997;
	}

	public void setVuosi1997(int vuosi1997) {
		this.vuosi1997 = vuosi1997;
	}

	public int getVuosi1998() {
		return vuosi1998;
	}

	public void setVuosi1998(int vuosi1998) {
		this.vuosi1998 = vuosi1998;
	}

	public int getVuosi1999() {
		return vuosi1999;
	}

	public void setVuosi1999(int vuosi1999) {
		this.vuosi1999 = vuosi1999;
	}

	public int getVuosi2000() {
		return vuosi2000;
	}

	public void setVuosi2000(int vuosi2000) {
		this.vuosi2000 = vuosi2000;
	}

	public int getVuosi2001() {
		return vuosi2001;
	}

	public void setVuosi2001(int vuosi2001) {
		this.vuosi2001 = vuosi2001;
	}

	public int getVuosi2002() {
		return vuosi2002;
	}

	public void setVuosi2002(int vuosi2002) {
		this.vuosi2002 = vuosi2002;
	}

	public int getVuosi2003() {
		return vuosi2003;
	}

	public void setVuosi2003(int vuosi2003) {
		this.vuosi2003 = vuosi2003;
	}

	public int getVuosi2004() {
		return vuosi2004;
	}

	public void setVuosi2004(int vuosi2004) {
		this.vuosi2004 = vuosi2004;
	}

	public int getVuosi2005() {
		return vuosi2005;
	}

	public void setVuosi2005(int vuosi2005) {
		this.vuosi2005 = vuosi2005;
	}

	public int getVuosi2006() {
		return vuosi2006;
	}

	public void setVuosi2006(int vuosi2006) {
		this.vuosi2006 = vuosi2006;
	}

	public int getVuosi2007() {
		return vuosi2007;
	}

	public void setVuosi2007(int vuosi2007) {
		this.vuosi2007 = vuosi2007;
	}

	public int getVuosi2008() {
		return vuosi2008;
	}

	public void setVuosi2008(int vuosi2008) {
		this.vuosi2008 = vuosi2008;
	}

	public int getVuosi2009() {
		return vuosi2009;
	}

	public void setVuosi2009(int vuosi2009) {
		this.vuosi2009 = vuosi2009;
	}

	public int getVuosi2010() {
		return vuosi2010;
	}

	public void setVuosi2010(int vuosi2010) {
		this.vuosi2010 = vuosi2010;
	}

	public int getVuosi2011() {
		return vuosi2011;
	}

	public void setVuosi2011(int vuosi2011) {
		this.vuosi2011 = vuosi2011;
	}

	public int getVuosi2012() {
		return vuosi2012;
	}

	public void setVuosi2012(int vuosi2012) {
		this.vuosi2012 = vuosi2012;
	}

	public int getVuosi2013() {
		return vuosi2013;
	}

	public void setVuosi2013(int vuosi2013) {
		this.vuosi2013 = vuosi2013;
	}

	public int getVuosi2014() {
		return vuosi2014;
	}

	public void setVuosi2014(int vuosi2014) {
		this.vuosi2014 = vuosi2014;
	}

	public int getVuosi2015() {
		return vuosi2015;
	}

	public void setVuosi2015(int vuosi2015) {
		this.vuosi2015 = vuosi2015;
	}

	public int getVuosi2016() {
		return vuosi2016;
	}

	public void setVuosi2016(int vuosi2016) {
		this.vuosi2016 = vuosi2016;
	}

	public int getVuosi2017() {
		return vuosi2017;
	}

	public void setVuosi2017(int vuosi2017) {
		this.vuosi2017 = vuosi2017;
	}

	public int getVuosi2018() {
		return vuosi2018;
	}

	public void setVuosi2018(int vuosi2018) {
		this.vuosi2018 = vuosi2018;
	}

	@Override
	public String toString() {
		return "Paasto [paastoid=" + paastoid + ", paastonimi=" + paastonimi + ", vuosi1960=" + vuosi1960
				+ ", vuosi1961=" + vuosi1961 + ", vuosi1962=" + vuosi1962 + ", vuosi1963=" + vuosi1963 + ", vuosi1964="
				+ vuosi1964 + ", vuosi1965=" + vuosi1965 + ", vuosi1966=" + vuosi1966 + ", vuosi1967=" + vuosi1967
				+ ", vuosi1968=" + vuosi1968 + ", vuosi1969=" + vuosi1969 + ", vuosi1970=" + vuosi1970 + ", vuosi1971="
				+ vuosi1971 + ", vuosi1972=" + vuosi1972 + ", vuosi1973=" + vuosi1973 + ", vuosi1974=" + vuosi1974
				+ ", vuosi1975=" + vuosi1975 + ", vuosi1976=" + vuosi1976 + ", vuosi1977=" + vuosi1977 + ", vuosi1978="
				+ vuosi1978 + ", vuosi1979=" + vuosi1979 + ", vuosi1980=" + vuosi1980 + ", vuosi1981=" + vuosi1981
				+ ", vuosi1982=" + vuosi1982 + ", vuosi1983=" + vuosi1983 + ", vuosi1984=" + vuosi1984 + ", vuosi1985="
				+ vuosi1985 + ", vuosi1986=" + vuosi1986 + ", vuosi1987=" + vuosi1987 + ", vuosi1988=" + vuosi1988
				+ ", vuosi1989=" + vuosi1989 + ", vuosi1990=" + vuosi1990 + ", vuosi1991=" + vuosi1991 + ", vuosi1992="
				+ vuosi1992 + ", vuosi1993=" + vuosi1993 + ", vuosi1994=" + vuosi1994 + ", vuosi1995=" + vuosi1995
				+ ", vuosi1996=" + vuosi1996 + ", vuosi1997=" + vuosi1997 + ", vuosi1998=" + vuosi1998 + ", vuosi1999="
				+ vuosi1999 + ", vuosi2000=" + vuosi2000 + ", vuosi2001=" + vuosi2001 + ", vuosi2002=" + vuosi2002
				+ ", vuosi2003=" + vuosi2003 + ", vuosi2004=" + vuosi2004 + ", vuosi2005=" + vuosi2005 + ", vuosi2006="
				+ vuosi2006 + ", vuosi2007=" + vuosi2007 + ", vuosi2008=" + vuosi2008 + ", vuosi2009=" + vuosi2009
				+ ", vuosi2010=" + vuosi2010 + ", vuosi2011=" + vuosi2011 + ", vuosi2012=" + vuosi2012 + ", vuosi2013="
				+ vuosi2013 + ", vuosi2014=" + vuosi2014 + ", vuosi2015=" + vuosi2015 + ", vuosi2016=" + vuosi2016
				+ ", vuosi2017=" + vuosi2017 + ", vuosi2018=" + vuosi2018 + "]";
	}
	
	

}
