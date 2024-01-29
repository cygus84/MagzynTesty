package app.logowanie;

public class Uzytkownik {
	private String login;
    private String haslo;

    public Uzytkownik(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }
}
