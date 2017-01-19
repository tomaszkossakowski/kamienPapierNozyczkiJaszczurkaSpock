package kpnjs;

public class KtoWygral extends Kpnjs {

	public static void ktoWygral() {

		if (zwyciezca == GRACZKOMPUTEROWY) {
			System.out.println();
			System.out.println("Komputer wygral!\n");
			przegrane++;
		} else if (zwyciezca == GRACZ) {
			System.out.println();
			System.out.println("Wygrales!");
			wygrane++;
		} else {
			System.out.println();
			System.out.println("Remis!");
			remisy++;
		}

	}

}