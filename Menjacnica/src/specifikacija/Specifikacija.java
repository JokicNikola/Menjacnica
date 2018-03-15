package specifikacija;

import java.util.GregorianCalendar;

public interface Specifikacija {

	public void dodajKurs(String naziv, double kursS, double kursP, double kursK, GregorianCalendar datum);
	
	public void izbrisiKurs(String naziv, GregorianCalendar datum);
	
	public String vratiKurs (String naziv, GregorianCalendar datum);
}
