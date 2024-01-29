package app.star;

import java.util.Scanner;

import app.logowanie.ProgramLogowania;
import app.produkty.Magazyn;

public class Start {

	public static void main(String[] args) {
		System.out.println("Magazyn testy000");
		
		ProgramLogowania logowanie = new ProgramLogowania();
		
		Magazyn magazyn = new Magazyn();
		Scanner scanner = new Scanner(System.in);

		boolean zakoncz = false;

		while (!zakoncz) {
			System.out.println("1. Dodaj produkt");
			System.out.println("2. Wyświetl produkty");
			System.out.println("3. Zmień ilość produktu");
			System.out.println("0. Zakończ");

			int wybor = scanner.nextInt();

			switch (wybor) {
			case 1:
				System.out.println("Podaj nazwę produktu:");
				String nazwa = scanner.next();
				System.out.println("Podaj ilość produktu:");
				int ilosc = scanner.nextInt();
				System.out.println("Podaj lokaloizacja produktu:");
				String lokalizacja = scanner.next();
				magazyn.dodajProdukt(nazwa, ilosc, lokalizacja);
				break;
			case 2:
				magazyn.wyswietlProdukty();
				break;
			case 3:
				System.out.println("Podaj nazwę produktu:");
				String nazwaProduktu = scanner.next();
				System.out.println("Podaj nową ilość produktu:");
				int nowaIlosc = scanner.nextInt();
				magazyn.zmienIlosc(nazwaProduktu, nowaIlosc);
				break;
			case 0:
				zakoncz = true;
				break;
			default:
				System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
				break;
			}
		}
	}
}
