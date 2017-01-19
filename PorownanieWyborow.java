package kpnjs;

public class PorownanieWyborow extends Kpnjs {

	public static void porownanieWyborow() {
		switch (wyborkomputera) {
		case KAMIEN:
			System.out.println("Kamien.");
			if (gracz == NOZYCE) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == PAPIER) {
				zwyciezca = GRACZ;
			} else if (gracz == JASZCZURKA) {
				zwyciezca = GRACZ;
			} else if (gracz == SPOCK) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else {
				zwyciezca = REMIS;
			}
			break;
		case PAPIER:
			System.out.println("Papier.");
			if (gracz == KAMIEN) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == NOZYCE) {
				zwyciezca = GRACZ;
			} else if (gracz == JASZCZURKA) {
				zwyciezca = GRACZ;
			} else if (gracz == SPOCK) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else {
				zwyciezca = REMIS;
			}
			break;
		case NOZYCE:
			System.out.println("Nozyczki.");
			if (gracz == PAPIER) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == KAMIEN) {
				zwyciezca = GRACZ;
			} else if (gracz == JASZCZURKA) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == SPOCK) {
				zwyciezca = GRACZ;
			} else {
				zwyciezca = REMIS;
			}
			break;
		case JASZCZURKA:
			System.out.println("Jaszczurka.");
			if (gracz == PAPIER) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == KAMIEN) {
				zwyciezca = GRACZ;
			} else if (gracz == NOZYCE) {
				zwyciezca = GRACZ;
			} else if (gracz == SPOCK) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else {
				zwyciezca = REMIS;
			}
			break;
		case SPOCK:
			System.out.println("Spock.");
			if (gracz == PAPIER) {
				zwyciezca = GRACZ;
			} else if (gracz == KAMIEN) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == NOZYCE) {
				zwyciezca = GRACZKOMPUTEROWY;
			} else if (gracz == JASZCZURKA) {
				zwyciezca = GRACZ;
			} else {
				zwyciezca = REMIS;
			}
			break;
		}

	}

}