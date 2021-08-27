package problab6;

import java.util.Arrays;

public class Oppgave3 {
	public static boolean erLik2(int[][] a, int[][] b) {	// Sjekker tabell id
		return Arrays.equals(a, b);
	}
	public static boolean erLik(int[][] a, int[][] b) {		// Sjekker om verdiene i tabellene er like på samme plasser.
		if (a.length == b.length) {
			for (int j = 0; j < a.length;j++) {
				for (int i = 0; i < a[j].length;) {
					if (a[j][i] == b[j][i]) {
						i++;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static int[][] skaler(int tall, int[][] matrise) { // ganger innholdet i hver index med tall variablen
		int[][] x= matrise;
		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise[j].length; i++) {
				x[j][i] = matrise[j][i] * tall;
				
			}
		}
		return x;
	}

	public static String tilStreng(int[][] matrise) {
		String x = "";
		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise[j].length; i++) {
				if (i < matrise[j].length - 1) {
					x += matrise[j][i] + " ";
				} else {
					x += matrise[j][i] + "\n";
				}
			}
		}
		return x;
	}

	public static void skrivUtv1(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j == 0) {
					System.out.print(matrise[i][j]);
				} else {
					System.out.print(", " + matrise[i][j]);
				}
			}
			System.out.print("\n");
		}

	}
	public static int search (int[][] x, int y ) {	// tester bare arrays metoder
		for (int i = 0; i < x.length-1; i++)  {
			Arrays.sort(x[i]);
			if (Arrays.binarySearch(x[i], y) > -1) {
				return Arrays.binarySearch(x[i], y);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 12, 32, 43 }, { 14, 65, 66 }, { 27, 38, 91 } };
		int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(erLik(c, d));
		System.out.println(erLik2(c, c));
		skrivUtv1(a);

		System.out.println(tilStreng(skaler(2, a)));
		System.out.println(erLik(a, b));
		System.out.println(search(d, 11));
		
	}
}
