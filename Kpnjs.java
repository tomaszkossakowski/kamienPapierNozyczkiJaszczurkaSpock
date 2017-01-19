package kpnjs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import static kpnjs.PorownanieWyborow.porownanieWyborow;

public class Kpnjs {

	final static int OPCJE = 5, KAMIEN = 1, PAPIER = 2, NOZYCE = 3, JASZCZURKA = 4, SPOCK = 5;
	final static int ZASADY = 6;
	final static int GRACZKOMPUTEROWY = 1, GRACZ = 2, REMIS = 3;
	static int wyborkomputera, zwyciezca = 0;
	static int wygrane = 0, przegrane = 0, remisy = 0;
	static int gracz = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Gra: Papier, Kamien, Nozyczki, Jaszczurka, Spock");

		System.out.println(
				"\nWybierz: \n1 - Kamieñ \n2 - Papier \n3 - Nozyczki \n4 - Jaszczurka \n5 - Spock \n\n6 - Zasady");

		do {
			wyborkomputera = (int) (Math.random() * OPCJE) + 1;

			String wybor = odczyt.readLine();
			int gracz = 0;
			if (wybor.length() == 1 && Character.isDigit(wybor.charAt(0))) {
				gracz = Integer.parseInt(wybor);
			} else {
				System.out.println("mo¿esz wybraæ cyfre od 1 do 6");
			}

			switch (gracz) {
			case KAMIEN:
				System.out.println("Wybra³eœ: Kamien.");
				break;
			case PAPIER:
				System.out.println("Wybra³eœ: Papier.");
				break;
			case NOZYCE:
				System.out.println("Wybra³eœ: Nozyczki.");
				break;
			case JASZCZURKA:
				System.out.println("Wybra³eœ: Jaszczurke.");
				break;
			case SPOCK:
				System.out.println("Wybra³eœ: Spocka.");
				break;
			case ZASADY:
				System.out.println("Zasady gry:");
				break;
			// default:
			// System.out.printf("mo¿esz wybraæ tylko cyfrê od 1 do 6");
			}
			if (gracz == ZASADY) {
				System.out.println(
						"\nkamieñ têpi no¿yce, \nno¿yce tn¹ papier, \npapier zakrywa kamieñ, \nkamieñ zgniata jaszczurkê, \njaszczurka otruwa Spocka, \nSpock niszczy no¿yce, \nno¿yce dekapituj¹ jaszczurkê, \njaszczurka zjada papier, \npapier obala istnienie Spocka, \nSpock dezintegruje kamieñ.");
			} else if (gracz == 0) {
				System.out.printf("spróbuj jeszcze raz");

			} else {
				System.out.print("Wybor komputera: ");

				kpnjs.PorownanieWyborow.porownanieWyborow();

				kpnjs.KtoWygral.ktoWygral();

			}

		} while ((wygrane != 3) && (przegrane != 3));

		if (wygrane >= 3) {
			System.out.println("Gratuluje wygra³eœ " + wygrane + " do " + przegrane + ". \nRemisy = " + remisy);
		} else if (przegrane >= 3) {
			System.out.println("Niestety przegra³eœ " + wygrane + " do " + przegrane + ". \nRemisy = " + remisy);
		}

	}

}