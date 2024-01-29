package app.produkty;

import java.util.HashMap;
import java.util.Map;

public class Magazyn {
	
	private Map<String, Produkt> produkty = new HashMap<>();

	public void dodajProdukt(String nazwa, int ilosc, String lokalizacja) {
		Produkt produkt = new Produkt(nazwa, ilosc, lokalizacja);
		produkty.put(lokalizacja, produkt);
	}
	
	public void wyswietlProdukty() {
		System.out.println("Produkt w magazynie:");
		for(Produkt produkt : produkty.values()) {
			System.out.println(produkt.getNazwa() +
					"Ilosc: " + produkt.getIlosc() + 
					"lokalizacja:" + produkt.getLokalizacja());			
		}
	}
	
	public void zmienIlosc(String nazwa, int nowaIlosc) {
		if(produkty.containsKey(nazwa)) {
			Produkt produkt = produkty.get(nazwa);
			produkt.setIlosc(nowaIlosc);
			System.out.println("Zmieniono ilosc produktu:" + 
			produkt.getNazwa() +"na" + nowaIlosc);
		}
	}
}
