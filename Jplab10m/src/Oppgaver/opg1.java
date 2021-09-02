package Oppgaver;

public class opg1 {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3, 4, 5, 6 };

		// skriv ut
		System.out.print("[ ");

		for (int x : tab) {
			System.out.print(x + " ");
		}

		System.out.println("]");

		// oppdater
		int i = 0;
		for (int x : tab) {
			tab[i] += 1;
			i++;
		}

		// skriv ut
		System.out.print("[ ");

		for (int x : tab) {
			System.out.print(x + " ");
		}

		System.out.println("]");
	}

}
