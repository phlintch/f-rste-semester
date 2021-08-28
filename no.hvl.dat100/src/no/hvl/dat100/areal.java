package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class areal {
	public static void main(String[] args) {
		int lengde = Integer.parseInt(showInputDialog("Lengde: "));
		int bredde = Integer.parseInt(showInputDialog("Bredde: "));
		showMessageDialog(null, "areal = " + lengde*bredde + " cm²");
		
	}
}
