package app.logowanie;

import java.util.Scanner;

public class ProgramLogowania {

	public ProgramLogowania() {

		SystemLogowania systemLogowania = new SystemLogowania();
		Scanner scanner = new Scanner(System.in);

		boolean zakoncz = false;

		while (!zakoncz) {
			System.out.println("1. Zarejestruj nowego użytkownika");
			System.out.println("2. Zaloguj się");
			System.out.println("0. Zakończ");

			int wybor = scanner.nextInt();
			scanner.nextLine(); // Konsumowanie znaku nowej linii

			switch (wybor) {
			case 1:
				System.out.println("Podaj login:");
				String nowyLogin = scanner.nextLine();
				System.out.println("Podaj hasło:");
				String noweHaslo = scanner.nextLine();
				systemLogowania.zarejestrujUzytkownika(nowyLogin, noweHaslo);
				break;
			case 2:
				System.out.println("Podaj login:");
				String login = scanner.nextLine();
				System.out.println("Podaj hasło:");
				String haslo = scanner.nextLine();
				if (systemLogowania.zalogujUzytkownika(login, haslo)) {
					System.out.println("Zalogowano pomyślnie.");
				} else {
					System.out.println("Błędny login lub hasło. Spróbuj ponownie.");
				}
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
