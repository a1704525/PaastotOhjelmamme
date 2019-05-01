package Projektitehtava.PaastotOhjelma.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MaaVakiluku {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nimi;
	private int vuosi1960;
	
	public MaaVakiluku() {
		super();
		this.nimi = null;
		this.vuosi1960 = 0; 
	}
	
	public MaaVakiluku(String nimi, int vuosi1960) {
		this.nimi = nimi;
		this.vuosi1960 = vuosi1960;
	}

	public String getNimi() {
		return nimi;
	}

	public int getVuosi1960() {
		return vuosi1960;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setVuosi1960(int vuosi1960) {
		this.vuosi1960 = vuosi1960;
	}

	@Override
	public String toString() {
		return "MaaVakiluku [nimi=" + nimi + ", vuosi1960=" + vuosi1960 + "]";
	}
}
