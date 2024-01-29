package app.sledzenieRuchu;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AplikacjZapisuRuchu {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PLIK_LOGOWY, true))) {
            boolean zakoncz = false;

            while (!zakoncz) {
                System.out.println("Wprowadź ruch:");
                String ruch = scanner.nextLine();

                if ("exit".equalsIgnoreCase(ruch)) {
                    zakoncz = true;
                } else {
                    zapiszDoPliku(getTimestamp() + " - " + ruch, writer);
                    System.out.println("Ruch zapisany.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zapiszDoPliku(String linia, BufferedWriter writer) throws IOException {
        writer.write(linia);
        writer.newLine();
    }

    private static String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
	
}
