package Oppgave5;

public class oppgave6 {
	public static void skrivUt (String[][] tab) throws ArrayIndexOutOfBoundsException {
		int i = 0;
		int j = 0;
		int radLengde = tab.length;
		int kolLengde = tab[i].length;
		boolean ferdig = false;
		while (!ferdig) {
			if (j <= kolLengde && i < radLengde) {
				System.out.print(tab[i][j] + " ");
				j++;
				if (j == kolLengde) {
					j = 0;
					i++;
					System.out.print("\n");
				} 
			} else {
				ferdig = true;
			}
		}
	}
	public static void main(String[] args) {
		String[][] test = {{"hei", "jeg", "heter"},{"magnus", "og","dette"},{"er", "en", "test"}};
		skrivUt(test);
	}
}
