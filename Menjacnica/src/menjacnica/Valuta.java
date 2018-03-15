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
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kursK);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(kursP);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(kursS);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kursK) != Double.doubleToLongBits(other.kursK))
			return false;
		if (Double.doubleToLongBits(kursP) != Double.doubleToLongBits(other.kursP))
			return false;
		if (Double.doubleToLongBits(kursS) != Double.doubleToLongBits(other.kursS))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + ", kursP=" + kursP + ", kursS=" + kursS
				+ ", kursK=" + kursK + ", datum=" + datum + "]";
	}
	
	
	
}
