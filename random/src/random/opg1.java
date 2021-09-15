package random;

public class opg1 {
	public static void Oppgave1a(int a) {
		if (a == 0) {
			System.out.println("A er " + a);
		} else if (a > 0) {
			System.out.println("A er større enn 0");
		} else {
			System.out.println("A er mindre enn 0");
		}
	}

	public static void Oppgave1b(int a) {
		if (a >= 5 && a <= 8) {
			System.out.println(a + " er innenfor intervallet");
		} else {
			System.out.println(a + " er utenfor intervallet");
		}
	}

	public static String Oppgave1c(int a) {
		String retur = "";
		switch (a) {
		case 0:
			retur = "null";
			return retur;
			
		case 1:
			retur = "en";
			return retur;
		case 2:
			retur = "to";
			return retur;
		case 3:
			retur = "tre";
			return retur;
		case 4:
			retur = "fire";
			return retur;
		default:
			retur= "ulovlig verdi";
			return retur;
		
		}
	}

	public static void main(String[] args) {
		Oppgave1a(0);
		Oppgave1a(1);
		Oppgave1a(-1);
		System.out.println();
		Oppgave1b(3);
		Oppgave1b(6);
		Oppgave1b(9);
		System.out.println();
		System.out.println(Oppgave1c(0));
		System.out.println(Oppgave1c(1));
		System.out.println(Oppgave1c(2));
		System.out.println(Oppgave1c(3));
		System.out.println(Oppgave1c(4));
		System.out.println(Oppgave1c(5));
		System.out.println();
	}

}
