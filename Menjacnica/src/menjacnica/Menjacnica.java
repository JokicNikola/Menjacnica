package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacija.Specifikacija;

public class Menjacnica implements Specifikacija {

	private LinkedList<Valuta> lista = new LinkedList<Valuta>();

	
	public void dodajKurs(String naziv, double kursS, double kursP, double kursK, GregorianCalendar datum) {

		for(int i=0; i<lista.size(); i++)
			if(lista.get(i).equals(naziv) && datum!=null) {
				lista.get(i).setKursK(kursK);
				lista.get(i).setKursP(kursP);
				lista.get(i).setKursS(kursS);
				lista.get(i).setDatum(datum);
				System.out.println("Kurs je dodat");
			}
	}



	public void izbrisiKurs(String naziv, GregorianCalendar datum) {

		for(int i=0; i<lista.size(); i++)
			if(lista.get(i).equals(naziv)) {
				lista.get(i).setKursK(0);
				lista.get(i).setKursP(0);
				lista.get(i).setKursS(0);
				System.out.println("Kurs je izbrisan");
			}

		
	}

	
	public String vratiKurs(String naziv, GregorianCalendar datum) {

		for(int i=0; i<lista.size(); i++)
			if(lista.get(i).equals(naziv) && lista.get(i).getDatum().equals(datum))
				return lista.get(i).toString();

		
		return null;
	}
	
}
