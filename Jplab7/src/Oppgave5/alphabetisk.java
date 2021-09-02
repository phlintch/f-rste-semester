package Oppgave5;

import javax.swing.JOptionPane;

public class alphabetisk {
	public static String alph (String[] tab) {
		String temp = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (temp.compareTo(tab[i]) > 0) {
				temp = tab[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String brukerIn = JOptionPane.showInputDialog("Skriv din melding her: ");
		String[] retur = brukerIn.split(" ");
		System.out.println(alph(retur));
		// skjønner ikkje helt jplab7 opg 5.f
	}
}
