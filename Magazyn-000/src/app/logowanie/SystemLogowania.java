package app.logowanie;

import java.util.HashMap;
import java.util.Map;

public class SystemLogowania {

	private Map<String, Uzytkownik> uzytkownicy = new HashMap<>();

    public void zarejestrujUzytkownika(String login, String haslo) {
        Uzytkownik uzytkownik = new Uzytkownik(login, haslo);
        uzytkownicy.put(login, uzytkownik);
        System.out.println("Użytkownik zarejestrowany pomyślnie.");
    }

    public boolean zalogujUzytkownika(String login, String haslo) {
        if (uzytkownicy.containsKey(login)) {
            Uzytkownik uzytkownik = uzytkownicy.get(login);
            return uzytkownik.getHaslo().equals(haslo);
        }
        return false;
    }
}
