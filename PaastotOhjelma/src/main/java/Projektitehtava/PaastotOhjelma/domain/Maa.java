package Projektitehtava.PaastotOhjelma.domain;

public class Maa {
	private String nimi;
	
	public Maa(String nimi) {
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "Maa [nimi=" + nimi + "]";
	}
		
}

