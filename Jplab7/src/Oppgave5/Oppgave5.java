package Oppgave5;

import javax.swing.JOptionPane;

public class Oppgave5 {
	public static void baklengs(String a) {
		int b = a.length();
		String retur = "";
	
		for (int i = b-1; i >= 0; i--) {
			retur += a.charAt(i);
		}
		System.out.println(retur);
	
	}
	public static void skrivUt(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].length() == 1) {
				System.out.println(tab[i]);
			} else if (tab[i].length()%2 == 0) {
				int x = (tab[i].length())/2-1;
				char a = tab[i].charAt(x);
				char b = tab[i].charAt(x+1);
				System.out.println(a+""+b);
			} else {
				int x = (tab[i].length()/2);
				char c = tab[i].charAt(x-1);
				char a = tab[i].charAt(x);
				char b = tab[i].charAt(x+1);
				System.out.println(c+""+a+""+b);
				
			}
		}
	}
	public static void main(String[] args) {
		String brukerIn = JOptionPane.showInputDialog("Skriv din melding her: ");
		String[] retur = brukerIn.split(" ");
		for (int i = 0; i < retur.length; i++) {
			System.out.println(retur[i]);
		}
		String mønster = JOptionPane.showInputDialog("Skriv et mønster: ");
		int teller = 0;
		for (String ord:retur) {
			if (ord.contains(mønster)) {
				teller++;
			}
		}
		System.out.println(mønster + " befinner seg i " + teller+ " av ordene i tabellen");
	
		skrivUt(retur);
	}
}
