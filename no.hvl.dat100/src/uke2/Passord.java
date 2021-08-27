package uke2;

import static javax.swing.JOptionPane.*;

public class Passord {
	static String godkjentB = "Magnus";
	static String godkjentP = "Sandra98";
	static boolean godkjentInn = false;
	public static boolean loggInn () {
		for(int i = 3; i >= 0; i--) {
			String inputB = showInputDialog("skriv ditt brukernavn her: ");
			String inputP = showInputDialog("skriv ditt passord her: ");
			if (!inputB.equals(godkjentB) || !inputP.equals(godkjentP)) {
				showMessageDialog(null, "feil, " + (i-1) + " gjennstående forsøk.");
			} else if (inputB.equals(godkjentB) && inputP.equals(godkjentP)) {
				showMessageDialog(null, "Du er logget inn med " + i + " forsøk igjen!");
				return true;
			}
		}
		return false;
	}
	public static void main (String[] args) {
		loggInn();
		
	}
}
