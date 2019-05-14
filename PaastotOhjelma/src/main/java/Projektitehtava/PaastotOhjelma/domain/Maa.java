package Projektitehtava.PaastotOhjelma.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nimi;
	private int vuosi;
	private int paasto;
	private int vakiluku;
	
	public Maa() {
		super();
		this.nimi = null;
		this.vuosi = 0;
		this.paasto = 0;
		this.vakiluku = 0;
	}
	
	public Maa(String nimi, int vuosi, int paasto, int vakiluku) {
		super();
		this.nimi = nimi;
		this.vuosi = vuosi;
		this.paasto = paasto;
		this.vakiluku = vakiluku;
	}

	public Long getId() {
		return id;
	}

	public String getNimi() {
		return nimi;
	}

	public int getVuosi() {
		return vuosi;
	}

	public int getPaasto() {
		return paasto;
	}

	public int getVakiluku() {
		return vakiluku;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	public void setPaasto(int paasto) {
		this.paasto = paasto;
	}

	public void setVakiluku(int vakiluku) {
		this.vakiluku = vakiluku;
	}
	
	// Laskee päästöjen määrän per asukas
	public double getPaastoPerAsukas() {
		double paasto = (double) this.paasto / this.vakiluku;
		
		return paasto;
	}
	
	 
	@Override
	public String toString() {
		return "Maa [id=" + id + ", nimi=" + nimi + ", vuosi=" + vuosi + ", paasto=" + paasto + ", vakiluku="
				+ vakiluku + "]";
	}
}
