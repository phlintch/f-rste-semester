package problab6;

public class Oppgave1 {
	public static int ledige(boolean[][] tab) {
		int teller = 0;
		for (int j = 0; j < tab.length; j++) {

			for (int i = 0; i < tab[j].length; i++) {
				if (tab[j][i] == true) {
					teller++;
				}
			}
		}
		return teller;
	}

	public static int antallPlasser(boolean[][] tab) {
		int teller = 0;
		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab[j].length; i++) {
				teller++;
			}
		}
		return teller;
	}

	public static String forsteLedig(boolean[][] tab) {
		String retur = "Ingen ledige";
		for (int j = 0; j < tab.length; j++) {

			for (int i = 0; i < tab[j].length; i++) {
				if (tab[j][i] == false) {
					retur = "rad: " + j + " plass: " + i;
					return retur;
				}
			}
		}
		return retur;
	}

	public static boolean erLedig(boolean[][] tab) {
		for (int j = 0; j < tab.length; j++) {

			for (int i = 0; i < tab[j].length; i++) {
				if (tab[j][i] == false) {
					return true;
				}
			}
		}
		return false;
	}

	public static double prosentPlasser(boolean[][] tab) {
		double pros = ((double) ledige(tab) / (double) antallPlasser(tab)) * 100;
		return (Math.round(pros) * 100) / 100;
	}

	// sjekk om det er minst 2 ledige plasser.
	// den sjekker om det er 2 ledige plasser til siden og at 1 plass bak den tatte
	// plassen ikkje er tatt
	public static boolean smitte(boolean[][] tab) {
		for (int j = 0; j < tab.length - 1; j++) {
			for (int i = 0; i < tab[j].length - 1; i++) {
				if (tab[j][i]) {
					if (j == 0) {
						if (tab[j + 1][i]) {
							return false;
						}
					} else if (j > 0 || j < tab.length - 1) {
						if (tab[j - 1][i] || tab[j + 1][i]) {
							return false;
						}
					} else if (j == tab.length - 1) {
						if (tab[j - 1][i]) {
							return false;
						}

					}
				}
				if (tab[j][i]) {
					if (i >= 2 || i >= tab[j].length - 2) {
						if (tab[j][i - 1] || tab[j][i - 2] || tab[j][i + 1] || tab[j][i + 2]) {
							return false;
						} else if (i == 0 || i == 1) {
							if (i == 0 || tab[j][i + 1] || tab[j][i + 2]) {
								return false;
							} else if (i == 1) {
								if (tab[j][i - 1] || tab[j][i + 1] || tab[j][i + 2]) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		boolean[][] aud = { { true, false, false, true, false, false }, // rad 0
				{ false, true, false, false, false, true }, // rad 1
				{ true, false, false, true, false, false }, // rad 2
				{ false, true, false, false, false, true }, // rad 3
		};
		// Det er antatt at false i denne tabellen betyr at den ikkje er tatt
		// altså at true er plasser som ikkje e ledig, og false er ledige plasser
		System.out.print(ledige(aud) + " av ");
		System.out.println(antallPlasser(aud) + " ledige plasser");
		System.out.println("**************************");
		System.out.println(prosentPlasser(aud) + "% av plasser er ledige");
		System.out.println("**************************");
		System.out.println(forsteLedig(aud));
		System.out.println("**************************");
		System.out.println(erLedig(aud));
		System.out.println("**************************");
		System.out.println(smitte(aud));
		System.out.println("**************************");

	}
}
