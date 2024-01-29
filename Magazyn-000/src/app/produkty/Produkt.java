package app.produkty;

public class Produkt {

	private String name;
	private int ilosc;
	private String lokalizacja;
	
	
	public Produkt(String name, int ilosc, String lokalizacja) {
		this.name = name;
		this.ilosc = ilosc;
		this.lokalizacja = lokalizacja;
	}


	public String getNazwa() {
		return name;
	}


	public int getIlosc() {
		return ilosc;
	}


	public String getLokalizacja() {
		return lokalizacja;
	}
	
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	
}
