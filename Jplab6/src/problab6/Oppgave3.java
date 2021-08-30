package problab6;

import java.util.Arrays;

public class Oppgave3 {
	public static boolean erLik2(int[][] a, int[][] b) { // Sjekker tabell id
		return Arrays.equals(a, b);
	}

	public static boolean erLik(int[][] a, int[][] b) { // Sjekker om verdiene i tabellene er like på samme plasser.
		if (a.length == b.length) {
			for (int j = 0; j < a.length; j++) {
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
		int[][] x = matrise;
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

	public static int search(int[][] x, int y) { // tester bare arrays metoder
		for (int i = 0; i < x.length - 1; i++) {
			Arrays.sort(x[i]);
			if (Arrays.binarySearch(x[i], y) > -1) {
				return Arrays.binarySearch(x[i], y);
			}
		}
		return -1;
	}

	public static int[] slettAlt(int[] matrise) {
		for (int j = 0; j < matrise.length; j++) {
			matrise[j] = 0;
		}
		return matrise;
	}

	public static int[] speileRad(int[] matrise) {
		int teller = matrise.length - 1;
		int[] returTab = new int[teller + 1];
		for (int i = 0; i < matrise.length; i++) {
			returTab[teller] = matrise[i];
			teller--;
		}
		return returTab;
	}

	public static int[][] speile(int[][] matrise) {
		int[][] returTab = matrise;
		for (int i = 0; i < matrise.length; i++) {
			returTab[i] = speileRad(matrise[i]);
		}
		return returTab;
	}

	public static int[][] multipliser1(int[][] mat1, int[][] mat2) {

		int nyTabLengde = Math.min(mat1.length, mat2.length);
		int[][] returTab = new int[nyTabLengde][nyTabLengde];
		int x = 0;
		int y = 0;
		int teller = 0;
		for (int a = 0; a < Math.min(mat1.length, mat2.length); a++) {
			for (int a1 = 0; a1 < Math.min(mat1.length, mat2.length); a1++) {
				for (int b = 0; b < Math.max(mat1.length, mat2.length); b++) {
					teller += mat1[a][b] * mat2[b][a1];
				}

				returTab[x][y] = teller;
				y++;
				teller = 0;
			}

			y = 0;
			x++;
		}
		return returTab;
	}

	public static void main(String[] args) {

		int[][] multi1TestA = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] multi1TestB = { { 4, 5 }, { 3, 7 }, { 4, 1 } };

		int[][] y = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] b = { { 12, 32, 43 }, { 14, 65, 66 }, { 27, 38, 91 } };

		int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(erLik(c, d));
		System.out.println(erLik2(c, c));
		skrivUtv1(a);

		System.out.println(tilStreng(skaler(2, a)));
		System.out.println(erLik(a, b));
		System.out.println(search(d, 11));
		System.out.println(tilStreng(speile(d)));
		System.out.println(tilStreng(multipliser1(multi1TestA, multi1TestB)));
	}
}
