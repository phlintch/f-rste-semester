package Oppgaver;

public class opg4 {

	private static int[][] data = { { 1, 2, 0 , 0}, { 3, 4,2, 0}, { 5, 6,3, 0 }, { 0, 0,0, 0 } };

	public static void skrivUt() {

		int j = data.length;

		System.out.println("-------");

		for (int i = 0; i < j; i++) {
			for (int x : data[i]) {
				System.out.print(x + " ");
			}
			System.out.print("\n");
		}

		System.out.println("-------");
	}

	public static void beregnSum() {
		int sumRad = 0;
		int sumKol = 0;
		int kolTeller = 0;
		int radTeller = 0;
		for (int j = 0; j < data.length; j++) {
			for (int i = 0; i < data[j].length; i++) {
				sumRad += data[j][i];
				radTeller++;
				if (i+1 == data[j].length) {
					data[j][i] = sumRad;
					sumRad = 0;
				}
			}
			kolTeller++;
			
		}
		for (int x = 0; x < data[0].length; x++) {
			for (int z = 0; z < data.length; z++) {
				sumKol += data[z][x];
				if (z+1 == data.length) {
					data[z][x] = sumKol;
					sumKol = 0;
				}
			}
		}

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
