package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv, skracenica;
	private double kursP, kursS, kursK;
	private GregorianCalendar datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	public double getKursP() {
		return kursP;
	}
	public void setKursP(double kursP) {
		this.kursP = kursP;
	}
	public double getKursS() {
		return kursS;
	}
	public void setKursS(double kursS) {
		this.kursS = kursS;
	}
	public double getKursK() {
		return kursK;
	}
	public void setKursK(double kursK) {
		this.kursK = kursK;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
	
}
