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
	private int paastot;
	private int vakiluku;
	
	public Maa() {
		super();
		this.nimi = null;
		this.vuosi = 0;
		this.paastot = 0;
		this.vakiluku = 0;
	}
	
	public Maa(String nimi, int vuosi, int paastot, int vakiluku) {
		super();
		this.nimi = nimi;
		this.vuosi = vuosi;
		this.paastot = paastot;
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

	public int getPaastot() {
		return paastot;
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

	public void setPaastot(int paastot) {
		this.paastot = paastot;
	}

	public void setVakiluku(int vakiluku) {
		this.vakiluku = vakiluku;
	}
	
	// Laskee päästöjen määrän per asukas
	public int getPaastotPerAsukas(int paastot, int vakiluku) {
		return paastot / vakiluku;
	}
	 
	@Override
	public String toString() {
		return "Maa [id=" + id + ", nimi=" + nimi + ", vuosi=" + vuosi + ", paastot=" + paastot + ", vakiluku="
				+ vakiluku + "]";
	}
}
